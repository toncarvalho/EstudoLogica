import estudos.matrizes.ExemploMatriz;
import org.junit.Test;

/**
 * Created by ton on 9/8/14.
 */
public class TesteExemploMatriz {

    @Test
    public void testaMatriz() {
        ExemploMatriz matriz = new ExemploMatriz();
        matriz.carregarMemoria();
        matriz.imprime2();

    }
}
