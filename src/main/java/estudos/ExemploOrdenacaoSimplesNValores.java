package estudos;

public class ExemploOrdenacaoSimplesNValores {

    private int[] vetor;

    /**
     * metodo/funcao que popula o array com dados
     */
    public void carregaMemoria() {

        /**
         * instanciando, inicializando o vetor com um tamanho fixo
         */
        //vetor = new int[]{50, 40, 30, 20, 10, 99, 88, 65, 43, 4596, 989, 33, 956, 5, 5, 5, 54, 56, 456, 416, 1,};
        vetor = new int[]{50, 40, 30};
    }

    /**
     * exemplo de método simples de ordenacao
     */
    public void ordenaVetor() {
        int temp = 0;
        int comparacoes = 0;

        for (int count = 0; count < vetor.length; count++) {
            int i = 0;
            do {
                System.out.println("Comparando: " + (vetor[i]) + " com : " + (vetor[i + 1]));
                comparacoes++;
                if ((vetor[i]) > (vetor[i + 1])) {
                    System.out.println("O valor: " + (vetor[i]) + " E MAIOR QUE O valor: " + (vetor[i + 1]));
                    temp = vetor[i + 1];
                    vetor[i + 1] = vetor[i];
                    vetor[i] = temp;
                }
                i++;
            } while (i < (vetor.length - 1));
        }

        System.out.println(" executou: " + comparacoes + " comparações");
    }

    public void imprimeVetor() {
        System.out.println(vetor.length + " Valores no vetor: ");
        for (int j = 0; j < vetor.length; j++) {
            System.out.print(vetor[j]);

            if (j < vetor.length - 1) {
                System.out.print("-");
            }
        }
    }
}
