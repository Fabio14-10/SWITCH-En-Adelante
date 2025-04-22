
package ejerciciofactura;
import java.util.Scanner;

public class Factura {

    String Saludo = "Hola, como estas? Bienvenido!!";
    public Factura(){   
    }
    
    public boolean tomarDatos(){
        System.out.println(Saludo);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el nombre del cliente");
        String NombreCliente=sc.nextLine();
        System.out.println("Digite el producto a comprar");
        String Producto=sc.nextLine();
        System.out.println("Digite la cantidad a comprar");
        int Cantidad=sc.nextInt();
        System.out.println("Digite el precio de dicho producto");
        int PrecioUni=sc.nextInt();
        System.out.println(NombreCliente+" "+"Eres estudiante?"
                + "Si(1)"
                + "No(2)");
        int Estudiante=sc.nextInt();
            if (Estudiante==1){
            
            double Total=PrecioUni*Cantidad;
            double Descuento=Total*0.13;
            double Pago=Total+Descuento;
        Factura.calcularDatos(Cantidad, PrecioUni);
        System.out.println("El producto es "+Producto);
        System.out.println("La cantidad Comprada es "+Cantidad);
        System.out.println("El precio unitario es de: "+PrecioUni);
        System.out.println(NombreCliente+" "+"El total de la factura es "+Total);
        System.out.println("El impuesto dado por ser Estudiante es de el 13%");
        System.out.println(NombreCliente+" "+"El total de la factura con su respectivo impuesto es "+Pago);
        return true;
}
        else {
            double Total1=PrecioUni*Cantidad;
            double Descuento1=Total1*0.05;
            double Pago1=Total1+Descuento1;
        Factura.calcularDatos(Cantidad, PrecioUni);
        System.out.println("El producto es "+Producto);
        System.out.println("La cantidad Comprada es "+Cantidad);
        System.out.println("El precio unitario es de: "+PrecioUni);
        System.out.println(NombreCliente+" "+"El total de la factura es "+Total1);
        System.out.println("El impuesto dado por no ser Estudiante es de el 5%");
        System.out.println(NombreCliente+" "+"El total de la factura con su respectivo impuesto es "+Pago1);
        return false;
      }  
    }
    public static void calcularDatos (int datoCantidad, int datoPrecioUni) {
        System.out.println("Cantidad del producto a llevar: " + datoCantidad);
        System.out.println("Precio del producto: " + datoPrecioUni);
}

    public void mortarResultados(){
        System.out.println();
    }
    
}
