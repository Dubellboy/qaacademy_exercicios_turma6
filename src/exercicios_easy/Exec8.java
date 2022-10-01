package exercicios_easy;
/*
Faça um algoritmo para ler um valor de salário, calcular e exibir o
valor do salário bruto, valor do salário líquido e o valor do imposto de renda.
Respeitando a tabela abaixo:
 */

import javax.swing.*;

public class Exec8 {
    public double [] calculoImpostoRenda(double salario) {

        double valorBruto =0 ;
        double valorImposto = 0 ;
        double salarioLiquido = 0 ;
        double resultado [] = new double[4];


        if(salario <= 1903.98){
            System.out.println("Isento de imposto de renda");
        }if(salario >= 1903.99 && salario  <= 2826.65){
            valorImposto = (salario * 7.5)/100;
            salarioLiquido = salario - valorImposto;
            valorBruto = valorImposto + salario;
        }if(salario >= 2826.66 && salario <= 3751.05){
            valorImposto = (salario * 15)/100;
            salarioLiquido = salario - valorImposto;
            valorBruto = valorImposto + salario;
        }if(salario >= 3751.06 && salario <= 4664.68){
            valorImposto = (salario * 22.5)/100;
            salarioLiquido = salario - valorImposto;
            valorBruto = valorImposto + salario;
        }if(salario >= 4664.68){
            valorImposto = (salario * 27.5)/100;
            salarioLiquido = salario -valorImposto;
            valorBruto = valorImposto + salario;
        }
        resultado[0] = salario;
        resultado[1] = valorImposto;
        resultado[2] = valorBruto;
        resultado[3] = salarioLiquido;

        return resultado;
    }


}
