package estudos;

/**
 * Created by ton on 8/26/14.
 */
public class ExemploArray1 {

    private String[] meuArray = null;

    public void addProximo(String item) {

        if (meuArray == null) {
            meuArray = new String[1];
            meuArray[0] = item;
        } else {
            int tamanhoAtual = meuArray.length;

            String[] novoArray = new String[tamanhoAtual + 1];

            for (int i = 0; i < meuArray.length; i++) {
                novoArray[i] = meuArray[i];
            }

            novoArray[tamanhoAtual] = item;

            meuArray = novoArray;
        }
    }

    public void removeMembro(int i) {
        meuArray[i] = null;
    }

    public void atualizaItem(int i, String valor) {
        meuArray[i] = valor;
    }



    public void imprimeMembros() {
        System.out.println("\n Lista de membros :");

        for (int i = 0; i < meuArray.length; i++) {
            System.out.println(" Item: " + meuArray[i]);
        }
        System.out.println();
    }
}
