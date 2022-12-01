package ejercicio5;

import java.util.Scanner;

public class Main {
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
