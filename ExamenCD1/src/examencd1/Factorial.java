package examencd1;

public class Factorial {

    public static void main(String[] args) {

        // El programa coge un numero entero natural y haciendo un condicional
        //y un for calcula el factorial de dicho numero entero.
        int numEntero;
        int numFactorial;

        numEntero = 8;

        int numIncremental;
        if (numEntero == 0) {
            numFactorial = 1;
        } else {
            numFactorial = 1;
            for (numIncremental = numEntero; numIncremental >= 1; numIncremental--) {
                numFactorial = numFactorial * numIncremental;
            }
        }

        System.out.println(numFactorial);

    }

}
