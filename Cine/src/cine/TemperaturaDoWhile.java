
package cine;


public class TemperaturaDoWhile {
    private static final int RANGOT_MINIMO = 18;
    private static final int RANGOT_MAXIMO = 25;

    public void Temp(int grado) {
        if (esGradoValido(grado)) {
            System.out.println("La temperatura " +grado+" "+"esta dentro del rango");
        } 
        else {
            mostrarError();
        }
    }

    public boolean esGradoValido(int grado) {
        return grado >= RANGOT_MINIMO && grado <= RANGOT_MAXIMO;
    }

    private void mostrarError() {
        System.out.println("ALERTA: Esta Temperatura no esta dentro del rango");
    
    }
}
