package com.projeto.verificador.service;

import com.projeto.verificador.model.ResultadoSistema;
import com.projeto.verificador.model.SistemaLinear;
import org.springframework.stereotype.Service;

@Service
public class SistemaService {

    public ResultadoSistema resolver(SistemaLinear sistema) {
        double[][] A = sistema.getMatriz();
        double[] B = sistema.getTermos();

        int n = A.length;

        if (n != B.length || (n != 2 && n != 3)) {
            return new ResultadoSistema("Sistema não suportado", null);
        }

        double detA = determinante(A);
        if (detA == 0) {
            return new ResultadoSistema("Sistema impossível ou indeterminado", null);
        }

        double[] solucao = new double[n];

        for (int i = 0; i < n; i++) {
            double[][] Ai = substituirColuna(A, B, i);
            solucao[i] = determinante(Ai) / detA;
        }

        return new ResultadoSistema("Sistema compatível determinado", solucao);
    }

    private double[][] substituirColuna(double[][] matriz, double[] termos, int coluna) {
        int n = matriz.length;
        double[][] nova = new double[n][n];
        for (int i = 0; i < n; i++) {
            System.arraycopy(matriz[i], 0, nova[i], 0, n);
            nova[i][coluna] = termos[i];
        }
        return nova;
    }

    private double determinante(double[][] m) {
        if (m.length == 2) {
            return m[0][0]*m[1][1] - m[0][1]*m[1][0];
        } else if (m.length == 3) {
            return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
                 - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
                 + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
        }
        return 0;
    }
}
