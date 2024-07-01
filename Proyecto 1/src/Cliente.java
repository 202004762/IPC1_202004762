public class Cliente {
    
    public int cui;
    public String nombre;
    public String apellido;
    public Cuenta[] asociadas;
    
    public Cliente(int cui, String nombre, String apellido){
    
        this.cui=cui;
        this.nombre=nombre;
        this.apellido=apellido;
        this.asociadas=new Cuenta[5];
    
    }
    
    public void imprimir(){

    System.out.println("CUI: "+ this.cui + ", Nombre: "+ this.nombre + ", Apellido: "+ this.apellido);
    
    }
   
    
}