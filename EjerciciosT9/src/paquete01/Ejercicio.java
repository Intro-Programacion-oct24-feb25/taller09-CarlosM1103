/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número de marcas de vehiculos que "
                + "desea ingresar:");
        int elementos = leer.nextInt();
        String[] arreglo = new String[elementos];
        String marca;
        String cadenaF = "";
        leer.nextLine();
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese una marca de un vehiculo:");
           
            marca = leer.nextLine();

            if (marca.length() > 0) {
                String primeraletra = marca.substring(0, 1);
                
                if (primeraletra.equals("A")
                    || primeraletra.equals("C")
                    || primeraletra.equals("T")) {
                    
                 
                } else {
                    arreglo [i] = marca;
              
                    cadenaF = String.format("%s%s\n", cadenaF,arreglo[i]);
                }
            }

        }
        
        System.out.printf("\n%s",cadenaF);
   
    }

}
