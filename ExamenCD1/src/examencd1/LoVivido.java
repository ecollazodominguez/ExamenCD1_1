/*
 * Examen Refactorizacion
 * 
 */
package examencd1;

import javax.swing.JOptionPane;

public class LoVivido {
//El programa te indica el año, mes, dia y hora que has vivido, se ha refactorizazo para indicar bien qué es cada variable
    public static void main(String[] args) {
        String nombre;
        String edad;

        int mes;
        int dia;
        int hora;
        int año;

        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");

        año = Integer.parseInt(edad);

        mes = (año * 12);
        dia = (año * 365);
        hora = (dia * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + mes, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + dia, "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + hora, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}
