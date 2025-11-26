package com.proyecto.fisica;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CoefATest {

    @Test
    public void testCalcularCoefA() throws Exception {
        double[][] datos = CSVReader.leerCSV("src/main/resources/Tabla1.csv");  // Lee los datos de la tabla
        double[] t = new double[datos.length];
        double[] x = new double[datos.length];
        
        for (int i = 0; i < datos.length; i++) {
            t[i] = datos[i][0];  // Tiempo
            x[i] = datos[i][1];  // Posición
        }

        double resultado = MinimosCuadrados.calcularA(t, x);
        double esperado = 2.0;  // Modificar según el valor esperado
        assertEquals(esperado, resultado, 0.001);
    }
}
