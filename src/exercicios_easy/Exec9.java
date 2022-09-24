package exercicios_easy;

import javax.swing.*;

public class Exec9 {
    public static void main(String[] args) {
        int numero, resultado = 0;
        int i = 1;

        numero = Integer.parseInt(JOptionPane.showInputDialog(("Digite o número")));
        while(i <=10){
            resultado = numero * i;
            System.out.println(numero + " X " + i + " =  " + resultado);
            i++;

        }

    }
}
