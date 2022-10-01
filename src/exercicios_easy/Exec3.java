package exercicios_easy;

import javax.swing.*;

public class Exec3 {
    public String trocarOrdem(String nome, String sobrenome) {
        String auxiliar = nome;
        nome = sobrenome;
        sobrenome = auxiliar;
        return "O sobrenome é: " + sobrenome + " " + nome;
    }
}
