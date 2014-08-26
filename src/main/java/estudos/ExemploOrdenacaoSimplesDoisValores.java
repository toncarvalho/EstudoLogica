package estudos;


public class ExemploOrdenacaoSimplesDoisValores {

    private static final int TAMANHO_VETOR = 2;
    private int[] vetor;

    /**
     * metodo/funcao que popula o array com dados
     */
    public void carregaMemoria() {

        /**
         * instanciando, inicializando o vetor com um tamanho fixo
         */
        vetor = new int[TAMANHO_VETOR];

        /**
         * atribuindo valores numericos a cada posicao disponivel do array
         */
        vetor[0] = 10;
        vetor[1] = 9;
    }

    /**
     * exemplo de método simples de ordenacao
     */
    public void imprimeEmOrdemCrescente() {

        int temp = 0;
        for (int i = 0; i < TAMANHO_VETOR - 1; i++) {
            int n = vetor[i];
            int proximo = vetor[i + 1];
            if (n > proximo) {
                temp = proximo;
                vetor[i + 1] = n;
                vetor[i] = temp;
            }
        }

        System.out.println(" Nova ordem");
        for (int j = 0; j < TAMANHO_VETOR; j++) {
            System.out.print(vetor[j]);

            if (j < TAMANHO_VETOR - 1) {
                System.out.print("-");
            }
        }
    }
}
