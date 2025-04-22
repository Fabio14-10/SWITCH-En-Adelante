
package maintienda;


public class Tienda {
    private static final double PRECIO_A = 10000.0; 
    private static final double PRECIO_V = 20000.0; 
    private static final double PRECIO_E = 30000.0;

    public double calcularCostoSinDescuento(int cantidad, char tipoProducto) {
        double precioProducto = 0.0;

        switch (tipoProducto) {
            case 'A':
                precioProducto = PRECIO_A;
                break;
            case 'V':
                precioProducto = PRECIO_V;
                break;
            case 'E':
                precioProducto = PRECIO_E;
                break;
            default:
                System.out.println("Tipo de producto no válido.");
                return 0.0;
        }

        return precioProducto * cantidad;
    }

    public double calcularCostoConDescuento(double costoSinDescuento, char tipoProducto) {
        double descuento = 0.0;
        
        switch (tipoProducto) {
            case 'A':
                descuento = 0.10; 
                break;
            case 'V':
                descuento = 0.05; 
                break;
            case 'E':
                descuento = 0.0; 
                break;
            default:
                System.out.println("Tipo de producto no válido.");
                return costoSinDescuento;
        }

        return costoSinDescuento - (costoSinDescuento * descuento);
    }
}
