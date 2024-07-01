import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Serpiente extends JPanel{
    
    Color colorserp =Color.BLUE;
    Color colorcomida = Color.GREEN;
    int tammax, tam, can, res;
    List<int[]> snake = new ArrayList<>();
    int[] comida = new int[2];
    String direccion = "r";
    String direccion2 = "r";
    static int count = 1;
    
    Thread hilo;
    Caminante camino;
    Ventana df;
    
    public Serpiente(int tammax, int can){
        
        this.tammax=tammax;
        this.can=can;
        this.tam=tammax/can;
        this.res=tammax%can;
        int[] a={can/2-1, can/2-1};
        snake.add(a);
        comida();
        
        camino=new Caminante(this);
        hilo = new Thread(camino);
        
    }
    
    @Override
    public void paint(Graphics pintor){
        
        super.paint(pintor);
        pintor.setColor(colorserp);
        for (int i = 0; i < snake.size(); i++) {
            pintor.fillRect(res/2+snake.get(i)[0]*tam, res/2+snake.get(i)[1]*tam, tam-1, tam-1);
        }
        
        pintor.setColor(colorcomida);
        for (int i = 0; i < snake.size(); i++) {
            pintor.fillRect(res/2+comida[0]*tam, res/2+comida[1]*tam, tam-1, tam-1);
        }
        
    }
    
    public void avanzar(){
        
        direccionIgual();
        int[] ultimo = snake.get(snake.size()-1);
        int x=0;
        int y=0;
        boolean existe = false;
        switch(direccion){
            case "r":
                x=1;
                break;
            case "l":
                x=-1;
                break;
            case "u":
                y=-1;
                break;
            case "d":
                y=1;
                break;
        }
        
        int[] nuevo={ultimo[0]+x,ultimo[1]+y};
        //int[] nuevo={Math.floorMod(ultimo[0]+x,can),Math.floorMod(ultimo[1]+y,can)};
        for (int i = 0; i < snake.size(); i++) {
            if(nuevo[0]==snake.get(i)[0]&&nuevo[1]==snake.get(i)[1]){
                existe=true;
                break;
            }
        }
        
        if(existe){
            df.t.stop();
            camino.parar();
            JOptionPane.showMessageDialog(this, "Has perdido","Advertencia", JOptionPane.WARNING_MESSAGE);
            ReporteHTML html = new ReporteHTML();
            html.HTML();
        }else{
            if(nuevo[0]==comida[0]&&nuevo[1]==comida[1]){
                snake.add(nuevo);
                count++;
                switch (df.dificultad) {
                    case 0:
                        camino.velocidad=(int) (camino.velocidad*(1-0.03));
                        break;
                    case 1:
                        camino.velocidad=(int) (camino.velocidad*(1-0.06));
                        break;
                    case 2:
                        camino.velocidad=(int) (camino.velocidad*(1-0.09));
                        break;
                }
                
                if(snake.size()>25){
                    df.t.stop();
                    camino.parar();
                    JOptionPane.showMessageDialog(this, "La serpiente ha alcanzado su tamaño máximo","Informacion", JOptionPane.INFORMATION_MESSAGE);
                    ReporteHTML html = new ReporteHTML();
                    html.HTML();
                }
                
                comida();
            }else{
                snake.add(nuevo);
                snake.remove(0);
            }
        }

        if(nuevo[0]+x==11){
            df.t.stop();
            camino.parar();
            JOptionPane.showMessageDialog(this, "Has perdido","Advertencia", JOptionPane.WARNING_MESSAGE);
            ReporteHTML html = new ReporteHTML();
            html.HTML();
        }else if(nuevo[0]+x<=-2){
            df.t.stop();
            camino.parar();
            JOptionPane.showMessageDialog(this, "Has perdido","Advertencia", JOptionPane.WARNING_MESSAGE);
            ReporteHTML html = new ReporteHTML();
            html.HTML();
        }
        
        if(nuevo[1]+y==11){
            df.t.stop();
            camino.parar();
            JOptionPane.showMessageDialog(this, "Has perdido","Advertencia", JOptionPane.WARNING_MESSAGE);
            ReporteHTML html = new ReporteHTML();
            html.HTML();
        }else if(nuevo[1]+y<=-2){
            df.t.stop();
            camino.parar();
            JOptionPane.showMessageDialog(this, "Has perdido","Advertencia", JOptionPane.WARNING_MESSAGE);
            ReporteHTML html = new ReporteHTML();
            html.HTML();
        }
        
    }
    
    public void comida(){
        
        boolean existe = false;
        int a = (int)(Math.random()*can);
        int b = (int)(Math.random()*can);
        for (int i = 0; i < snake.size(); i++) {
            if(snake.get(i)[0]==a&&snake.get(i)[1]==b){
                existe = true;
                comida();
                break;
            }
        }
        
        if(!existe){
            this.comida[0]=a;
            this.comida[1]=b;
        }
        
    }
    
    public void direccion2(String dir){
        
        if((this.direccion.equals("r")||this.direccion.equals("l"))&&(dir.equals("u")||dir.equals("d"))){
            this.direccion2=dir;
        }
        
        if((this.direccion.equals("u")||this.direccion.equals("d"))&&(dir.equals("r")||dir.equals("l"))){
            this.direccion2=dir;
        }
    
    }
    
    public void direccionIgual(){
        
        this.direccion=this.direccion2;
        
    }
    
    public void reiniciar(){
        
        snake.clear();
        int[] a ={can/2-1,can/2};
        
        snake.add(a);
        comida();
        
        camino=new Caminante(this);
        hilo=new Thread(camino);
        
        
        
        
    }
    
    
}