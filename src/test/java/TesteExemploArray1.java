import estudos.vetores.ExemploVetor;
import org.junit.Test;

/**
 * Created by ton on 8/26/14.
 */
public class TesteExemploArray1 {

    @Test
    public void testExemplo1(){

        ExemploVetor exemploArray1 = new ExemploVetor();

        exemploArray1.addProximo("Joselito");
        exemploArray1.addProximo("Marocs");
        exemploArray1.addProximo("Vixi");

        exemploArray1.imprimeMembros();

    }

}
