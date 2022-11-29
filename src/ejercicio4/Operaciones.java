package ejercicio4;

public class Operaciones {
    /*
    Crea una clase denominada Operaciones, la cual va a contener una función no estática por cada una de las
    operaciones básicas: suma, resta, multiplicación y división. Es decir, 4 funciones. Las variables con las que
    se van a realizar estas operaciones son globales no estáticas. Es decir, estas funciones no recibirán ningún
    parámetro de entrada. Ten en cuenta las características de estas funciones y la existencia de las variables
    globales para realizar las pruebas desde el método main().
     */

    double num1 = 24;
    double num2 = 3;
    static Operaciones o = new Operaciones();

    double suma() {
        return o.num1 + o.num2;
    }

    double resta() {
        return o.num1 - o.num2;
    }

    double multiplicacion() {
        return o.num1 * o.num2;
    }

    double division() {
        return o.num1 / o.num2;
    }

}
