/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double suma = 0;
        double promedio = 0;
        String arriba = "Numeros por encima del promedio:\n";
        String abajo = "Numeros por debajo del promedio:\n";
        
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        
        promedio = suma/arreglo.length;
        
        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] > promedio) {
                arriba = String.format("%s%d\n", arriba, arreglo[i]);
            } else {
                abajo = String.format("%s%d\n", abajo, arreglo[i]);
            }
        }

        System.out.printf("El promedio es:%.2f\n%s\n%s",promedio, arriba, abajo);

    }

}
