package exercicios_easy;

import javax.swing.*;

public class Exec11 {
    public String contador(int num) {

        int i = 1;
        String resultado = "";

        for (num = 10;i <=100;i++){
            num = num + 2;
            resultado = i + " = " + num;
        }
        return "A soma é "  + resultado;
    }
}
