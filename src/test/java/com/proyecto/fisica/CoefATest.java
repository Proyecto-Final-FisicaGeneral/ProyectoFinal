package com.proyecto.fisica;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.io.IOException;

public class CoefATest {

    @Test
    public void testCalcularCoefA() throws IOException {
        // Leer los datos del CSV
        double resultado = CoefA.calcularA("src/main/resources/Tabla1.csv");

        // Asumiendo que el valor esperado es 2.0 (modificar según tus datos)
        double esperado = 2.0;

        assertEquals(esperado, resultado, 0.001);
    }
}
