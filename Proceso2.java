package clases;
import java.util.Scanner;
public class Proceso2 extends Thread{

    
    @Override
    public void run(){
        Factorial();
    }
    static void Factorial(){
        
        
        double potencia = 0;
        double num = 0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("ingrese la base de la potencia");
        potencia = in.nextInt();
        
        System.out.println("Ingrese el exponente");
        num = in.nextInt();
        
        
        System.out.println(Math.pow(num,potencia));
    }
    
        
}
    