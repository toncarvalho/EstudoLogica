package estudos.listas.circular;

/**
 * Created by ton on 9/15/14.
 */
public class NoCircular {
    Object elemento;
    NoCircular seguinte;
    NoCircular anterior;

    public NoCircular(Object elemento, NoCircular proximo, NoCircular anterior) {
        this.elemento = elemento;
        this.seguinte = proximo;
        this.anterior = anterior;
    }

    public NoCircular() {

    }


}