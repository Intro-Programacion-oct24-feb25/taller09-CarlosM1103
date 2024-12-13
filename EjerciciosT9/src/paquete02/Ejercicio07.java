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
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

 
        double[] numeros = new double[10];
        double suma = 0;

   
        System.out.println("Introduce 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextDouble();
            suma += numeros[i];
        }

      
        double promedio = suma / 10;

     
        System.out.println("\nNúmero y su diferencia respecto al promedio (" + promedio + "):");
        for (int i = 0; i < 10; i++) {
            double diferencia = numeros[i] - promedio;
            System.out.println("Número " + (i + 1) + ": " + numeros[i] + " | Diferencia: " + diferencia);
        }

    
    }
}

    


