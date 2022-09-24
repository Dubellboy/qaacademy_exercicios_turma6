package exercicios_easy;

import javax.swing.*;
/*
Faça um algoritmo para ler um valor de salário, calcular e exibir o
valor do INSS a ser pago. Respeitando a tabela abaixo:
 */

public class Exec7 {
    public static void main(String[] args) {
        double salario, inss, calculo;
        salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o salario"));
        if (salario <= 1045) {
            calculo = salario * 07.5;
            System.out.println("O valor do salário é: " + salario);
            System.out.println("O valor do inss é: " + calculo);

        }
        if (salario >= 1045.01 && salario <= 2089.60) {
            calculo = salario * 0.09;
            System.out.println("O valor do salário é: " + salario);
            System.out.println("O valor do inss é: " + calculo);

        }
        if (salario >= 2089.61 && salario <= 3134.40) {
            calculo = salario * 0.12;
            System.out.println("O valor do salário é: " + salario);
            System.out.println("O valor do inss é: " + calculo);

        }
        if (salario >= 3134.41) {
            calculo = salario * 0.14;
            System.out.println("O valor do salário é: " + salario);
            System.out.println("O valor do inss é: " + calculo);

        }

    }


}

