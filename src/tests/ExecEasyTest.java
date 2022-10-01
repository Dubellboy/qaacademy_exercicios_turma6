package tests;

import exercicios_easy.Exec2;
import exercicios_easy.Exec4;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExecEasyTest {

    @Test
    public void testeDeJuncaoPalavra(){
        Exec2 exec2 = new Exec2();
        String retorno = exec2.exibirPalavra("Carro");
        assertEquals("A palavra é: Carro",retorno);

    }
    @Test
    public void testeDobro(){
        Exec4 exec4 = new Exec4();
        int retorno = exec4.calculoDobro(10);
        assertEquals("O dobro é inválido",30,retorno);
    }

}
