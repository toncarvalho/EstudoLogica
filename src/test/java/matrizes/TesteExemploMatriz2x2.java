package matrizes;

import estudos.matrizes.ExemploMatriz2x2;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ton on 9/8/14.
 */
public class TesteExemploMatriz2x2 {
    private ExemploMatriz2x2 matriz;

    @Before
    public void configTest() {
        matriz = new ExemploMatriz2x2();
        matriz.carregarMemoria();
    }

    @Test
    public void testaMatriz() {

        matriz.acessoAMatriz();
    }


    @Test
    public void testLeitura2() {

        matriz.acessando1LinhaNColunas();
    }
}

