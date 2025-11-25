package com.proyecto.fisica;

import java.io.IOException;

public class CoefA {

    public static double calcularA(String pathCSV) throws IOException {
        // Leer los datos del CSV
        double[][] datos = CSVReader.leerCSV(pathCSV);

        // Suponiendo que la primera columna es tiempo (t) y la segunda columna es posición (x)
        double[] t = new double[datos.length];
        double[] x = new double[datos.length];

        for (int i = 0; i < datos.length; i++) {
            t[i] = datos[i][0]; // Tiempo
            x[i] = datos[i][1]; // Posición
        }

        // Calcular el coeficiente A utilizando el método de MinimosCuadrados
        return MinimosCuadrados.calcularA(t, x);
    }
}
