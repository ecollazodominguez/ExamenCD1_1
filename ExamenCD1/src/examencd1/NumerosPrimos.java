package examencd1;

/**
 *
 * @author
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean primo = false;

    public static void main(String arg[]) {
        
        //Se han abreviado algunas variables para que sean más cortas pero manteniendo
        //su significado (Digitos, divEntera, count, limit) y los demasiado cortos se han alargado
        //para definirlos mejor (p a primo y i a primos)
        int Digitos = 0;
        int numD = 0;
        Digitos = Integer.parseInt(arg[0]);
        if (Digitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int primos = 1; primos <= 99999; primos++) {
            int divEntera = primos;

            int count = 0;

            while (divEntera != 0) {
                divEntera = divEntera / 10;
                count++;
            }
            numD = count;

            if (numD == Digitos) {
                if (primos < 4) {
                    primo = true;
                } else {
                    if (primos % 2 == 0) {
                        primo = false;
                    } else {
                        int count1 = 0;
                        int x = 1;
                        int limit = (primos - 1) / 2;
                        if (limit % 2 == 0) {
                            limit--;
                        }

                        while (x <= limit) {
                            if (primos % x == 0) {
                                count1++;
                            }
                            x += 2;
                            if (count1 == 2) {
                                x = limit + 1;
                            }
                        }

                        if (count1 == 1) {
                            primo = true;
                        }
                    }
                }

                if (primo == true) {
                    System.out.println(primos);
                }
            }
        }
    }

}
