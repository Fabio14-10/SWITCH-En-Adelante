
package cine;

public class Campeonato {
    private int puntosEquipo1;
    private int puntosEquipo2;

    public Campeonato() {
        this.puntosEquipo1 = 0;
        this.puntosEquipo2 = 0;
    }

    public void procesarResultado(int resultado) {
        switch (resultado) {
            case 1:  
                puntosEquipo1 += 3;
                System.out.println("¡Equipo 1 gana! Los 3 puntos son para el Equipo 1.");
                break;

            case 2:  
                puntosEquipo2 += 3;
                System.out.println("¡Equipo 2 gana! Los 3 puntos son para el Equipo 2.");
                break;

            case 3:  
                puntosEquipo1 += 1;
                puntosEquipo2 += 1;
                System.out.println("¡Empate! 1 punto para cada equipo.");
                break;

            default:
                System.out.println("Opción no válida. No se asignaron puntos.");
                break;
        }
    }

    public void mostrarClasificacion() {
        System.out.println("Clasificación actual: ");
        System.out.println("Equipo 1: " + puntosEquipo1 + " puntos");
        System.out.println("Equipo 2: " + puntosEquipo2 + " puntos");
    }
}
