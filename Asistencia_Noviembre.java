/*
Autor: Ariel Pereira

Ejercicio 1: Leer 5 numeros, guardandolos en un arreglo y 
mostrarlos en el mismo orden introducidos
*/

package arreglos_ejercicio_1;


public class Arreglos_Ejercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] arreglos = new float[5];
        
        System.out.println("Guardando los datos en el arreglo");
        for (int i=0; i<5; i++) {
            System.out.println((i+1)+".Digite un numero: ");
            arreglos[i] = entrada.nextFloat();
        }
        
        System.out.println("\nImprimir los elementos del arreglo");
        for(float i:arreglos) {
            System.out.println(i+" ");
        }
        System.out.println("\n");
    }
}




/*
Autor: Di Stefano Diego

Ejercicio 1: Leer 5 numeros, guardandolos en un arreglo y 
mostrarlos en el orden inverso al introducido
*/

package arreglos_ejercicio_2;

import java.util.Scanner;

public class Arreglos_Ejercicio_2 {
    
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            float[] numeros = new float[5];

            System.out.println("Guardando los datos en el arreglo");
            for (int i=0; i<5; i++) {
                System.out.println((i+1)+".Digite un numero: ");
                numeros[i] = entrada.nextFloat();
            }
        
        System.out.println("\nImprimimos los elementos del arreglo");
            for(int i=4; i>=4; i--) {
                System.out.println(i+" ");
        }
        System.out.println("\n");
    }
}




/*
Autor: Gastón Exequiel Garay

Ejercicio 3: Leer 5 números por teclado, almacenarlos 
en un arreglo y a continuación realizar la media de los 
números positivos, la media de los negativos y contar el
número de ceros.
*/
package arreglos_ejercicio_3;

import java.util.Scanner;


public class Arreglos_Ejercicio_3 {
    
    public static void main(String[] args) {
             Scanner entrada = new Scanner (System.in);
             float numeros[] = new float[5];
             float negativos=0,positivos=0,mediaNegativos,mediaPositivos;
             int conteo0=0,conteo_negativos=0,conteo_positivos=0;
        
             System.out.println(" Guardamos los elementos del arreglo: ");
             for(int i=0;i<5;i++){
                     System.out.println((i+1)+". Digite un numero:");
                     numeros[i] = entrada.nextFloat();
                     if(numeros[i]>0){
                             positivos += numeros[i];
                             conteo_positivos++;
                     }
                     else if(numeros[i]<0){
                             negativos += numeros[i];
                             conteo_negativos++;
                     }
                     else{
                             conteo0++;
                     }         
             }
             if(conteo_positivos == 0){
                     System.out.println("\nNo se puede sacar la media de los numeros positivos");
             }
             else{
                     mediaPositivos = positivos/conteo_positivos;
                     System.out.println("\nLa media de los numeros positivos es: "+mediaPositivos);
             }
             if(conteo_negativos == 0){
                     System.out.println("\nNo se puede sacar la media de los numeros negativos");
             }
             else{
                     mediaNegativos = negativos/conteo_negativos;
                     System.out.println("\nLa media de los números negativos es: " +mediaNegativos);
             }
        
        System.out.println("La cantidad de ceros es: "+conteo0);
        //ingresar:2, -5, 6, 2, 0
    }
}
