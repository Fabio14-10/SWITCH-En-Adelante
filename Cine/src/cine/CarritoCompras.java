
package cine;


public class CarritoCompras {
    private double CostoTotal;
    
    public CarritoCompras(){
        this.CostoTotal=0;
    }
    
    public void AgregarProducto(int cantidad, double precio){
        double CostoProducto=cantidad*precio;
        CostoTotal += CostoProducto;
    }
    
    public double ObtenerTotal(){
        return CostoTotal;
    }
    
}
