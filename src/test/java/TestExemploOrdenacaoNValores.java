import estudos.ExemploOrdenacaoSimplesNValores;
import org.junit.Test;

/**
 * Created by ton on 8/26/14.
 */
public class TestExemploOrdenacaoNValores {

    @Test
    public void testeOrdenacaoSimples() {
        ExemploOrdenacaoSimplesNValores vetorNumerico = new ExemploOrdenacaoSimplesNValores();
        vetorNumerico.carregaMemoria();
        vetorNumerico.ordenaVetor();
        vetorNumerico.imprimeVetor();
    }
}
