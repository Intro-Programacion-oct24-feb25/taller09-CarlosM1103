/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author reroes
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double total = 0;
        double valor = 0;
        int cantidad;
        int menu;
        String salida;
        String cadena = "El usuario a comprado:\n\n ";
        boolean bandera = true;
        String[] arreglo = {"Cafe tradicional", "Cafe frances", "Cafe aleman"};
        double[] arreglo1 = {1.5, 2.1, 2.3};

        while (bandera) {

            System.out.println("Ingrese el producto que desea");
            menu = entrada.nextInt();
            System.out.println("Ingrese cantidad que desea");
            cantidad = entrada.nextInt();

            valor = valor + arreglo1[menu] * cantidad;
            total = total + valor;

            cadena = String.format(" %s %s (%d t), valor a cancelar $%.2f",
                    cadena,
                    arreglo[menu],
                    cantidad,
                    total);

            entrada.nextLine();

            System.out.println("Presione s si desea salir del ciclo");
            salida = entrada.nextLine();

            if (salida.equals("s")) {
                bandera = false;

            }

            System.out.println(cadena);

        }
    }
}
