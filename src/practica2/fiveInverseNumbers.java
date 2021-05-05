package practica2;
import java.util.Scanner;

public class fiveInverseNumbers {
        public void fiveInverse(){
            Scanner entrada = new Scanner(System.in);
            int numeros = entrada.nextInt();
            int[] elt=new int[5];
    
            System.out.println("Datos a introducir");
            for (int i=0;i<5;i++){
            System.out.print((i+1)+ ". Introduce los numeros: ");
            elt[i] = entrada.nextInt();
            }
            System.out.println("\nImprimiendo los elementos originales");
            for (int i:elt){
                System.out.println(i);
            }
            System.out.println("\n Imprimiendo los elementos inversos");
            for (int i=5-1;i>=0;i--){
                System.out.println(elt[i]);
        }
    }
}