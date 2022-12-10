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

Ejercicio 2: Leer 5 numeros, guardandolos en un arreglo y 
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



/*
Autora: Mara Di Stefano

Ejercicio 2: 
*/

package MatricesEjercicios;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int [7][7];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i==j) {
                    matriz[i][j] = 1;
                }
                else{
                    matriz[i][j] =0;
                }
            }
        }

        System.out.println("Matriz");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.println(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        
    }
}

/*
Autor: Roberto Di Stefano


Ejercicio Test: 
*/


package domain;


public class Empleado extends Persona{
    @Override
    public void imprimir(){
        System.out.println("Metodo imprimir de la clase hija");
    }
}

package domain;


public class Persona {
    public final static int CONSTANTE_AQUI = 15;
    private String nombre;
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void imprimir(){
        System.out.println("Se esta imprimiendo");
    }
}


package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 39565278;
        System.out.println("miDni = " + miDni);
        //miDni = 40605106; No se puede modificar
        //Persona.CONSTANTE_AQUI = 9;// No se puede modificar
        System.out.println("Mi atributo constante es "+Persona.CONSTANTE_AQUI);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); NO SE PUEDE ASIGNAR UNA NUEVA REFERENCIA
        persona1.setNombre("Ariel Betancud");
        System.out.println("persona1 nombre: " + persona1.getNombre());
        persona1.setNombre("Liliana");
        System.out.println("persona1 nombre: " + persona1.getNombre());
    }
}



