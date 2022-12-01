package ejercicio5;

public class FuncionesRecursivas {
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

    /**
     * Metodo que va a calcular la suma de todos los números entre 1 y
     *
     * @param numero que es introducido por parametro
     * @return
     */
    static int sumatorio(int numero) {
        //Declaramos las varaible
        int resultado = 0;  //Variable donde guardaremos el resultado que terminaremos devolviendo

        if (numero == 1) {
            resultado = 1;
        }else {
            resultado = numero + sumatorio(numero-1);
        }
        return resultado;                   //Devolvemos la variable resultado
    }

    /**
     * Metodo que va a calculara la potencia de
     *
     * @param a elevada a
     * @param n y nos
     * @return el resultado de la elevacion de 'a' a 'n'
     */
    static double potencia(double a, int n) {
        double resultado = 0;
       if (n==0){
           resultado=1;
       }else {
           resultado = a*potencia(a, n-1);
       }
       return resultado;
    }

    /**
     * Metodo que calculará a que numero de la serie de fibonacci corresponde el
     *
     * @param numero introducido por parametros y
     * @return el resultado de dicho cálculo
     */
    static int serieFibonacci(int numero) {
        //Delcaramos las variables
        int fibonacci = 0;  //Variable donde guardaremos el resultado que terminará devolviendo el método

        if (numero == 0 || numero == 1) {   //Si el numero introducido es igual a 0 o a 1
            fibonacci = numero;             //Igualamos la variable fibonacci al numero introducido
        } else if (numero < 0) {               //Si el numero es menor que 0 lanzamos un mensaje de error
            System.out.println("Error! Valor no valido");
        } else {                             //Si no es ninguno de esos casos, guardamos en la varaible fibonacci el calculo de la serie fibonacci
            fibonacci = serieFibonacci(numero - 1) + serieFibonacci(numero - 2);
        }

        //Devolvemos la variable fibonacci
        return fibonacci;
    }
}
