package estudos.listas.circular;

/**
 * A lista circular é uma espécie de lista simplesmente ou duplamente encadeada, com uma característica adicional para o deslocamento na
 * lista, "ela não tem fim". Para tornar a lista interminável, o ponteiro seguinte do último elemento apontará para o primeiro elemento da
 * lista, em vez do valor NULL, como vimos no caso das listas simplesmente e duplamente encadeadas. Nas listas circulares, nunca chegaremos
 * a uma posição a partir da qual não poderemos mais nos mover. Chegando ao último elemento, o deslocamento vai recomeçar no primeiro
 * elemento. Em suma, trata-se de uma rotação. veja mais em:  http://pt.kioskea.net/faq/10226-listas-circulares-ring-buffer
 */
public class ListaCircular {
    private NoCircular primeiro;
    private NoCircular ultimo;
    private int numeroNos;

    public ListaCircular() {
        inicializacao();
    }

    private void inicializacao() {
        primeiro = null;
        ultimo = null;
        numeroNos = 0;
    }

    public void add(final String elemento) {


    }
}
