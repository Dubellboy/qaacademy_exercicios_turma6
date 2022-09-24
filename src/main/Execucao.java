package main;

import exemplos.MetodosSemMain;

public class Execucao {
    public static void main(String[] args) {
        MetodosSemMain metodos = new MetodosSemMain();

        int idade = metodos.idade;
        String carro = metodos.carro;

        System.out.println("Minha idade é: " + idade + " meu carro é um " + carro);

        metodos.somar(2, 3);

        String nomeSobrenome = metodos.nomeSobrenome("Eduardo", " Chagas");
        System.out.println(nomeSobrenome);

        metodos.time();

    }
}
