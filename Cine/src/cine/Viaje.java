
package cine;


public class Viaje {
    private double tiempo;
    
    public Viaje(){
        this.tiempo=0;
    }
    
    public void Calcular(double distancia, double velocidad){
        double resultado=distancia/velocidad;
        tiempo=resultado;
    }
    
    public double MostrarResultadoViaje(){
        return tiempo;
    }
}
