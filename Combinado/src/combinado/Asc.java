
package combinado;


public class Asc {

    public void mover(int piso) {
            System.out.println("El ascensor se mueve al piso " + piso);
    }
    public double umbralAlerta=30.0;
    
    public boolean Verificar(double Temperatura){
        return Temperatura > umbralAlerta;
    }
    
    public void Acertar(double Temperatura){
        if (Verificar(Temperatura)){
            System.out.println("¡ALERTA! La temperatura está por encima del umbral.");
        }
        else {
            MostrarMensaje();
        }
    }

    private void MostrarMensaje() {
        System.out.println("La temperatura esta en el rango correcto del umbral");
    }
}
