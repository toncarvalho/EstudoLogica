package estudos.matrizes;

/**
 * Uso de Arrays como tabelas de dados em memoria ( matriz quadrada )
 */
public class ExemploMatriz2x2 {
    private int LINHAS = 2;
    private int COLUNAS = 2;

    private double[][] matriz = new double[LINHAS][COLUNAS];

    /**
     * Imagine uma linha de registro( Tupla) com os campos nome, endereco e email, como conter estes dados em memoria? -> o campo nome pode
     * contem ate 10 caracteres, o endereco 15 e o email tambem 15.
     */

    /**
     * implementacao de uma matriz que contenha alunos e notas
     */

    public void carregarMemoria() {

        //aluno 1
        matriz[0][0] = 1;
        //nota 89
        matriz[0][1] = 89;

        //aluno 2
        matriz[1][0] = 2;
        //nota 89
        matriz[1][1] = 58;
    }

    public void acessoAMatriz() {

        for (int linha = 0; linha < LINHAS; linha++) {
            for (int coluna = 0; coluna < COLUNAS; coluna++) {
                System.out.print("[" + linha + "]" + "[" + coluna + "]");
                System.out.println("valor: " + matriz[linha][coluna]);
            }
        }
    }

    public void acessando1LinhaNColunas() {
        for (int linha = 0; linha < LINHAS; linha++) {
            for (int coluna = 0; coluna < COLUNAS; coluna++) {
                double valor = matriz[linha][coluna];
                System.out.print(" linha: " + linha + " coluna:" + coluna + " valor: " + valor);
            }
            System.out.println();
        }
    }
}
