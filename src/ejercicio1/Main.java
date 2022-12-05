package ejercicio1;

import java.util.Scanner;

public class Main {

    /*
    Crea una clase de nombre Numeros. Esta clase debe contener las siguientes dos funciones no estáticas:
    boolean esPrimo(int numero): Esta función devuelve true si el número introducido por parámetro es primo y
    false en caso contrario.
    boolean esCapicua(int numero): Esta función devuelve true si el número introducido es capicúa y false en
    caso contrario.
    */

    public static void main(String[] args) {

        //Declaarmos las variables
        int numero;

        //Declarsmos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un numero entero
        System.out.println("Introduzca un numero entero: ");
        numero = sc.nextInt();

        //Nos creamos un objeto numeros para poder llamar a los metodos creados en la clase Numeros()
        Numeros numeros = new Numeros();

        //Imprimimos por pantalla los resultados de los metodos a los cuales le pasamos el numero introducido por teclado por parámetros
        System.out.println("Es primo? " + numeros.esPrimo(numero));
        System.out.println("Es capicua? " + numeros.esCapicua(numero));

        //Cerramos el scanner
        sc.close();
    }
}
