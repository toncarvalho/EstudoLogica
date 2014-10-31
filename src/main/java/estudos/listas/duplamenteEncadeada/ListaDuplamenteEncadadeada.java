package estudos.listas.duplamenteEncadeada;


public class ListaDuplamenteEncadadeada {

    private No primeiro;
    private No ultimo;
    private int numeroNos;

    public ListaDuplamenteEncadadeada() {
        this.primeiro = null;
        this.ultimo = null;
        this.numeroNos = 0;
    }

    public void addInicio(Object element) {
        numeroNos++;
        No novoNo = new No(element);
        if (isVazia()) {
            ultimo = novoNo;
        } else {
            novoNo.proximo = primeiro;
        }

        primeiro = novoNo;
    }

    public void addFinal(Object element) {
        numeroNos++;
        No novoNo = new No(element);
        if (isVazia()) {
            primeiro = novoNo;
        } else {
            ultimo.proximo = novoNo;
        }

        ultimo = novoNo;
    }

    public void addMeio(Object element, int posicao) {
        numeroNos++;
        No novoNo = new No(element);

        if (posicao <= 1) {
            addInicio(element);
            return;
        }

        if (posicao > numeroNos) {
            addFinal(element);
            return;
        }

        No temp = primeiro.proximo;
        for (int posAux = 1; posAux < posicao; posAux++) {
            temp = temp.proximo;
        }

        novoNo.proximo = (temp.proximo).proximo;
        temp.proximo = novoNo;
    }

    public Object BuscarElemento(Object element) {
        int i = 1;
        No noTemp = primeiro;

        while (noTemp != null) {
            if (noTemp.elemento.equals(element)) {
                return noTemp;
            }
            i = i + 1;
            noTemp = noTemp.proximo;
        }
        return null;
    }

    public void Remover(Object element) {
        No noTemp = primeiro;
        No noAnt = null;

        if (primeiro.elemento.equals(element)) {
            primeiro = primeiro.proximo;
            numeroNos--;
        } else {
            while (noTemp != null && !noTemp.elemento.equals(element)) {
                noAnt = noTemp;
                noTemp = noTemp.proximo;
            }
            if (noTemp != null) {
                noAnt.proximo = noTemp.proximo;
                numeroNos--;
            }
            if (noTemp == ultimo) {
                ultimo = noAnt;
            }
        }
    }

    public boolean isVazia() {
        return (primeiro == null && ultimo == null);
    }

    public int getNumeroNos() {
        return numeroNos;
    }

    public void mostraElementos() {
        if (!isVazia()) {
            No temp = primeiro;

            System.out.println("Elemento: " + temp.elemento);
            while (temp.proximo != null) {
                temp = temp.proximo;
                System.out.println("Elemento: " + temp.elemento);
            }
        }
    }
}
