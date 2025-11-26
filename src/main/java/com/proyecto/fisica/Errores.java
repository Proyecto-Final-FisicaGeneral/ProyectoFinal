package com.proyecto.fisica;

public class Errores {

    public static double[] calcularErrores(double[] x, double[] y) {
        // Llama al método ajustar de MinimosCuadrados para obtener los errores
        MinimosCuadrados.Resultado resultado = MinimosCuadrados.ajustar(x, y);
        return new double[] { resultado.getA(), resultado.getB() };  // Retorna A y B
    }
}
