package exercicios_easy;

import javax.swing.*;

public class Exec9 {
    public String [] calculadora(int numero) {
        int resultado = 0;
        String retorno;
        int i = 1;
        int j = 0;
        String calculo[] = new String[10];


        while(i <=10){
            resultado = numero * i;
            retorno = numero + " X " + i + " =  " + resultado;
            calculo[j] = retorno;
            i++;
            j++;

        }
        return calculo;

    }
}
