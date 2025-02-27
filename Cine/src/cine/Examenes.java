
package cine;

public class Examenes {
    private int totalCalificaciones = 0;
    private int cantidadCalificaciones = 0;

    public void agregarCalificacion(int calificacion) {
        totalCalificaciones += calificacion;
        cantidadCalificaciones++;
    }

    public double calcularPromedio() {
        if (cantidadCalificaciones == 0) {
            return 0;
        }
        return (double) totalCalificaciones / cantidadCalificaciones;
    }

    public String determinarResultado() {
        double promedio = calcularPromedio();
        if (promedio >= 6) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }
}
