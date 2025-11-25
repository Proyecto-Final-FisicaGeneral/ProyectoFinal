package com.proyecto.fisica;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class ErroresTest {

    @Test
    public void testErroresCoeficientes() {
        double[] x = {0.0, 1.0, 2.0, 3.0};
        double[] v = {0.0, -0.485, -0.923, -1.271};

        double[] errores = Errores.calcularErrores(x, v);

        assertTrue(errores[0] >= 0);  // Error en A
        assertTrue(errores[1] >= 0);  // Error en B
        assertTrue(errores[2] >= 0);  // Error en Y
    }
}
