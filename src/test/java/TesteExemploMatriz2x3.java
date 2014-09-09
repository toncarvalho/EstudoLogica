import estudos.matrizes.ExemploMatriz2x3;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ton on 9/9/14.
 */
public class TesteExemploMatriz2x3 {
    private ExemploMatriz2x3 matriz;

    @Before
    public void configTest() {
        matriz = new ExemploMatriz2x3();
        matriz.carregarMemoria();
    }


    @Test
    public void testAcesso() {

        matriz.acesso1();
    }
    @Test
    public void testAcesso1() {

        matriz.acesso2();
    }
}
