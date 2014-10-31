package listas.simples;

import estudos.listas.duplamenteEncadeada.ListaDuplamenteEncadadeada;
import estudos.listas.duplamenteEncadeada.No;
import org.junit.Test;

/**
 * Created by ton on 31/10/14.
 */
public class TesteListaDuplamenteEncadeada {

    @Test
    public void teste() {

        ListaDuplamenteEncadadeada lista  = new ListaDuplamenteEncadadeada();

        lista.addFinal("Maria");
        lista.addFinal("Peter");
        lista.addFinal("Marcos");

        lista.mostraElementos();

    }
}
