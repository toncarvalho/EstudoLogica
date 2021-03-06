package listas.circulares;

import estudos.listas.circular.ListaCircular;
import estudos.listas.circular.No;
import org.junit.Test;

/**
 * Created by ton on 9/15/14.
 */
public class TesteListaCircular {

    @Test
    public void testeLista() {


        ListaCircular lista = new ListaCircular();

        lista.add(new No("Joselito"));
        lista.add(new No("Peter"));
        lista.add(new No("Mano"));
        lista.add(new No("Mimimi"));

        System.out.println("Imprimindo todos os elementos da lista");

        lista.imprimir();

        System.out.println("\n Remove o primeiro item da lista\n");
        lista.removeItem();
        lista.imprimir();

        System.out.println("\n Remove o próximo\n");
        lista.removeItem();
        lista.imprimir();

        System.out.println("\n Remove o próximo\n");
        lista.removeItem();
        lista.imprimir();


    }
}
