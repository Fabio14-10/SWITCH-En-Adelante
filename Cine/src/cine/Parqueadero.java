
package cine;
import java.time.LocalTime;

public class Parqueadero {
    
    private String placa;
    private LocalTime horaIngreso;
    
    public Parqueadero(String placa, LocalTime horaIngreso){
        this.placa=placa;
        this.horaIngreso=horaIngreso;
    }
    public String getPlaca(){
        return placa;
    }
    
    public LocalTime getHoraIngreso(){
        return horaIngreso;
}
        public void mostrarInformacion() {
        System.out.println("Placa: " + placa + " | Hora de ingreso: " + horaIngreso);
        }
}
