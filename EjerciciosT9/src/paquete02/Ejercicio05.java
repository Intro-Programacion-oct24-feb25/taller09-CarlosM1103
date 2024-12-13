/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] ventas = new int[5];
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};

        for (int i = 0; i < dias.length; i++) {
            System.out.println("Ingrese el numero el valor de ventas"
                    + " por cada día de la semanas. Día: " + dias[i]);
            ventas[i] = entrada.nextInt();
        }
        System.out.printf("\n");
        for (int i = 0; i < dias.length; i++) {
            System.out.printf("%s $%d\n", dias[i], ventas[i]);
        }
    }
}


