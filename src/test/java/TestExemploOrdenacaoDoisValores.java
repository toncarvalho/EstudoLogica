import estudos.ordenacao.ExemploOrdenacaoSimplesDoisValores;
import org.junit.Test;

/**
 * Created by ton on 8/26/14.
 */
public class TestExemploOrdenacaoDoisValores {

    @Test
    public void testeOrdenacaoSimples() {
        ExemploOrdenacaoSimplesDoisValores vetorNumerico = new ExemploOrdenacaoSimplesDoisValores();
        vetorNumerico.carregaMemoria();
        vetorNumerico.imprimeEmOrdemCrescente();
    }
}
