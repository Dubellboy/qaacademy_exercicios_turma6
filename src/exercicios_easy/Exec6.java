package exercicios_easy;
/*
Faça um algoritmo para ler duas notas, calcular a média. E
SE - a média > 5 Exibir aprovado, SE a média < 5 exibir reprovado, se media = 5
exibir exame.
 */

public class Exec6 {
    public static String calculoMedia(float nota1, float nota2) {
        float media;
        String retorno = null;
        media = (nota1 + nota2) / 2;
        if (media > 5) {
            retorno = "Aprovado";
        }
        if (media < 5) {
            retorno = "Reprovado";
        }
        if (media == 5) {
            retorno = "Exame";
        }
       return retorno;
    }
}
