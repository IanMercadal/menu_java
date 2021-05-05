package practica2;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;
 
public class MenuJava {

    public static void main(String[] args) {
        operaciones();
    }

    public static void operaciones(){
        fiveOrderedNumbers fiveOrderedNumbers = new fiveOrderedNumbers();
        numbersPositiveNegatives numbersPositiveNegatives = new numbersPositiveNegatives();
        fiveInverseNumbers fiveInverseNumbers = new fiveInverseNumbers();
        stringConcat stringConcat = new stringConcat();
        stringReverse stringReverse = new stringReverse();
        stringNoSpaces stringNoSpaces = new stringNoSpaces();
        stringLength stringLength = new stringLength();
        stringVocal stringVocal = new stringVocal();
        stringAscii stringAscii = new stringAscii();
    
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
 
        while (!salir) {
 
            System.out.println("1. Opcion 1 - Insertar 5 numeros y que salgan en el orden introducido.");
            System.out.println("2. Opcion 2 - Insertar 5 numeros y mostrarlos en orden inverso al introducido.");
            System.out.println("3. Opcion 3 - Realizar la media de los numeros positivos, negativos y contar el numero de ceros que se han introducido.");
            System.out.println("4. Opcion 4 - Introducir texto y devolver numero de caracteres");
            System.out.println("5. Opcion 5 - Introdicir texto y devolverlo inverso");
            System.out.println("6. Opcion 6 - Introdicir texto y devolverlo sin espacios");
            System.out.println("7. Opcion 7 - Introducir dos cadenas y devolver concatenadas.");
            System.out.println("8. Opcion 8 - Inroducir una cadena y una vocal, sustituir todas las vocales de la cadena por la vocal que se ha pasado como parametros.");
            System.out.println("9. Opcion 9 - Introducir una cadena, y muestre el codigo ASCII de cada uno de los caracteres de la cadena.");
            System.out.println("10. Opcion 10 - Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        fiveOrderedNumbers.five();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        fiveInverseNumbers.fiveInverse();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        numbersPositiveNegatives.posNeg();
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        stringLength.stringInputLenght();
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion 5");
                        stringReverse.stringInput();
                        break;
                    case 6:
                        System.out.println("Has seleccionado la opcion 6");
                        stringNoSpaces.stringInputSpace();
                        break;
                    case 7:
                        System.out.println("Has seleccionado la opcion 7");
                        stringConcat.stringC();
                        break;
                    case 8:
                        System.out.println("Has seleccionado la opcion 8");
                        stringVocal.stringInputVocal();
                        break;
                    case 9:
                        System.out.println("Has seleccionado la opcion 9");
                        stringAscii.stringInputAscii();
                        break;
                    case 10:
                        salir = true;
                        break; 

                    default:
                        System.out.println("Solo nnmeros entre 1 y 10");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un numero");
                teclado.next();
            }
        }    
    }
} 