package exercicios_medium;
/*
Exercício 3 - Faça um algoritmo para calcular e exibir a soma de todos os
números de 0 a 1000. E parar se caso a soma atingir 1500(ou mais).
 */
public class Exec03 {
    public  void somaNumeros() {
        int i = 0;
        int soma = 0;
        for (int num = 1; i <= 1000; i++) {
            soma = soma + i;
            if (soma >= 1500) {
                break;

            }
            System.out.println("A soma é : " + i + " = " + soma);

        }
    }
}