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
    private int numeroNos = 0;

    public ListaCircular() {
        inicializacao();
    }

    private void inicializacao() {
        primeiro = null;
        ultimo = null;
        numeroNos = 0;
    }

    /**
     * @param elemento a função retorna -1 em caso de falha, caso tenhamos sucesso retorna 0
     */
    public int add(final String elemento) {
        //Alocação da memória para o novo elemento
        //Preenchimento do campo de dados do novo elemento
        //O ponteiro seguinte do novo elemento apontará para ele mesmo (é a etapa que torna a lista circular)

        if (numeroNos > 0) {
            return addEmListaNaoVazia(elemento);

        } else {
            return addEmListaVazia(elemento);
        }


    }


    /**
     * * Declaração de elementoos a serem inseridos
     * Alocação da memória para o novo elementoo
     * Preenchimento do conteúdo do campo de dados
     * Atualização dos ponteiros para o primeiro e o último elemento, se necessário.
     * Caso especial: em uma lista com um único elemento, o primeiro também é o último.
     * Atualização do tamanho da fila
     *
     * @param elemento
     */
    private int addEmListaVazia(String elemento) {
        try {
            NoCircular node = new NoCircular();
            node.elemento = elemento;
            this.primeiro = node;
            this.ultimo = node;
            this.numeroNos++;

            return 0;
        } catch (Exception e) {

            e.printStackTrace();
            return -1;

        }

    }

    /**
     * 1 - Alocação da memória para o novo elemento
     * 2 - Preenchimento do campo de dados do novo elemento
     * 3 - O ponteiro seguinte do novo elemento aponta para o endereço do primeiro elemento (manter a lista circular)
     * 4 - O ponteiro de início não muda
     * 5 - O ponteiro de fim aponta para o novo elemento
     * 6 - O tamanho é incrementado com uma unidade
     *
     * @param elemento
     * @return
     */
    private int addEmListaNaoVazia(String elemento) {
        //o ponteiro seguinte do último elemento apontará para o primeiro elemento da lista

        try {
            //1 - Alocação da memória para o novo elemento
            NoCircular novoNo = new NoCircular();
            //2 - Preenchimento do campo de dados do novo elemento
            novoNo.elemento = elemento;

            //O ponteiro seguinte do novo elemento aponta para o endereço do primeiro elemento (manter a lista circular)
            novoNo.seguinte = this.primeiro;

            //4 - O ponteiro de início não muda
            //this.anterior = novoNo;

            //5 - O ponteiro de fim aponta para o novo elemento
            //novoNo.anterior =
            this.ultimo = novoNo;

            //6 - O tamanho é incrementado com uma unidade
            this.numeroNos++;

            return 0;
        } catch (Exception e) {

            e.printStackTrace();
            return -1;

        }
    }

    /**
     * Para exibir a lista inteira você deverá se posicionar no início da lista (isso é possível com o ponteiro de início).
     * Em seguida, ao usar o ponteiro seguinte de cada elemento, a lista é percorrida do primeiro ao último elemento.
     * Em comparação com as listas simples e duplamente encadeadas, onde a condição de parada é dada pela ponteiro seguinte do último elemento, que equivale a NULL para a lista circular, não há ponto de parada, a menos que você escolha um.
     * <p/>
     * Veja duas variantes de exibição:
     * Exibição da lista (do primeiro para o último elemento)
     * Exibição da lista, sem condição de parada (ao infinito)
     */
    public void exibirListaDoPrimeiroAoUltimo() {

        NoCircular noAtual = this.primeiro;

        if (this.numeroNos > 0) {
            for (int i = 0; i < this.numeroNos; i++) {
                System.out.println(" Nó: " + i + " elemento: " + noAtual.elemento);

                noAtual = noAtual.seguinte;
            }
        }


    }

    public void exibeListaInfinito() {

        while (true) {
            NoCircular noAtual = this.primeiro;
            System.out.println(" elemento: " + noAtual.seguinte.elemento);
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
