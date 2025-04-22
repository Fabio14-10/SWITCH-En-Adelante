
package maintienda;
import java.util.Scanner;

public class MainTienda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tienda tienda = new Tienda();

        System.out.println("Ingrese el tipo de producto (A - Alimentos, V - Vestimenta, E - Electrónicos): ");
        char tipoProducto = scanner.next().charAt(0);


        if (tipoProducto != 'A' && tipoProducto != 'V' && tipoProducto != 'E') {
            System.out.println("Tipo de producto no válido.");
            return;
        }
        
        System.out.println("Ingrese la cantidad de unidades: ");
        int cantidad = scanner.nextInt();


        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser un número positivo.");
            return;
        }


        double costoSinDescuento = tienda.calcularCostoSinDescuento(cantidad, tipoProducto);
        double costoConDescuento = tienda.calcularCostoConDescuento(costoSinDescuento, tipoProducto);


        System.out.println("El costo sin descuento es de: "+costoSinDescuento);
        System.out.println("El costo con descuento es de: "+costoConDescuento);
    }
    
}
