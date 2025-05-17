package com.projeto.verificador.model;

public class ResultadoSistema {
    private String tipoSolucao;
    private double[] solucao;

    public ResultadoSistema(String tipoSolucao, double[] solucao) {
        this.tipoSolucao = tipoSolucao;
        this.solucao = solucao;
    }

    public String getTipoSolucao() {
        return tipoSolucao;
    }

    public double[] getSolucao() {
        return solucao;
    }
}
