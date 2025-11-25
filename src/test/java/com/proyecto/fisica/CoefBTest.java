package com.proyecto.fisica;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CoefBTest {

    @Test
    public void testCalcularCoefB() {
        double[] x = {0.0, 1.0, 2.0, 3.0};
        double[] v = {0.0, -0.485, -0.923, -1.271};

        double resultado = CoefB.calcularB(x, v);
        double esperado = 3.0; // Asumiendo que el valor de B debería ser 3.0

        assertEquals(esperado, resultado, 0.001);
    }
}
