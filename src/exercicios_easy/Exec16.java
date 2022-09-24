package exercicios_easy;
/*
Exercício 5 - Faça um algoritmo para ler 5 números, verificar e exibir, quais dos 5
números digitados, é o menor.
 */

import javax.swing.*;

public class Exec16 {
    public static void main(String[] args) {

       int menor =0;
       int vetor[] = new int[5];
       for (int i = 0;i < vetor.length;i++){
        vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
           System.out.println(vetor[i]);
       }



    }
}
