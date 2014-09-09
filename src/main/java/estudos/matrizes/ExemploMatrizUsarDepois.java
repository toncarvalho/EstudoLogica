package estudos.matrizes;

/**
 * Uso de Arrays como tabelas de dados em memoria
 */
public class ExemploMatrizUsarDepois {
    private int COLUNAS = 2;
    private int LINHAS = 3;

    private double[][] matriz = new double[LINHAS][COLUNAS];

    /**
     * Imagine uma linha de registro( Tupla) com os campos nome, endereco e email, como conter estes dados em memoria? -> o campo nome pode
     * contem ate 10 caracteres, o endereco 15 e o email tambem 15.
     */

    /**
     * implementacao de uma matriz que contenha alunos e notas
     */

    public void carregarMemoria() {

        /**
         * aluno 1
         */
        matriz[0][0] = 1;
        //nota 89
        matriz[1][0] = 100;
        //faltas
        matriz[2][0] = 35;
        /**
         * aluno 2
         */
        matriz[0][1] = 2;
        //nota 89
        matriz[1][1] = 33;
        //faltas
        matriz[2][1] = 9;
    }

    public void acessaDados() {
        for (int idxColuna = 0; idxColuna < COLUNAS; idxColuna++) {
            for (int idxLinha = 0; idxLinha < LINHAS; idxLinha++) {
                double valor = matriz[idxColuna][idxLinha];
                System.out.println("[" + idxColuna + "]" + "[" + idxLinha + "]" + " valorcoluna: " + valor);
            }
            System.out.println();
        }
    }
}
