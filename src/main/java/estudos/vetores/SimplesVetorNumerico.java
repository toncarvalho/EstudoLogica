package estudos.vetores;

/**
 * Classe que exemplifica o uso de um simples vetor, ou arranjo de inteiros. Lembrando que arranjos sao sempre estruturas de dados de tipos
 * homogeneos.
 */
public class SimplesVetorNumerico {

    //constante que contem o tamanho do vetor
    private static final int TAMANHO_VETOR = 10;

    //declaracao do vetor numerico
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
        vetor[2] = 3;
        vetor[3] = 78;
        vetor[4] = 64;
        vetor[5] = 99;
        vetor[6] = 85;
        vetor[7] = 81;
        vetor[8] = 7;
        vetor[9] = 100;
    }

    /**
     * Iterando sobre o array, percorrendo todos os itens para impressao
     */

    public void iteracao() {

        for (int count = 0; count < TAMANHO_VETOR; count++) {
            System.out.print(vetor[count]);

            if (count < TAMANHO_VETOR - 1) {
                System.out.print("-");
            }
        }
    }

    public void qualOMenorNumero() {
        /**
         * inicializando a variavel temp com o primeiro valor do vetor
         */
        int temp = vetor[0];

        for (int count = 0; count < TAMANHO_VETOR - 1; count++) {
            /**
             * a variavel temp e menor que o numero contido no vetor na posicao (count + 1), ou seja o proximo numero no vetor
             */
            if (temp > vetor[count + 1]) {
                /**
                 * se o valor de tem for menor que o valor do proximo item no vetor, entao vamos atribuir o valor do proximo item do vetor para a
                 * variavel tem com issso ao final das iteracoes a variavel tem devera conter o menor valor
                 */
                temp = vetor[count + 1];
            }
        }

        System.out.println(" o menor valor no vetor e:" + temp);
    }

    /**
     * Metodo simples de pesquisa, realiza iteracao em todos os items do vetor verificando se existe ou nao o valor procurado(chave de
     * pesquisa ) no vetor
     *
     * @param numero
     */
    public void existeONumero(final int numero) {
        boolean resposta = false;
        for (int posicao = 0; posicao < TAMANHO_VETOR; posicao++) {

            if (numero == vetor[posicao]) {
                resposta = true;
            } else {
                /**
                 *observaçao o else pode ser omitido, pois por default toda variavel booleana em java e
                 * inicializada como false, portanto so precisamo atualizar o seu valor caso o valor seja true
                 */

                resposta = false;
            }
        }
    }
}
