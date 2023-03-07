package clases;
import java.util.Scanner;

public class Proceso2 extends Thread{
    
    @Override
    public void run(){
        Factorial();
    }
    static void Factorial(){
        Scanner in = new Scanner(System.in);
        int factorial;
        int num;
        System.out.print("Introduce un número: ");
        num  = in.nextInt();
        
        //Variable inicializada
        factorial=1; 
		 for (int i=num;i>0;i--)
		 {
		 factorial=factorial*i;
                        System.out.println(i+ " ");
                     System.out.print(factorial+ " ");
		 }
		 System.out.println("El factorial de " + num + " es: " + factorial);

	}

}