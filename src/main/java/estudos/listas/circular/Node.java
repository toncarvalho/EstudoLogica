package estudos.listas.circular;

/**
 * Created by ton on 9/15/14.
 */
public class Node {
    Object elemento;
    Node proximo;
    Node anterior;

    public Node(Object elemento, Node proximo, Node anterior) {
        this.elemento = elemento;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public Node() {

    }


}
