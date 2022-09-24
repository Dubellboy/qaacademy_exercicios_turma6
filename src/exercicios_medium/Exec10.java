package exercicios_medium;

import java.util.Arrays;

/*
Exercício 10 - Faça um algoritmo que calcule e exiba a sequencia de Fibonacci até
o 10º elemento. Ex.: 0, 1,1 .. 34. Usando Vetor, para armazenar o resultado.
A sequencia de Fibonacci, é calcula com a soma dos 2 termos anteriores, sendo o
primeiro e o segundo são 0 e 1, respectivamente. 0, 1, 1, 2, 3, 5, 8, 13 .. 21
 */
public class Exec10 {
    public static void main(String[] args) {
        int fib [] = new int[10];
        fib[1] = 1;
        for(int i = 2; i < fib.length;i++){
            fib[i]= fib[i - 1] + fib[i - 2];
        }
        System.out.println(Arrays.toString(fib));
    }
}
