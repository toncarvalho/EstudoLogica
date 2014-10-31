package estudos.listas.circular;


/**
 * http://aeloy.blogspot.com.br/2008/02/estruturas-de-dados-com-java-lista_5419.html
 */
public class ListaCircular {
    public No cursor;
    public int size;


    public ListaCircular() {
        this.cursor = null;
        this.size = 0;
    }

    public void next() {
        cursor = cursor.next;
    }

    public void add(No node) {
        if (cursor == null) {
            node.next = node;
            cursor = node;
        } else {
            node.next = cursor.next;
            cursor.next = node;
        }
        this.size++;
    }


    public void imprimir() {
        No node = this.cursor;
        for (int i = 0; i < this.size; i++) {
            System.out.println("elemento " + i + " = " + node.element);
            next();
            node = cursor;
        }
    }


    /**
     * Remove os itens um a um, mas não remove o cursor.
     *
     * @return
     * @throws IllegalArgumentException
     */
    public No removeItem() throws IllegalArgumentException {

        if (cursor == null) {
            throw new IllegalArgumentException("lista vazia");
        }

        No temp = cursor.next;
        if (temp == cursor) {
            cursor = null;
        } else {
            cursor.next = temp.next;
            temp.next = null;
        }

        size--;
        return temp;
    }
}
