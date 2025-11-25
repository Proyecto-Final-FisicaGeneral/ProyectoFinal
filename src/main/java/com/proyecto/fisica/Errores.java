package com.proyecto.fisica;

public class Errores {

    public static double[] calcularErrores(double[] x, double[] v) {
        // Usar el método ajustar de MinimosCuadrados para obtener los errores
        MinimosCuadrados.Resultado resultado = MinimosCuadrados.ajustar(x, v);
        return new double[] { resultado.getSigmaA(), resultado.getSigmaB(), resultado.getSigmaY() };
    }
}
