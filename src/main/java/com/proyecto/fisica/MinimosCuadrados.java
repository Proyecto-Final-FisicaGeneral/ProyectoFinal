package com.proyecto.fisica;

public class MinimosCuadrados {

    // Método para calcular el coeficiente A
    public static double calcularA(double[] x, double[] y) {
        return ajustar(x, y).getA();
    }

    // Método para calcular el coeficiente B
    public static double calcularB(double[] x, double[] v) {
        return ajustar(x, v).getB();
    }

    // Método para calcular el ajuste lineal utilizando el método de mínimos cuadrados
    public static Resultado ajustar(double[] x, double[] y) {
        int n = x.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        // Calcular sumas necesarias
        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
        }

        // Calcular los coeficientes A y B
        double B = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double A = (sumY - B * sumX) / n;

        return new Resultado(A, B);
    }

    // Clase interna para almacenar los resultados de A y B
    public static class Resultado {
        private final double A;
        private final double B;

        public Resultado(double A, double B) {
            this.A = A;
            this.B = B;
        }

        public double getA() {
            return A;
        }

        public double getB() {
            return B;
        }
    }
}
