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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan",
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        String cualidad = "";
        for (int i = 0; i < promediosCualitativos.length; i++) {

            if (promedios[i] >= 0 && promedios[i] <= 5.9) {
                cualidad = "Regular";
            } else {
                if (promedios[i] >= 6 && promedios[i] <= 8.9) {
                    cualidad = "Buena";
                } else {
                  cualidad = "Sobresaliente";  
                }
            }
                promediosCualitativos[i] = estudiantes[i] + " promedio: " + promedios[i] + " promedio cualitativo " + cualidad;

            }
        for (int i = 0; i < promediosCualitativos.length; i++){
            System.out.println(promediosCualitativos[i]);
        }
        

        }
}
