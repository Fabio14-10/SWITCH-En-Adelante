
package temperatura;


public class Rango {
    private static final int RANGOT_MINIMO = 5;
    private static final int RANGOT_MAXIMO = 40;

    public void Temp(int grado) {
        if (esGradoValido(grado)) {
            System.out.println("La temperatura ingresada es de " +grado+" "+"grados celsius y es apta para los productos de esta drogueria");
        } 
        else {
            mostrarError();
        }
    }

    private boolean esGradoValido(int grado) {
        return grado >= RANGOT_MINIMO && grado <= RANGOT_MAXIMO;
    }

    private void mostrarError() {
        System.out.println("Error: Temperatura no apta para los productos de esta drogueria.");
    
    }
    
}
