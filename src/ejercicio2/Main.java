package ejercicio2;

import java.util.Scanner;

public class Main {
    /*
    Crea una clase de nombre Esfera. Esta clase debe contener dos funciones estáticas que harán lo siguiente:
    La primera de las funciones calculará la superficie de la esfera, que tiene esta fórmula:
                        Superficie = 4PI*radio^2
    La segunda de las funciones calculará el volumen de la esfera, que tiene la siguiente fórmula:
                        Volumen=(4PI/3)*radio^2
    Define radio como una variable global estática de la clase Esfera.

     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el radio de la esfera: ");
        Esfera.radio=sc.nextInt();

        System.out.println("La superficie de la esfera es: " + Esfera.superficie());
        System.out.println("El volumen de la esfera es: " + Esfera.volumen());
    }
}
