
package cine;

public class TiendaFor {
    private  String nombre;
    private double precio;
    private double CantidadV;
    
    public TiendaFor(String nombre, double precio, double CantidadV){
        this.nombre=nombre;
        this.precio=precio;
        this.CantidadV=CantidadV;
    }
    
    public double ObtenerTotal(){
        return precio*CantidadV;
    }
    
    public void MostrarResumen(){
        System.out.println("Producto agregado correctamente");
    }
    
}
