package estudos.listas.ligada;

/**
 * Created by ton on 9/11/14.
 */
public class No {
    Object elemento;
    No proximo;

    public No(final Object elemento) {
        this.elemento = elemento;
        proximo = null;
    }
}
