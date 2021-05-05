package practica2;

import java.util.Scanner;
import java.util.regex.*;

public class stringVocal{
    public void stringInputVocal(){

        System.out.print("Introduce la frase: ");

        Scanner entrada = new Scanner(System.in);
        String frase = entrada.nextLine();
        
        System.out.print("Introduce la letra: ");

        Scanner teclado = new Scanner(System.in);
        String vocal = teclado.nextLine();

        System.out.println("Frase original: " + frase);
        frase = frase.replaceAll("\\s", "");
        System.out.println("Frase con reemplazos:" + frase.replaceAll("[AaEeIiOoUu]", vocal));
        }
}