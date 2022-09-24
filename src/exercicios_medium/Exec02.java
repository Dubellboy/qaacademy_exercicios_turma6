package exercicios_medium;
/*
Exercício 2 - Faça um algoritmo para ler um valor de investimento, com uma taxa
de juros de 5% a.a. Ao final de 10 anos, exibir o valor investido, valor dos juros, e
o total. Considerando que a remuneração será no regime de juros compostos.
 */

import javax.swing.*;

public class Exec02 {
    public static void main(String[] args) {

        double valorInv = 0, taxaJuros = 0.05, valorJuros = 0, valorTotal = 0;
        int i = 1;
        valorInv = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento"));
        while (i <= 10){
        valorJuros = ((valorJuros + valorInv)*taxaJuros) + valorJuros;
        i++;
        }
        valorTotal = valorInv + valorJuros;
        System.out.println("O valor investido é de: " +  valorInv);
        System.out.println("O valor do juros em 10 anos é : " + Math.round(valorJuros));
        System.out.println("Valor total: " + Math.floor(valorTotal));

    }
}
