import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class Fondo extends JPanel{
    
    Color colorfondo =Color.GRAY;
    int tammax, tam, can, res;
    
    public Fondo(int tammax, int can){
        
        this.tammax=300;
        this.can=10;
        this.tam=tammax/can;
        this.res=tammax%can;
        
    }
    
    @Override
    public void paint(Graphics pintor){
        
        super.paint(pintor);
        pintor.setColor(colorfondo);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                pintor.fillRect(res/2+i*tam,res/2+ j*tam, tam-1, tam-1);
            }
        }
        
    }
    
}