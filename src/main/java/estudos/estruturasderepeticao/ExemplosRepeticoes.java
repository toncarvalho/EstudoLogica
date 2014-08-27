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
        for (int i = 0; i < 5; i++) {

            System.out.println(" contador: " + i);
        }
    }

    public void contagemRegressiva() {
        for (int i = 5; i > 0; i--) {

            System.out.println(" contador: " + i);
        }
    }
}
