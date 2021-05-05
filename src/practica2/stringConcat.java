package practica2;

import java.util.Scanner;

public class stringConcat{
    public void stringC(){
        String primeraPalabra, segundaPalabra, concatStrings;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la primera palabra: ");
        primeraPalabra = entrada.nextLine();
        System.out.print("Introduce la segunda palabra: ");
        segundaPalabra = entrada.nextLine();
        stringConcat obj = new  stringConcat();
        concatStrings = obj.concat(primeraPalabra, segundaPalabra);
        System.out.println("Concatenacion: "+concatStrings);
    }
    String concat(String x, String y)
    {
        String z;
        z = x + " " + y;
        return z;
    }
}