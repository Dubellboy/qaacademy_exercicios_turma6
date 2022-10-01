package exercicios_easy;

import javax.swing.*;
/*
Faça um algoritmo para ler um valor de salário, calcular e exibir o
valor do INSS a ser pago. Respeitando a tabela abaixo:
 */

public class Exec7 {
    public double valorInss(double salario) {
        double calculo;
        double retorno = 0  ;
        if (salario <= 1045) {
            calculo = salario * 07.5;
            retorno =  calculo;

        }
        if (salario >= 1045.01 && salario <= 2089.60) {
            calculo = salario * 0.09;
            retorno = calculo;

        }
        if (salario >= 2089.61 && salario <= 3134.40) {
            calculo = salario * 0.12;
            retorno =  calculo;

        }
        if (salario >= 3134.41) {
            calculo = salario * 0.14;
            retorno = calculo;

        }
        return retorno;

    }


}

