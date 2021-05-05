package practica2;
import java.util.Scanner;
import java.util.regex.*;

public class stringLength{
    public void stringInputLenght(){

    	System.out.println("Introduce una frase: ");
        Scanner entrada = new Scanner(System.in);
        String frase = entrada.nextLine();
		
    	System.out.println("La longitud con espacios: "+frase.length());
    		
    	//length of the String without white spaces
    	System.out.println("La longitud sin espacios: "+
    	frase.replace(" ", "").length());
        }
}