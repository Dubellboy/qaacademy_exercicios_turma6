package exercicios_easy;

import javax.swing.*;

public class Exec10 {
    public double [] jurosSimples(double invest) {
        double taxa = 0.05, valorJuros = 0,valorTotal;
        int i =1;
        double resultado[] = new double[3];

        while( i <= 10) {
            valorJuros = (invest * taxa) + valorJuros;
            i++;

        }
        valorTotal = valorJuros + invest;
        resultado[0] = invest;
        resultado[1] = Math.floor((valorJuros));
        resultado[2] = Math.floor(valorTotal);
        return resultado;
    }

}
