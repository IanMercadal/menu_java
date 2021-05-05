package practica2;

import java.util.Scanner;

public class fiveOrderedNumbers {
    public void five(){
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];

         System.out.println("Datos a introducir");
         for (int i=0;i<5;i++){
            System.out.print((i+1)+ ". Introduce los numeros: ");
            numeros[i] = entrada.nextFloat();
        }

        System.out.println("\nImprimiendo los elementos");
        for (float i:numeros){
            System.out.println(i);
        }
    }
}