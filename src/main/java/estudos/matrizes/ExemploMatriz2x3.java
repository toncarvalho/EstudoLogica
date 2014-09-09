package estudos.matrizes;

/**
 * Uso de Arrays como tabelas de dados em memoria
 */
public class ExemploMatriz2x3 {
    private int LINHAS = 2;
    private int COLUNAS = 3;

    private double[][] matriz = new double[LINHAS][COLUNAS];

    /**
     * implementacao de uma matriz que contenha alunos e notas
     */

    public void carregarMemoria() {

        //aluno 1
        matriz[0][0] = 1;
        //nota 89
        matriz[0][1] = 89;
        //falta
        matriz[0][2] = 9;
        //aluno 2
        matriz[1][0] = 2;
        //nota 89
        matriz[1][1] = 58;
        //faltas
        matriz[1][2] = 18;
    }

    public void acesso1() {
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                double valor = matriz[i][j];
                System.out.println("[" + i + "]" + "[" + j + "]" + " valorcoluna: " + valor);
            }
            System.out.println();
        }
    }

    public void acesso2() {
        for (int i = 0; i < LINHAS; i++) {
            System.out.println("linha/tupla: " + i);
            for (int j = 0; j < COLUNAS; j++) {
                double valor = matriz[i][j];
                if (j == 0) {
                    System.out.print("Cod: " + valor + "\t");
                } else if (j == 1) {
                    System.out.print("Nota: " + valor + "\t");
                } else if (j == 2) {
                    System.out.println("Faltas: " + valor + "\t");
                }
            }
        }
    }

    public void acesso3() {
        /**
         * descobrindo a quantidade de colunas direto da matriz
         */
        for (int i = 0; i < LINHAS; i++) {
            System.out.println("linha/tupla: " + i);
            int campos = matriz[i].length;

            for (int j = 0; j < campos; j++) {
                double valor = matriz[i][j];
                if (j == 0) {
                    System.out.print("Cod: " + valor + "\t");
                } else if (j == 1) {
                    System.out.print("Nota: " + valor + "\t");
                } else if (j == 2) {
                    System.out.println("Faltas: " + valor + "\t");
                }
            }
        }
    }

    public void acesso4() {
        /**
         * descobrindo os campos e sua quantidade
         */
        for (int i = 0; i < LINHAS; i++) {
            System.out.println("linha/tupla: " + i);
            double[] campos = matriz[i];
            for (int j = 0; j < campos.length; j++) {
                double valor = campos[j];
                if (j == 0) {
                    System.out.print("Cod: " + valor + "\t");
                } else if (j == 1) {
                    System.out.print("Nota: " + valor + "\t");
                } else if (j == 2) {
                    System.out.println("Faltas: " + valor + "\t");
                }
            }
        }
    }
}
