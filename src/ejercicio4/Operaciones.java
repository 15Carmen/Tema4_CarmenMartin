package ejercicio4;

public class Operaciones {
    /*
    Crea una clase denominada Operaciones, la cual va a contener una función no estática por cada una de las
    operaciones básicas: suma, resta, multiplicación y división. Es decir, 4 funciones. Las variables con las que
    se van a realizar estas operaciones son globales no estáticas. Es decir, estas funciones no recibirán ningún
    parámetro de entrada. Ten en cuenta las características de estas funciones y la existencia de las variables
    globales para realizar las pruebas desde el método main().
     */

    //Declaramos las variables globales
    double num1, num2;  //Variables donde vamos a guardar los numeros introducidos por el usuario y que vamos a utilizar en nuestros metodos

    /**
     * Metodo que va a calcular la suma de las dos variables y
     * @return el resultado de la suma
     */
    double suma() {
        return num1+num2;
    }

    /**
     * Metodo que va a calcular la resta de las dos variables y
     * @return el resultado de resta
     * Precondición: Si no se quiere obtener un resultado negativo, num1 (el primero en ser introducido)
     * debe ser mayor que num2
     */
    double resta() {
        return num1-num2;
    }

    /**
     * Metodo que va a calcular la multiplicación de las dos variables y
     * @return el resultado de la multiplicación
     */
    double multiplicacion() {
        return num1*num2;
    }

    /**
     * Metodo que va a calcular la resta de las dos variables y
     * @return el resultado de resta
     * Precondición: num1 (el primero en ser introducido) debe ser mayor que num2
     */
    double division() {
        return num1/num2;
    }

}
