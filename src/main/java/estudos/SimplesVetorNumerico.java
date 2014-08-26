package estudos;

/**
 * Classe que exemplifica o uso de um simples vetor, ou arranjo de inteiros. Lembrando que arranjos sao sempre estruturas de dados de tipos
 * homogeneos.
 */
public class SimplesVetorNumerico {

    //constante que contem o tamanho do vetor
    private static final int TAMANHO_VETOR = 10;

    //declaracao do vetor numerico
    private int[] vetorNumerico;

    /**
     * metodo/funcao que popula o array com dados
     */
    public void carregaMemoria() {

        /**
         * instanciando, inicializando o vetor com um tamanho fixo
         */
        vetorNumerico = new int[TAMANHO_VETOR];

        /**
         * atribuindo valores numericos a cada posicao disponivel do array
         */
        vetorNumerico[0] = 33;
        vetorNumerico[1] = 3;
        vetorNumerico[2] = 4;
        vetorNumerico[3] = 78;
        vetorNumerico[4] = 64;
        vetorNumerico[5] = 99;
        vetorNumerico[6] = 85;
        vetorNumerico[7] = 81;
        vetorNumerico[8] = 7;
        vetorNumerico[9] = 100;
    }

    /**
     * Iterando sobre o array, percorrendo todos os itens para impressao
     */

    public void iteracao() {

        for (int count = 0; count < TAMANHO_VETOR; count++) {
            System.out.print(vetorNumerico[count]);

            if (count < TAMANHO_VETOR - 1) {
                System.out.print("-");
            }
        }
    }

    public void qualOMenorNumero() {
        /**
         * inicializando a variavel temp com o primeiro valor do vetor
         */
        int temp = vetorNumerico[0];

        for (int count = 0; count < TAMANHO_VETOR - 1; count++) {
            /**
             * a variavel temp e menor que o numero contido no vetor na posicao (count + 1), ou seja o proximo numero no vetor
             */
            if (temp > vetorNumerico[count + 1]) {
                /**
                 * se o valor de tem for menor que o valor do proximo item no vetor, entao vamos atribuir o valor do proximo item do vetor para a
                 * variavel tem com issso ao final das iteracoes a variavel tem devera conter o menor valor
                 */
                temp = vetorNumerico[count +1];
            }
        }

        System.out.println(" o menor valor no vetor e:" + temp);
    }
}
