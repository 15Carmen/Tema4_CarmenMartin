package ejercicio3;

public class NumerosAleatorios {
    /*
    Añade las funciones que creaste en el ejercicio 5 del boletín SOBRECARGA DE FUNCIONES, añádelas a una única
    clase denominada NumerosAleatorios. Las funciones de esta clase deben ser estáticas. Desde el método main(), que
    estará definido en otra clase distinta, se pedirán los valores correspondientes para probar estas funciones.
     */

    /**
     * Metodo que va a imprimir una secuencia de numeros random entre 0 y 1 tantas veces como lo indique
     * @param cantidad que es introducida por parámetros
     */
    static void numerosAleatorios(int cantidad){

        //Declaramos las variables
        int numRandom=0;    //Variable donde vamos a guardar los numeros random generados
        for (int i = 0; i < cantidad; i++) {                            //Inicializamos el bucle en 0, lo finalizamos en la cantidad y lo incrementamos en 1
            System.out.println(numRandom = (int) (Math.random()*2));    //Imprimimos el resultado del cálculo de los numeros random
        }
    }

    /**
     * Metodo que va a imprimir una secuencia de numeros random entre 0 y
     * @param max tantas veces como lo indique
     * @param cantidad
     */
    static void numerosAleatorios(int cantidad, int max){

        //Declaramos las variables
        int numRandom=0;    //Variable donde vamos a guardar los numeros random generados
        for (int i = 0; i < cantidad; i++) {                            //Inicializamos el bucle en 0, lo finalizamos en la cantidad y lo incrementamos en 1
            System.out.println(numRandom = (int) (Math.random()*max));  //Imprimimos el resultado del cálculo de los numeros random
        }
    }

    /**
     * Metodo que va a imprimir una secuencia de numeros random entre
     * @param min y
     * @param max tantas veces como lo indique
     * @param cantidad
     */
    static void numerosAleatorios(int cantidad, int min, int max){
        int numRandom=0;
        for (int i = 0; i < cantidad; i++) {
            System.out.println(numRandom = (int) (Math.random() * (max - min) + min));
        }
    }
}
