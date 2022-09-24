package exercicios_easy;
/*
Faça um algoritmo para ler um valor de salário, calcular e exibir o
valor do salário bruto, valor do salário líquido e o valor do imposto de renda.
Respeitando a tabela abaixo:
 */

import javax.swing.*;

public class Exec8 {
    public static void main(String[] args) {
        double salario;
        double valorBruto =0 ;
        double valorImposto = 0 ;
        double salarioLiquido = 0 ;

        salario = Integer.parseInt((JOptionPane.showInputDialog("Digite o valor do salário: ")));

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
        System.out.println("O valor do salário é: "+ salario);
        System.out.println("O valor do INSS é : " + valorImposto);
        System.out.println("O valor bruto do salário é: " + valorBruto);
        System.out.println("O valor do salário líquido é: " + salarioLiquido);
    }

}
