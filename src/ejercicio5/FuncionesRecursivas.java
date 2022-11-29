package ejercicio5;

public class FuncionesRecursivas {
    /*
    Crea una clase denominada FuncionesRecursivas. En esta clase se definirán las siguientes funciones estáticas,
    que deben ser implementadas de forma recursiva:
        int sumatorio(int numero): Devuelve la suma de todos los números entre 1 y n.
        double potencia(double a, int n): Esta función devuelve el resultado de a^n.
        int serieFibonacci(int numero): A esta función se le pasará un número entero y nos devolverá el término correspondiente de la serie de Fibonacci. El enésimo valor de la serie de Fibonacci se calcula sumando los dos valores anteriores de la serie. Es decir:
        fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
        fibonacci(0) = 1
        fibonacci(1) = 1

     */

    static int sumatorio(int numero){
        int resultado=0;
        for (int i = 0; i < numero; i++) {
            resultado+=i;
        }
        return resultado;
    }

    static double potencia(double a, int n){
        return 0.5;
    }
}
