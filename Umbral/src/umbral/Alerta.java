
package umbral;


public class Alerta {
    public double umbralAlerta=30.0;
    
    public boolean verificar(double Temperatura){
        return Temperatura > umbralAlerta;
    }
    
    public void Aprobar(double Temperatura){
        if (verificar(Temperatura)){
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
