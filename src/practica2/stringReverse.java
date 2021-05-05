package practica2;

import java.util.Scanner;

public class stringReverse{
    public void stringInput(){
        Scanner entrada = new Scanner(System.in);
        String palabra;

        System.out.print("Introduce la palabra: ");
        palabra = entrada.nextLine();

        char [] letras = new char[palabra.length()];
        int letrasIndex = 0;
        for(int i = palabra.length() -1;i>=0; i--){
            letras[letrasIndex] = palabra.charAt(i);
            letrasIndex++;
        }  
        String reverse ="";{
            for (int i=0; i< palabra.length(); i++){
                reverse += letras[i];
        System.out.println("La palabra inversa: " + reverse);
        }
    }
}
}