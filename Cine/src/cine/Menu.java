
package cine;

import java.util.Scanner;
public class Menu {

    public int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Menú de Comidas Rápidas!!");
        System.out.println("Este es nuestro menu:");
        System.out.println("1. Hamburguesa - $5000");
        System.out.println("2. Papas Fritas - $2500");
        System.out.println("3. Pizza - $30000");
        System.out.println("4. Refresco - $3000");
        System.out.println("5. Finalizar pedido");
        System.out.print("Por favor, elige una opción (1-5): ");
        
        int opcion = scanner.nextInt();
        return opcion;
    }
    
    public double obtenerPrecio(int opcion) {
        switch(opcion) {
            case 1:
                return 5000;
            case 2:
                return 2500;
            case 3:
                return 70000;
            case 4:
                return 3000;
            default:
                return 0;
        }
    }
    
}
