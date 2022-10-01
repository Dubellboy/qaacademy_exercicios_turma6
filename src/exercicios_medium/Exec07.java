package exercicios_medium;
/*
Exercício 7 - Faça um algoritmo para ler todos os meses do ano, armazene em um
vetor.
*/

import javax.swing.*;

public class Exec07 {
    public  void  mostraMes(){
        String mes [] = new String[12];

        mes[0] = "Janeiro";
        mes[1] = "Fevereiro";
        mes[2] = "Março";
        mes[3] = "Abril";
        mes[4] = "Maio";
        mes[5] = "Junho";
        mes[6] = "Julho";
        mes[7] = "Agosto";
        mes[8] = "Setembro";
        mes[9] = "Outubro";
        mes[10] = "Novembro";
        mes[11] = "Dezembro";

        for (int i =0;i <= 11; i++){

            System.out.println(mes[i]);
        }

    }
}
