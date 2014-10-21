package listas;

import estudos.listas.circular.ListaCircular;
import org.junit.Test;

/**
 * Created by ton on 9/15/14.
 */
public class TesteListaLigadaCircular {

    @Test
    public void testeLista() {
        ListaCircular lista = new ListaCircular();
        lista.add("Joselito");
        lista.add("Peter");
        lista.add("Mano");
        lista.add("Mimimi");

        lista.exibirListaDoPrimeiroAoUltimo();

        lista.exibeListaInfinito();


    }
}