package exercicios_easy;

import javax.swing.*;

public class Exec10 {
    public static void main(String[] args) {
        double invest, taxa = 0.05, valorJuros = 0,valorTotal;
        int i =1;
        invest = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimentp"));
        while( i <= 10) {
            valorJuros = (invest * taxa) + valorJuros;
            i++;

        }
        valorTotal = valorJuros + invest;
        System.out.println("O valor do investimento é de: " + invest);
        System.out.println("O valor do juros é de:  " + Math.floor((valorJuros)));
        System.out.println("O valor total é de:  " + Math.floor(valorTotal));
    }
}
