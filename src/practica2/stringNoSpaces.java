package practica2;

import java.util.Scanner;
import java.util.regex.*;

public class stringNoSpaces{
    public void stringInputSpace(){

        System.out.print("Introduce la frase: ");

        Scanner entrada = new Scanner(System.in);
        String frase = entrada.nextLine();

        System.out.println("Frase original: " + frase);
        frase = frase.replaceAll("\\s", "");
        System.out.println("Frase sin espacios: " + frase);
        }
}