
package ejerciciofactura;


public class EjercicioFactura {


    public static void main(String[] args) {
        Factura obj = new Factura();
        boolean aux=obj.tomarDatos();
        System.out.println("Estado del cliente: "+aux);
   }
    public EjercicioFactura(){
        System.out.println("Hola, como estas? Esta es tu factura:");
    }
}
