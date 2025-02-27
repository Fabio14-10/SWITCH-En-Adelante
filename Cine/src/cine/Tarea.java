
package cine;


public class Tarea {
    String descripcion;
    String fechaVencimiento;

    public Tarea(String descripcion, String fechaVencimiento) {
        this.descripcion = descripcion;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String mostrarTarea() {
        return "Descripción: " + descripcion + ", Fecha de Vencimiento: " + fechaVencimiento;
    }
}
    