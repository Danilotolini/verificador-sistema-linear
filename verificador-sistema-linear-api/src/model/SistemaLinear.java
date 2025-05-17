package com.projeto.verificador.model;

public class SistemaLinear {
    private double[][] matriz;
    private double[] termos;

    public double[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(double[][] matriz) {
        this.matriz = matriz;
    }

    public double[] getTermos() {
        return termos;
    }

    public void setTermos(double[] termos) {
        this.termos = termos;
    }
}
