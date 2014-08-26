package estudos;

public class ExemploOrdenacaoSimplesNValores {

    private int qtdItensNoVetor = 0;
    private int[] vetor;

    /**
     * metodo/funcao que popula o array com dados
     */
    public void carregaMemoria() {

        /**
         * instanciando, inicializando o vetor com um tamanho fixo
         */
        vetor = new int[]{50, 40, 30, 20, 10};
        qtdItensNoVetor = vetor.length;
    }

    /**
     * exemplo de método simples de ordenacao
     */
    public void ordenaVetor() {

        int temp = 0;
        for (int i = 0; i < qtdItensNoVetor - 1; i++) {
            int n = vetor[i];
            int proximo = vetor[i + 1];
            if (n > proximo) {
                temp = proximo;
                vetor[i + 1] = n;
                vetor[i] = temp;
            }
        }
    }

    public void imprimeVetor() {
        System.out.println(" Dados no vetor: ");
        for (int j = 0; j < qtdItensNoVetor; j++) {
            System.out.print(vetor[j]);

            if (j < qtdItensNoVetor - 1) {
                System.out.print("-");
            }
        }
    }
}
