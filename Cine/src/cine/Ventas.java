
package cine;

public class Ventas {
    private double TotalVentas;
    private double CantidadVentas;
    
    public Ventas(){
        this.TotalVentas=0;
        this.TotalVentas=0;
    }
    
    public void AgregarVenta(double precio){
        TotalVentas += precio;
        CantidadVentas++;
    }
    
    public void mostrarResumen() {
        System.out.println("El total de ventas es: $" + TotalVentas);
        System.out.println("La cantidad de productos vendidos es: " + CantidadVentas);
    }
    
}
