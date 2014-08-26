import estudos.ExemploArray1;
import org.junit.Test;

/**
 * Created by ton on 8/26/14.
 */
public class TesteExemploArray1 {

    @Test
    public void testExemplo1(){

        ExemploArray1 exemploArray1 = new ExemploArray1();

        exemploArray1.addProximo("Joselito");
        exemploArray1.addProximo("Marocs");
        exemploArray1.addProximo("Vixi");

        exemploArray1.imprimeMembros();

    }

}
