package ejercicio5;

import java.util.Scanner;

public class Main {

    /*
    Crea una clase denominada FuncionesRecursivas. En esta clase se definirán las siguientes funciones estáticas,
    que deben ser implementadas de forma recursiva:
        int sumatorio(int numero): Devuelve la suma de todos los números entre 1 y n.

        double potencia(double a, int n): Esta función devuelve el resultado de a^n.

        int serieFibonacci(int numero): A esta función se le pasará un número entero y nos devolverá el término
        correspondiente de la serie de Fibonacci. El enésimo valor de la serie de Fibonacci se calcula sumando los
        dos valores anteriores de la serie. Es decir:

            fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
            fibonacci(0) = 1
            fibonacci(1) = 1
     */

    public static void main(String[] args) {

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un numero para hacer su sumatorio y lo guardamos en la variable num
        System.out.println("Introduzca un numero entero del cual vamos a hacer un sumatorio: ");
        int num = sc.nextInt();
        //Imprimimos el metodo sumatorio pasandole la variable num por parámetros
        System.out.println("El sumatorio de " + num + " es " + FuncionesRecursivas.sumatorio(num));

        //Le pedimos al usuario que introduzca un numero para hacer su sumatorio y lo guardamos en la variable num
        System.out.println("Introduzca un numero entero que vamos a elevar: ");
        int a = sc.nextInt();
        System.out.println("Introduzca el numero al que desea elevar el anterior: ");
        int n = sc.nextInt();
        //Imprimimos el metodo potencia pasandole las variables a y n por parámetros
        System.out.println("La potencia de " + a + " elevado a  " + "n es " + FuncionesRecursivas.potencia(a, n));

        //Le pedimos al usuario que introduzca un numero para calcular su numero correspondiente en la serie de Fibonacci
        System.out.println("Introduzca un numero entero: ");
        int numero = sc.nextInt();
        //Imprimimos el metodo sumatorio pasandole la variable num por parámetros
        System.out.println("El numero correspondiente de la serie de Fibonacci de " + numero + " es " + FuncionesRecursivas.serieFibonacci(numero));

        //Cerramos el scanner
        sc.close();
    }
}
