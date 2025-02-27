
package cine;
import java.util.Random;
import java.util.Scanner;

public class Adivinanza {
    private int numeroAdivinado;
    private int intentos;

    public Adivinanza() {
        Random random = new Random();
        this.numeroAdivinado = random.nextInt(100) + 1; 
        this.intentos = 0;
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        int intentoUsuario;

        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("He generado un número aleatorio entre 1 y 100.");
        System.out.println("Intenta adivinar el número.");

        while (true) {
            System.out.print("Introduce tu adivinanza: ");
            intentoUsuario = scanner.nextInt();
            intentos++;

            if (intentoUsuario > numeroAdivinado) {
                System.out.println("El número es menor. ¡Intenta de nuevo!");
            } else if (intentoUsuario < numeroAdivinado) {
                System.out.println("El número es mayor. ¡Intenta de nuevo!");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
                break;
            }
        }
    
}
}
