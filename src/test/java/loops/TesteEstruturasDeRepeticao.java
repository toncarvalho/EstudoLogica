package loops;

import estudos.estruturasderepeticao.ExemplosRepeticoes;
import org.junit.Test;

public class TesteEstruturasDeRepeticao {

    @Test
    public void testFacaEnquanto() {

        ExemplosRepeticoes faca = new ExemplosRepeticoes();

        faca.facaEnquanto();
    }

    @Test
    public void testEnquantoFaca() {

        ExemplosRepeticoes objeto = new ExemplosRepeticoes();

        objeto.enquantoFaca();
    }

    @Test
    public void testPara() {

        ExemplosRepeticoes objeto = new ExemplosRepeticoes();

        objeto.para();
    }

    @Test
    public void testContagemRegressiva() {

        ExemplosRepeticoes objeto = new ExemplosRepeticoes();

        objeto.contagemRegressiva();
    }
}
