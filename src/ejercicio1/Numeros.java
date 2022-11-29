package ejercicio1;

public class Numeros {

    /*
    Crea una clase de nombre Numeros. Esta clase debe contener las siguientes dos funciones no estáticas:
    boolean esPrimo(int numero): Esta función devuelve true si el número introducido por parámetro es primo y
    false en caso contrario.
    boolean esCapicua(int numero): Esta función devuelve true si el número introducido es capicúa y false en
    caso contrario.
    */


    boolean esPrimo(int numero){
        boolean resultado=true;
        for (int i = 2; i < numero / 2; i++) {
            // Si es divisible por cualquiera de estos números, no es primo
            if (numero % i == 0)
                resultado= false;
        }
        return resultado;
    }

    boolean esCapicua(int numero){
        boolean resultado=false;
        int aux;
        int inverso=0;
        int cifra;

        aux=numero;
        while(aux!=0){
            cifra = aux % 10;
            aux/=10;
            inverso=(inverso*10)+cifra;
        }
        //comparar ambas variables para saber si el numero es capicua
        if(inverso==numero){
           resultado=true;
        }
        return resultado;
    }

}
