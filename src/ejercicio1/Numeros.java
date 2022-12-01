package ejercicio1;

public class Numeros {

    /*
    Crea una clase de nombre Numeros. Esta clase debe contener las siguientes dos funciones no estáticas:
    boolean esPrimo(int numero): Esta función devuelve true si el número introducido por parámetro es primo y
    false en caso contrario.
    boolean esCapicua(int numero): Esta función devuelve true si el número introducido es capicúa y false en
    caso contrario.
    */

    /**
     * Metodo que calcula si
     * @param numero es primo y
     * @return true si lo es, y false si no lo es
     */
    boolean esPrimo(int numero){

        //Declaramos las variables
        boolean resultado=true; //Variable donde vamos a guardar el resultado que terminaremos devolviendo al final del método

        for (int i = 2; i < numero / 2; i++) {  //Inicializamos el bucle en 2, lo terminamos en el numero introducido por parámetros entre 2 y lo incrementamos en 1
            if (numero % i == 0)                //Si numero es divisible por cualquiera de los números por los que pasa el bucle, no es primo
                resultado= false;               //Indicamos que resultado es igual a falso
        }
        return resultado;                       //Devolvemos la variable resultado
    }

    /**
     * Metodo que calcula si
     * @param numero es capicua y
     * @return true si lo es, y false si no lo es
     */
    boolean esCapicua(int numero){

        //Declaramos las variables
        boolean resultado=false;    //Variable donde vamos a guardar el resultado que terminaremos devolviendo al final del método
        int aux;                    //Variable auxiliar donde guardaremos el numero introducido para no perder su valor original
        int inverso=0;              //Variable donde guardamos las cifras que vamos calculando para crear el mismo numero introducido pero al revés
        int cifra;                  //Variable donde vamos a guardar la ultima de las cifras de la variable auxiliar

        aux=numero;                     //Igualamos aux a numero
        while(aux!=0){                  //Mientras que aux sea distinto de 0
            cifra = aux % 10;           //Guardamos en cifra el modulo de 10 de aux
            aux/=10;                    //Dividimos a aux entre 10
            inverso=(inverso*10)+cifra; //Igualamos inverso a el mismo por 10 más la cifra que acabamos de calcular
        }

        if(inverso==numero){            //Si inverso y numero son iguales
           resultado=true;              //Cambiamos la variable resultado a true, pues el numero es capicua
        }
        return resultado;               //Devolvemos la varaible resultado
    }

}
