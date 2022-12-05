package ejercicio3;

import java.util.Scanner;

public class Main {

    /*
    Añade las funciones que creaste en el ejercicio 5 del boletín SOBRECARGA DE FUNCIONES, añádelas a una única
    clase denominada NumerosAleatorios. Las funciones de esta clase deben ser estáticas. Desde el método main(), que
    estará definido en otra clase distinta, se pedirán los valores correspondientes para probar estas funciones.
     */

    public static void main(String[] args) {

        //Declaramos las varaibles
        int cantidad, max, min; //Variables donde guardaremos las respuestas del usuario

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca la cantidad de veces que quiere repetir el bucle y lo guardamos en la variable cantidad
        System.out.println("Introduzca cuantas veces desea repetir el bucle: ");
        cantidad=sc.nextInt();

        if (cantidad>0){                                    //Si cantidad es mayor que 0
            NumerosAleatorios.numerosAleatorios(cantidad);  //LLamamos al método numerosAleatorios y le pasamos cantidad por parámetros
            //Le pedimos al usuario que introduzca el numero máximo que puede aparecer en el listado de numeros y lo guardamos en la variable max
            System.out.println("Introduzca ahora cual va a ser el numero maximo que se puede mostrar");
            max= sc.nextInt();

            if (max>2){                                             //Si max es mayor que 2
                NumerosAleatorios.numerosAleatorios(cantidad, max); //LLamamos al método numerosAleatorios y le pasamos cantidad y max por parámetros
                //Le pedimos al usuario que introduzca el numero mínimo que puede aparecer en el listado de números y lo guardamos en la variable min
                System.out.println("Introduzca ahora cual va a ser el numero minimo que se puede mostrar");
                min= sc.nextInt();

                if (min<max && min > 0){                                    //Si el minimo es menor que el valor maximo y mayor que 0
                    NumerosAleatorios.numerosAleatorios(cantidad,min,max);  //LLamamos al método numerosAleatorios y le pasamos cantidad, min y max por parámetros
                }else {                                                     //Si es mayor que max o menor que 0 lanzamos un mensaje de error
                    System.out.println("Error! Valor introducido no válido");
                }
            }else {                                                         //Si es menor que 0 lanzamos un mensaje de error
                System.out.println("Error! Valor introducido no válido");
            }
        }else {                                                             //Si es menor que 0 lanzamos un mensaje de error
            System.out.println("Error! Valor introducido no válido");
        }

        //Cerramos el scanner
        sc.close();
    }
}
