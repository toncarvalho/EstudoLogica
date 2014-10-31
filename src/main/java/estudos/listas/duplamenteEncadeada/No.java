package estudos.listas.duplamenteEncadeada;

/**
 * Created by ton on 9/11/14.
 */
public class No {
    Object elemento;
    No proximo;
    No anterior;

    public No(final Object elemento, No anterior, No proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
        this.anterior = anterior;

    }

    public No(final Object elemento) {
        this.elemento = elemento;


    }
}
