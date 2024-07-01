public class Cuenta {
    
    public int id;
    public int clientedpi;
    public double saldo;
    
    public Cuenta(int id, int clientedpi, double saldo){
    
        this.id=id;
        this.clientedpi=clientedpi;
        this.saldo=saldo;
    
    }
    
    public void ImprimirCuenta(){
    
        System.out.println("id: "+id+", dpi: "+clientedpi+", saldo: "+saldo);
        
    }
    
}