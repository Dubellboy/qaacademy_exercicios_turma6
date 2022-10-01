package exercicios_medium;

/*
Exercício 5 - Faça um algoritmo para ler 5 números, verificar e exibir, quais dos 5
números digitados, é o menor.
 */

import javax.swing.*;

public class Exec05 {
    public void menorNumero(int num) {

        int menor =0;
        for (int i = 0;i < 5;i++){

            System.out.println("O número digitado é " + num);
       if(num < menor || i ==0 ) {
           menor = num;

       }

            }
            System.out.println("O menor número é: " + menor);

        }

    }

