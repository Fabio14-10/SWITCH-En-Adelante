
package ascensor;


public class MoverAsc {
    private static final int PISO_MINIMO = 1;
    private static final int PISO_MAXIMO = 10;

    public void moverAscensor(int piso) {
        if (esPisoValido(piso)) {
            System.out.println("El ascensor se mueve al piso " + piso);
        } 
        else {
            mostrarError();
        }
    }

    private boolean esPisoValido(int piso) {
        return piso >= PISO_MINIMO && piso <= PISO_MAXIMO;
    }

    private void mostrarError() {
        System.out.println("Error: Piso no válido. Por favor, ingresa un piso entre " 
                           + PISO_MINIMO + " y " + PISO_MAXIMO);
    
    }
}
    
