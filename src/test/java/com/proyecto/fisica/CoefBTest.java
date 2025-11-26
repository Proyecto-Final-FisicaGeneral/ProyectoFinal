package com.proyecto.fisica;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CoefBTest {

    @Test
    public void testCalcularCoefB() throws Exception {
        double[][] datos = CSVReader.leerCSV("src/main/resources/Tabla1.csv");  // Lee los datos de la tabla
        double[] t = new double[datos.length];
        double[] v = new double[datos.length];
        
        for (int i = 0; i < datos.length; i++) {
            t[i] = datos[i][0];  // Tiempo
            v[i] = datos[i][2];  // Velocidad
        }

        double resultado = MinimosCuadrados.calcularB(t, v);
        double esperado = 3.0;  // Modificar según el valor esperado
        assertEquals(esperado, resultado, 0.001);
    }
}
