package estudos.estruturasderepeticao;

public class ExemplosRepeticoes {

    public void enquantoFaca() {
        int numero = 0;
        while (numero < 10) {

            System.out.println(" fazendo: " + numero + " vez");
            numero++;
        }
    }

    public void facaEnquanto() {
        int contador = 0;
        do {
            System.out.println(" contador: " + contador);
            contador++;
        } while (contador < 5);
    }

    public void para() {
        for (int contador = 0; contador < 5; contador++) {

            System.out.println(" contador: " + contador);
        }
    }

    public void contagemRegressiva() {
        for (int contador = 5; contador > 0; contador--) {

            System.out.println(" contador: " + contador);
        }
    }
}
