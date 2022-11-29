package ejercicio2;

public class Esfera {
    /*
    Crea una clase de nombre Esfera. Esta clase debe contener dos funciones estáticas que harán lo siguiente:
    La primera de las funciones calculará la superficie de la esfera, que tiene esta fórmula:
                        Superficie = 4PI*radio^2
    La segunda de las funciones calculará el volumen de la esfera, que tiene la siguiente fórmula:
                        Volumen=(4PI/3)*radio^2
    Define radio como una variable global estática de la clase Esfera.

     */

    static int radio;

    static double superficie(){
        return (4*Math.PI)*Math.pow(radio, 2);
    }

    static double volumen(){
        return (4*Math.PI/3)*Math.pow(radio, 3);
    }
}
