package practica2;

import java.util.Scanner;
import java.util.regex.*;

public class stringAscii{
    public void stringInputAscii(){

        System.out.print("Introduce la palabra: ");

        Scanner entrada = new Scanner(System.in);
        String palabra = entrada.nextLine();
        
        int suma=0;
        
        for(int i=0;i<palabra.length();i++) {
        	int asciiValue = palabra.charAt(i);
        	suma += asciiValue;
        }
        System.out.println("Valor ASCII de " + palabra + " = " + suma);
     }
}