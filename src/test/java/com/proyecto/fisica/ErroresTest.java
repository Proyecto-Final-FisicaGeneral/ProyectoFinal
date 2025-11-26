package com.proyecto.fisica;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class ErroresTest {

    @Test
    public void testErroresCoeficientes() throws Exception {
        double[][] datos = CSVReader.leerCSV("src/main/resources/Tabla1.csv");
        double[] t = new double[datos.length];
        double[] x = new double[datos.length];
        
        for (int i = 0; i < datos.length; i++) {
            t[i] = datos[i][0];  // Tiempo
            x[i] = datos[i][1];  // Posición
        }

        double[] errores = Errores.calcularErrores(t, x);
        
        assertTrue(errores[0] >= 0);  // Error en A
        assertTrue(errores[1] >= 0);  // Error en B
    }
}
