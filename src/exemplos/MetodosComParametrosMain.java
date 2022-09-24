package exemplos;

public class MetodosComParametrosMain {
    public static void main(String[] args) {
        int soma = soma(1, 2);
        System.out.println("A soma é: " + soma);

        text("Bom", " dia");

        double media = media(5,6);
        System.out.println(media);

        String nome = nome("João");
        System.out.println("O nome digitado é: " + nome);

        frase("A casa de papel");

        dataNasc(29,12,1984);

        String notaFinal = notaEscola(2,2);
        System.out.println(notaFinal);

        int [] x = criarVetorNumero(10,20);
        System.out.println("Vetor 1: " + x[0]+ " Vetor 2: " + x[1]);

    }

    public static int soma(int n1, int n2) {
        int calculo = n1 + n2;
        return calculo;
    }

    public static double media(double nota1, double nota2){
        double calculo = (nota1+nota2)/2;
        return calculo;
    }
    public static String nome(String nome){
        return nome;
    }
    public static String notaEscola(double n1, double n2){
        if((n1 + n2) /2 >= 5){
            return "Aprovado";
        }else {
            return "Reprovado";
        }
    }


    public static void text(String a, String b) {
        System.out.println("O texto é: " + a + b);
    }
    public static void frase(String frase) {
        System.out.println("A frase é: " + frase);
    }
    public static void dataNasc(int dia, int mes, int ano){
        System.out.println(dia + " / " + mes + " / " + ano);

    }
    public static int[] criarVetorNumero(int num1, int num2) {
        int[] vetor = new int[2];
        vetor[0] = num1;
        vetor[1] = num2;
        return vetor;
    }
}
