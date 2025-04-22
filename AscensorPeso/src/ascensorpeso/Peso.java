
package ascensorpeso;


public class Peso {
    private static final int PESO_MINIMO = 1;
    private static final int PESO_MAXIMO = 150;

    public void MoverPeso(int peso) {
        if (esPesoValido(peso)) {
            System.out.println("El ascensor admite el peso de "+peso+" "+"kg");
        } 
        else {
            mostrarError();
        }
    }

    private boolean esPesoValido(int peso) {
        return peso >= PESO_MINIMO && peso <= PESO_MAXIMO;
    }

    private void mostrarError() {
        System.out.println("Error: Peso no válido. Por favor, evacue el ascensor, gracias! ");
    
    }
    
}
