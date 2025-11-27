package com.proyecto.fisica;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CoefA {

    // Método para calcular el coeficiente A (pendiente de la recta)
    public static double calcularCoefA(double[] tiempos, double[] posiciones) {
        double sumaXY = 0.0;
        double sumaX2 = 0.0;
        double sumaY = 0.0;

        for (int i = 0; i < tiempos.length; i++) {
            sumaXY += tiempos[i] * posiciones[i];  // Suma de x * y
            sumaX2 += tiempos[i] * tiempos[i];     // Suma de x^2
            sumaY += posiciones[i];                // Suma de y
        }

        // Cálculo del coeficiente A usando el método de mínimos cuadrados
        double A = (sumaXY - sumaY * sumaX2 / tiempos.length) / (sumaX2 - sumaY * sumaY / tiempos.length);
        
        return A;
    }

    public static void main(String[] args) {
        // Ruta de los archivos CSV
        String[] archivosCSV = {
            "src/main/resources/Tabla1.csv", 
            "src/main/resources/Tabla2.csv", 
            "src/main/resources/Tabla3.csv",
            "src/main/resources/Tabla4.csv", 
            "src/main/resources/Tabla5.csv", 
            "src/main/resources/Tabla6.csv"
        };

        List<double[]> tiemposList = new ArrayList<>();
        List<double[]> posicionesList = new ArrayList<>();

        // Leer los archivos CSV y almacenar los datos
        for (String archivo : archivosCSV) {
            try {
                double[][] datos = CSVReader.leerCSV(archivo); // Leer el CSV
                
                // Extraer tiempos y posiciones de cada archivo CSV
                for (double[] fila : datos) {
                    tiemposList.add(new double[]{fila[0]});  // Tiempo
                    posicionesList.add(new double[]{fila[1]});  // Posición
                }
            } catch (IOException e) {
                System.err.println("Error al leer el archivo CSV: " + e.getMessage());
            }
        }

        // Convertir las listas de tiempos y posiciones en arreglos
        double[] tiempos = new double[tiemposList.size()];
        double[] posiciones = new double[posicionesList.size()];

        for (int i = 0; i < tiemposList.size(); i++) {
            tiempos[i] = tiemposList.get(i)[0];  // Tiempo
            posiciones[i] = posicionesList.get(i)[0];  // Posición
        }

        // Calcular el coeficiente A
        double coefA = calcularCoefA(tiempos, posiciones);

        // Imprimir el valor calculado de A
        System.out.println("El coeficiente A es: " + coefA);
    }
}
