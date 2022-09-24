package exercicios_easy;

import javax.swing.*;

/*
Exercício 8 - Faça um algoritmo para exibir todos os meses digitados
anteriormente.
 */
public class Exec19 {
    public static void main(String[] args) {
        String mes [] = new String[12];
        for(int i = 0; i <=11; i++){
            mes[i] =JOptionPane.showInputDialog("Digite o mês:");
            System.out.println(mes[i]);
        }
    }
}
