package exercicios_medium;
/*
Exercício 7 - Faça um algoritmo para ler todos os meses do ano, armazene em um
vetor.
*/

import javax.swing.*;

public class Exec07 {
    public static void main(String[] args) {
        String mes [] = new String[12];
        for (int i = 0; i <= 11; i++) {
            mes[i] = JOptionPane.showInputDialog("Digite o mês");
            System.out.println(mes[i]);
        }

    }
}
