
package cine;


public class MenuRestaurante {

    public static double obtenerPrecioPlato(int opcion) {
        switch (opcion) {
            case 1: 
                return 20000;  
            case 2: 
                return 10000;  
            case 3: 
                return 15000;  
            default: 
                return 0;   
        }
    }

    public static double obtenerPrecioBebida(int opcion) {
        switch (opcion) {
            case 1: 
                return 2500;  
            case 2:
                return 3000;   
            case 3: 
                return 1700;   
            default:
                return 0;   
        }
    }

    public static double calcularDescuento(double total, int metodoPago) {
        double descuento = 0;
        switch (metodoPago) {
            case 1: 
                descuento = 0.10; 
                break;
            case 2: 
                descuento = 0.05;  
                break;
            case 3: 
                descuento = 0.03;
                break;
            default:
                break;
        }
        return total * descuento;
    }
}

   
