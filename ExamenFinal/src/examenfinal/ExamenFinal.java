package examenfinal;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ExamenFinal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean finciclo = true;

        while(finciclo){
            System.out.println("***************************");
            System.out.println("*           MENU          *");
            System.out.println("*1. Problema 1            *");                                          
            System.out.println("*2. Problema 2            *");
            System.out.println("*3. Problema 3            *");
            System.out.println("*4. Salir                 *");
            System.out.println("***************************");
            System.out.print("Por favor, ingrese una opción: ");                    
            String entrada_del_usuario = sc.nextLine();

            switch(entrada_del_usuario){
                case "1":
                    MayorMenor();
                    break;
                case "2":
                    Piramide();
                    break;
                case "3":
                    Vacas();
                    break;
                case "4":
                    System.out.println("Gracias");
                    finciclo = false;
                    break;
            }
        }
        
    }
    
    public static void MayorMenor(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        int op1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int op2 = sc.nextInt();
        if(op1<op2){
            System.out.println(op2 + " es el numero mayor");
        }else{
            System.out.println(op1 + " es el numero mayor");
        }
        
    }
    
    public static void Piramide(){
        
        Scanner sc = new Scanner(System.in);
        int n,m;
        boolean finciclo = false;
        do{
            System.out.print("Ingrese un numero impar: ");
            m = sc.nextInt();
            if(m%2!=0){
                finciclo = true;
            }else{
                System.out.print("Deben ser numeros impares");
            }
            
        }while(!finciclo);
        
        n=m/2+1;
        char matriz [][] = new char [n][m];
        int mitad=matriz[0].length/2;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if((i+j)>=mitad && (j-i)<=mitad){
                    matriz[i][j]='*';
                }else{
                    matriz[i][j]=' ';
                }
                
                System.out.print(matriz[i][j]+" ");
            }
            
            System.out.println();
        }
      
    }
    
    public static void Vacas(){
        
        int numVacas, limitePeso;
        
        numVacas = 8;
        limitePeso = 1000;
        
        
        
        
        
        
    }
    
    
}