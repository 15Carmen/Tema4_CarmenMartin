package ejercicio4;

import java.util.Scanner;

public class Main {

     /*
    Crea una clase denominada Operaciones, la cual va a contener una función no estática por cada una de las
    operaciones básicas: suma, resta, multiplicación y división. Es decir, 4 funciones. Las variables con las que
    se van a realizar estas operaciones son globales no estáticas. Es decir, estas funciones no recibirán ningún
    parámetro de entrada. Ten en cuenta las características de estas funciones y la existencia de las variables
    globales para realizar las pruebas desde el método main().
     */

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
