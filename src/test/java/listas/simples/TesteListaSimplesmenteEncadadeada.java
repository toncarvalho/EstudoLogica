package listas.simples;

import estudos.listas.simplesmenteEncadeada.ListaSimplesmenteEncadadeada;
import org.junit.Test;

/**
 * Created by ton on 9/11/14.
 */
public class TesteListaSimplesmenteEncadadeada {

    @Test
    public void testeLista() {

        ListaSimplesmenteEncadadeada lista = new ListaSimplesmenteEncadadeada();
        if (lista.isVazia()) {
            System.out.println(" A lista esta vazia");
        } else {
            System.out.println(" A lista NÃO esta vazia");
        }

        String e1 = "André";
        String e2 = "João";
        String e3 = "José";
        String e4 = "Carmelo";

        lista.addFinal(e1);
        lista.addFinal(e2);
        lista.addFinal(e3);
        lista.addFinal(e4);

        if (lista.isVazia()) {
            System.out.println(" A lista esta vazia");
        } else {
            System.out.println(" A lista NÃO esta vazia");
            System.out.println(" A LISTA CONTÉM:" + lista.getNumeroNos() + " Nós");
        }

        lista.mostraElementos();
    }
}
