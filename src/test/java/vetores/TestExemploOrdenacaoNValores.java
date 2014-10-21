package vetores;

import estudos.ordenacao.ExemploOrdenacaoSimplesNValores;
import org.junit.Test;

public class TestExemploOrdenacaoNValores {

    @Test
    public void testeOrdenacaoSimples() {
        ExemploOrdenacaoSimplesNValores vetorNumerico = new ExemploOrdenacaoSimplesNValores();
        vetorNumerico.carregaMemoria();
        vetorNumerico.ordenaVetor();
        vetorNumerico.imprimeVetor();
    }


}
