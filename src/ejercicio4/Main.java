package ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Nos creamos un objeto de la clase Operaciones() para poder llamar a los metodos y variables que hay en esa clase
        Operaciones operaciones = new Operaciones();

        //Le pedimos al usuario que introduzca dos numeros enteros y los guardamos en las variables globales creadas en la clase Operaciones()
        System.out.println("Introduzca un numero entero: ");
        operaciones.num1 = sc.nextDouble();
        System.out.println("Introduzca otro numero entero: ");
        operaciones.num2 = sc.nextDouble();

        //Imprimimos los resultados de los metodos creados en la clase Operaciones()
        System.out.println("El resultado de la suma es: " + operaciones.suma());
        System.out.println("El resultado de la resta es: " + operaciones.resta());
        System.out.println("El resultado de la multiplicacion es: " + operaciones.multiplicacion());
        System.out.println("El resultado de la division es: " + operaciones.division());


    }
}
