import java.util.logging.Level;
import java.util.logging.Logger;


public class Caminante implements Runnable {
    
    Serpiente panel;
    Ventana vt;
    static boolean bandera = true;
    static int velocidad = 1000;
    
    public Caminante(Serpiente panel){
        
        this.panel=panel;
        this.velocidad=velocidad;
                
    }

    @Override
    public void run() {
        
        while(this.bandera){
            panel.avanzar();
            panel.repaint();
            
            String cnt = Integer.toString(panel.count);
            vt.lbl_tamaño.setText(cnt);
            
            String vel = Integer.toString(velocidad);
            vt.lbl_velocidad.setText(vel);
            try {
                Thread.sleep(this.velocidad);
            }catch (InterruptedException e) {
                Logger.getLogger(Caminante.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        
    }
    
    public void parar(){
    
        this.bandera=false;
            
    }
    
    public void seguir(){
        
        this.bandera=true;
        
    }
        
    
}