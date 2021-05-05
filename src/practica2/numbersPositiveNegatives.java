package practica2;
import java.util.Scanner;

public class numbersPositiveNegatives {
        public void posNeg() {
            
            Scanner entrada = new Scanner(System.in);
            float numeros[] = new float[5];
            float suma_positivos=0,suma_negativos=0,media_positivos,media_negativos;
            int cuenta_positivos=0,cuenta_negativos=0,cuenta_ceros=0;
        
            System.out.println("Numeros a introducir");
            for(int i=0;i<5;i++){
                System.out.print((i+1)+ ". Debes inserta un numero: ");
                numeros[i] = entrada.nextFloat();
        
                if (numeros[i] == 0){
                    cuenta_ceros++;
                }
                else if (numeros[i]>0){
                    suma_positivos += numeros[i];
                    cuenta_positivos++;
                }
                else{
                    suma_negativos += numeros[i];
                cuenta_negativos ++;
                } 
            }
        
            // Medias
            //Media positivos
            if (cuenta_positivos == 0){
                System.out.println("No se puede hacer la media de positivos");
            }
            else{
                media_positivos = suma_positivos / cuenta_positivos;
                System.out.println("La media de los numeros positivos es: " +media_positivos);
            }
            // Media negativos
            if (cuenta_negativos == 0){
                System.out.println("No se puede hacer la media de negativos");
            }
            else {
                media_negativos = suma_negativos / cuenta_negativos;
                System.out.println("La media de los negativos es: "+media_negativos);
            }
        
            System.out.println("La cantidad de ceros es: "+ cuenta_ceros);
        }
}