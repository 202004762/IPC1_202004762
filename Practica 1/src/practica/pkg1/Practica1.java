package practica.pkg1;
import java.util.Scanner;


public class Practica1 {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean finciclo = true;

        while(finciclo){
            System.out.println("***************************");
            System.out.println("*           MENU          *");
            System.out.println("*1. Aritmeticas           *");                                          
            System.out.println("*2. Trigonometricas       *");
            System.out.println("*3. Estadisticas          *");
            System.out.println("*4. Calculo               *");
            System.out.println("*5. Salir                 *");
            System.out.println("***************************");
            System.out.print("Por favor, ingrese una opción: ");                    
            String entrada_del_usuario = sc.nextLine();

            switch(entrada_del_usuario){
                case "1":
                    Aritmeticas();
                    break;
                case "2":
                    Trigonometricas();
                    break;
                case "3":
                    Estadisticas();
                    break;
                case "4":
                    Calculo();
                    break;
                case "5":
                    System.out.println("Gracias");
                    finciclo = false;
                    break;
            }
        }
        
    }
    
    
    public static void Aritmeticas(){
        
        Scanner sc = new Scanner(System.in);
        boolean finciclo = true;
        
        while (finciclo){
            System.out.println("***************************");
            System.out.println("*ARITMETICAS              *");
            System.out.println("*1. Suma                  *");                                          
            System.out.println("*2. Resta                 *");
            System.out.println("*3. Multiplicacion        *");
            System.out.println("*4. Division              *");
            System.out.println("*5. Potencia              *");
            System.out.println("*6. Salir                 *");
            System.out.println("***************************");
            System.out.print("Por favor, ingrese una opción: ");                    
            String entradaaritmetica = sc.nextLine();
            
            switch (entradaaritmetica){
                case "1":
                    suma();
                    break;
                case "2":
                    resta();
                    break;
                case "3":
                    multi();
                    break;
                case "4":
                    division();
                    break;
                case "5":
                    potencia();
                    break;
                case "6":
                    finciclo = false;
                    break;
            }
        }
        
    }
    
        
    public static void suma(){
        
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Ingrese primer numero: ");
        String op1 = sc.nextLine();
        System.out.print("Ingrese segundo numero: ");
        String op2 = sc.nextLine();
        int op1_numero = Integer.parseInt(op1);
        int op2_numero = Integer.parseInt(op2);
        int resultado = op1_numero + op2_numero;
        System.out.println("La suma es: " + resultado);
        String enter = sc.nextLine();
    
    }
    
    
    public static void resta(){
        
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Ingrese primer numero: ");
        String op1 = sc.nextLine();
        System.out.print("Ingrese segundo numero: ");
        String op2 = sc.nextLine();
        int op1_numero = Integer.parseInt(op1);
        int op2_numero = Integer.parseInt(op2);
        int resultado = op1_numero - op2_numero;
        System.out.println("La resta es: " + resultado);
        String enter = sc.nextLine();
    
    }
        
    
    public static void multi(){
        
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Ingrese primer numero: ");
        String op1 = sc.nextLine();
        System.out.print("Ingrese segundo numero: ");
        String op2 = sc.nextLine();
        int op1_numero = Integer.parseInt(op1);
        int op2_numero = Integer.parseInt(op2);
        int resultado = op1_numero * op2_numero;
        System.out.println("La multiplicacion es: " + resultado);
        String enter = sc.nextLine();    
        
    }


    public static void division(){
        
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Ingrese primer numero: ");
        String op1 = sc.nextLine();
        System.out.print("Ingrese segundo numero: ");
        String op2 = sc.nextLine();
        int op1_numero = Integer.parseInt(op1);
        int op2_numero = Integer.parseInt(op2);
        if (op2_numero == 0){
            System.out.println("operacion no permitida, no se puede realizar division entre 0");
        }else if(op2_numero != 0){
            int resultado = op1_numero / op2_numero;
            System.out.println("La division es: " + resultado);
        }
        
        String enter = sc.nextLine();
                   
    }
    
    
    public static void potencia(){
   
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Ingrese la base: ");
        String op1 = sc.nextLine();
        System.out.print("Ingrese el exponente: ");
        String op2 = sc.nextLine();
        int op1_numero = Integer.parseInt(op1);
        int op2_numero = Integer.parseInt(op2);
        double resultado = 0;
        resultado = Math.pow(op1_numero,op2_numero);
        System.out.println("La potencia es: " + resultado);
        String enter = sc.nextLine();
   
    } 
    
    
    public static void Trigonometricas(){
        
        Scanner sc = new Scanner(System.in);
        boolean finciclo = true;
        
        while (finciclo){
            System.out.println("***************************");
            System.out.println("*TRIGONOMETRICAS          *");
            System.out.println("*1. Seno                  *");                                          
            System.out.println("*2. Coseno                *");
            System.out.println("*3. Tangente              *");
            System.out.println("*4. Salir                 *");
            System.out.println("***************************");
            System.out.print("Por favor, ingrese una opción: ");                    
            String entradatrigonometrica = sc.nextLine();
            
            switch (entradatrigonometrica){
                case "1":
                    seno();
                    break;
                case "2":
                    coseno();
                    break;
                case "3":
                    tangente();
                    break;
                case "4":
                    finciclo = false;
                    break;
            }
        }
        
    }
    
    
    public static void seno(){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        double g = sc.nextDouble();
        double x = 0;
        x = g * (Math.PI/180);
        int n = 50;
        double s = 0, t;
        for(int i = 0; i<=n; i++){
            t = (Math.pow(-1, i)*Math.pow(x,2*i+1))/factorial(2*i+1);
            s += t;
        }
        
        System.out.println("Seno de " +g+ " es: " +s);
        String enter = sc.nextLine();
        String e = sc.nextLine();
        
    
    }
    
    
    public static void coseno(){
    
    Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        double g = sc.nextDouble();
        double x = 0;
        x = g * (Math.PI/180);
        int n = 50;
        double s = 0, t;
        for(int i = 0; i<=n; i++){
            t = (Math.pow(-1, i)*Math.pow(x,2*i))/factorial(2*i);
            s += t;
        }
        
        System.out.println("Coseno de " +g+ " es: " +s);
        String enter = sc.nextLine();
        String e = sc.nextLine();
    
    }
    
    
    public static void tangente(){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        double g = sc.nextDouble();
        double x = 0;
        x = g * (Math.PI/180);
        int n = 50;
        double s = 0, c = 0, f = 0, t, l;
        for(int i = 0; i<=n; i++){
            t = (Math.pow(-1, i)*Math.pow(x,2*i+1))/factorial(2*i+1);
            s += t;
        }
        
        for(int j = 0; j<=n; j++){
            l = (Math.pow(-1, j)*Math.pow(x,2*j))/factorial(2*j);
            c += l;
        }
        
        f = s/c;
        System.out.println("Tangente de " +g+ " es: " +f);
        String enter = sc.nextLine();
        String e = sc.nextLine();
    
    }
    
    
    public static double factorial(int n){
    
        double aux = 1;
        for(int i = 2; i <= n; i++){
            aux *= i;
        }
        return aux;
    
    }
    
   
    public static void Estadisticas(){
        
        Scanner sc = new Scanner(System.in);
        boolean finciclo = true;
        
        while (finciclo){
            System.out.println("***************************");
            System.out.println("*ESTADISTICA              *");
            System.out.println("*1. Media                 *");                                          
            System.out.println("*2. Moda                  *");
            System.out.println("*3. Varianza              *");
            System.out.println("*4. Desviacion estandar   *");
            System.out.println("*5. Salir                 *");
            System.out.println("***************************");
            System.out.print("Por favor, ingrese una opción: ");                    
            String entradaestadistica = sc.nextLine();
            
            switch (entradaestadistica){
                case "1":
                    media();
                    break;
                case "2":
                    moda();
                    break;
                case "3":
                    varianza();
                    break;
                case "4":
                    desviacion();
                    break;
                case "5":
                    finciclo = false;
                    break;
            }
        }
        
    }    
    
    
    public static void media(){
        
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Ingrese los datos del vector: ");
        String x = sc.nextLine();
        String[] lista = x.split(",");
        int[] numeros = new int[lista.length];
        for(int i=0;i<lista.length;i++){
            try{
                numeros[i]=Integer.parseInt(lista[i]);
            }catch(Exception e){
                System.out.println("no se puede convertir a numero: " + e.getMessage());
            }
        }
        
        int media = 0;
        for (int i = 0; i < lista.length; i++) {
                media = media + numeros[i];
        }
       
        System.out.println("La media es: "+ media/lista.length);
        String enter = sc.nextLine();
        
    
    }
    
    
    public static void moda(){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese los datos del vector: ");
        String x = sc.nextLine();
        String[] lista = x.split(",");
        int[] numeros = new int[lista.length];
        for(int i=0;i<lista.length;i++){
            try{
                numeros[i]=Integer.parseInt(lista[i]);
            }catch(Exception e){
                System.out.println("no se puede convertir a numero: " + e.getMessage());
            }
        }

        int maximoNumRepeticiones= 0;
        int moda= 0;
        for(int i=0; i<lista.length; i++){
            int numRepeticiones= 0;
            for(int j=0; j<lista.length; j++){
                if(lista[i]==lista[j]){
                numRepeticiones++;
                }   
                if(numRepeticiones>maximoNumRepeticiones){
                //moda= numeros[i];
                maximoNumRepeticiones= numRepeticiones;
                }   
            }
        }   
        
        System.out.println("La moda es: " +moda);
        String enter = sc.nextLine();
    
    }
    
    
    public static void varianza(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese los datos del vector: ");
        String x = sc.nextLine();
        String[] lista = x.split(",");
        double[] numeros = new double[lista.length];
        for(int i=0;i<lista.length;i++){
            try{
                numeros[i]=Integer.parseInt(lista[i]);
            }catch(Exception e){
                System.out.println("no se puede convertir a numero: " + e.getMessage());
            }
        }
        
        double medias = 0;
        for (int i = 0; i < lista.length; i++) {
                medias = medias + numeros[i];
        }
        
        double media=medias/lista.length;
        double varianza = 0;        
        for(int i = 0; i<numeros.length; i++){
            double rango;
            rango=Math.pow(numeros[i]-media,2);
            varianza = varianza + rango;        
        }
        
        varianza = varianza/numeros.length;
        System.out.println(varianza);
        
    }
    
    
    public static void desviacion(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese los datos del vector: ");
        String x = sc.nextLine();
        String[] lista = x.split(",");
        double[] numeros = new double[lista.length];
        for(int i=0;i<lista.length;i++){
            try{
                numeros[i]=Integer.parseInt(lista[i]);
            }catch(Exception e){
                System.out.println("no se puede convertir a numero: " + e.getMessage());
            }
        }
        
        double medias = 0;
        for (int i = 0; i < lista.length; i++) {
                medias = medias + numeros[i];
        }
        
        double media=medias/lista.length;
        double varianza = 0;        
        for(int i = 0; i<numeros.length; i++){
            double rango;
            rango=Math.pow(numeros[i]-media,2);
            varianza = varianza + rango;        
        }
        
        varianza = varianza/numeros.length;
        double desviacion = 1.0;
        for(int k = 0; k<lista.length;k++){
            desviacion = (desviacion + varianza/desviacion) / 2;
        }
        
        System.out.println(desviacion);
        
    }
    
    
    public static void Calculo(){
        
        Scanner sc = new Scanner(System.in);
        boolean finciclo = true;
        
        while (finciclo){
            System.out.println("******************************************************************");
            System.out.println("*CALCULO                                                         *");
            System.out.println("*1. Resolver sistema de ecuaciones lineales NxN con Gauss-Jordan *");
            System.out.println("*2. Salir                                                        *");
            System.out.println("******************************************************************");
            System.out.print("Por favor, ingrese una opción: ");                    
            String entradacalculo = sc.nextLine();
            
            switch (entradacalculo){
                case "1":
                    System.out.println("No pude aux, lo siento :(");
                    String enter = sc.nextLine();
                    break;
                case "2":
                    finciclo = false;
                    break;
            }
        }
        
    }        
    
    
}