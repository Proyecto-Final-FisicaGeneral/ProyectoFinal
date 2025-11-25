package com.proyecto.fisica;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.knowm.xchart.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GraficosMAS {

    public static void main(String[] args) {
        // Nombres de los archivos CSV dentro de resources/
        String[] archivos = {
                "Tabla1.csv",
                "Tabla2.csv",
                "Tabla3.csv",
                "Tabla4.csv",
                "Tabla5.csv",
                "Tabla6.csv"
        };

        // Títulos para cada tabla
        String[] titulos = {
                "Tabla 1 - Masa 4m",
                "Tabla 2 - Masa 3m",
                "Tabla 3 - Masa 3m",
                "Tabla 4 - Masa 2m",
                "Tabla 5 - Masa 2m",
                "Tabla 6 - Masa m"
        };

        for (int i = 0; i < archivos.length; i++) {
            String archivo = archivos[i];
            String titulo = titulos[i];

            try {
                graficarDesdeCSV(archivo, titulo);
            } catch (IOException e) {
                System.err.println("Error al leer el archivo " + archivo + ": " + e.getMessage());
            }
        }
    }

    /**
     * Lee un archivo CSV con columnas t, x, v y muestra un gráfico x(t) y v(t).
     *
     * @param archivoCSV nombre del archivo CSV (ruta relativa)
     * @param titulo     título del gráfico
     */
    private static void graficarDesdeCSV(String archivoCSV, String titulo) throws IOException {
        List<Double> tiempos = new ArrayList<>();
        List<Double> posiciones = new ArrayList<>();
        List<Double> velocidades = new ArrayList<>();

        // Leer el archivo CSV desde resources
        try (InputStreamReader reader = new InputStreamReader(GraficosMAS.class.getResourceAsStream("/" + archivoCSV));
             CSVParser csvParser = new CSVParser(
                     reader,
                     CSVFormat.DEFAULT
                             .withFirstRecordAsHeader()  // usa la primera fila como encabezado: t,x,v
                             .withIgnoreEmptyLines()
                             .withTrim()
             )) {

            for (CSVRecord record : csvParser) {
                double t = Double.parseDouble(record.get("t"));
                double x = Double.parseDouble(record.get("x"));
                double v = Double.parseDouble(record.get("v"));

                tiempos.add(t);
                posiciones.add(x);
                velocidades.add(v);
            }
        }

        double[] tArray = tiempos.stream().mapToDouble(Double::doubleValue).toArray();
        double[] xArray = posiciones.stream().mapToDouble(Double::doubleValue).toArray();
        double[] vArray = velocidades.stream().mapToDouble(Double::doubleValue).toArray();

        // Crear el gráfico
        XYChart chart = new XYChartBuilder()
                .width(800)
                .height(600)
                .title(titulo)
                .xAxisTitle("t (s)")
                .yAxisTitle("x(t), v(t)")
                .build();

        chart.addSeries("x(t)", tArray, xArray);
        chart.addSeries("v(t)", tArray, vArray);

        // Mostrar el gráfico en una ventana
        new SwingWrapper<>(chart).displayChart();
    }
}
