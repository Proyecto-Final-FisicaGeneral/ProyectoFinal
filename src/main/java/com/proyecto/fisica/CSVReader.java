package com.proyecto.fisica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    // Método para leer los datos de un archivo CSV
    public static double[][] leerCSV(String path) throws IOException {
        List<double[]> datos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] valores = linea.split(",");
                double[] fila = new double[valores.length];
                for (int i = 0; i < valores.length; i++) {
                    fila[i] = Double.parseDouble(valores[i]);
                }
                datos.add(fila);
            }
        }

        // Convertir la lista de filas en una matriz de datos
        double[][] arrayDatos = new double[datos.size()][];
        for (int i = 0; i < datos.size(); i++) {
            arrayDatos[i] = datos.get(i);
        }
        return arrayDatos;
    }
}
