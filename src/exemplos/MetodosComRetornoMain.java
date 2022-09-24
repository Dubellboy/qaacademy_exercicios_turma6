package exemplos;

public class MetodosComRetornoMain {
    public static void main(String[] args) {
        String texto = saoPaulo();
        System.out.println(texto);
        String texto1 = salvador();
        System.out.println(texto1);
        String texto2 = rioJaneiro();
        System.out.println(texto2);
        String texto3 = ceara();
        System.out.println(texto3);
        String texto4 = maringa();
        System.out.println(texto4);
    }
    public static String saoPaulo(){
        return "saoPaulo";
    }
    public static String rioJaneiro(){
        return "RioJaneiro";
    }
    public static String ceara(){
        return "Ceara";
    }
    public static String maringa(){
        return "Maringa";
    }
    public static String salvador(){
        return "Salvador";
    }
}
