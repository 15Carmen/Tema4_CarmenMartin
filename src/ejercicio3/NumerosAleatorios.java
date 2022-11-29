package ejercicio3;

public class NumerosAleatorios {
    /*
    Añade las funciones que creaste en el ejercicio 5 del boletín SOBRECARGA DE FUNCIONES, añádelas a una única
    clase denominada NumerosAleatorios. Las funciones de esta clase deben ser estáticas. Desde el método main(), que
    estará definido en otra clase distinta, se pedirán los valores correspondientes para probar estas funciones.

     */
    static void numerosAleatorios(int cantidad){

        int numRandom=0;
        for (int i = 0; i < cantidad; i++) {
            System.out.println(numRandom = (int) (Math.random()*2));
        }
    }

    static void numerosAleatorios(int cantidad, int max){

        int numRandom=0;
        for (int i = 0; i < cantidad; i++) {
            System.out.println(numRandom = (int) (Math.random()*max));
        }
    }

    static void numerosAleatorios(int cantidad, int min, int max){
        int numRandom=0;
        for (int i = 0; i < cantidad; i++) {
            System.out.println(numRandom = (int) (Math.random() * (max - min) + min));
        }
    }
}
