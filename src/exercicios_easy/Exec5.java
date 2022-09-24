package exercicios_easy;
/*
Faça um algoritmo para ler três números inteiros, armazenar em
variáveis, e exibir a soma, a subtração, multiplicação e a média dos três números
digitados.
 */

import javax.swing.*;
import javax.swing.plaf.OptionPaneUI;

public class Exec5 {
    public int soma(int num1, int num2, int num3) {
        int soma;
        soma = num1 + num2 + num3;
        return soma;

    }

    public int sub(int num1, int num2, int num3) {

        int sub = num1 - num2 - num3;
        return sub;
    }

    public int multiplicacao(int num1, int num2, int num3) {
        int mult = num1 * num2 * num3;
        return mult;
    }

    public int divisao(int num1, int num2, int num3) {
        int div = num1 / num2 / num3;
        return div;
    }

    public int media(int num1, int num2, int num3) {
        int media = (num1 + num2) / 3;
        return media;
    }
}
