package exercicios_medium;

/*
Exercício 1 - Faça um algoritmo para verificar e exibir de 0 a 100, quais são os
números Pares e ímpares.

 */

public class Exec01 {
    public static void main(String[] args) {
        int i = 0;
        for (int num =0;i <= 100;i++){
            if(i % 2 == 0) {

                System.out.println("Número   par" + " = " + i);
            }else{
                System.out.println("Número impar" + " = " + i);
            }
        }
    }
}