
package cine;


public class Producto {
    private String producto;
    private double precio;
    
    public Producto(String producto, double precio){
        this.producto=producto;
        this.precio=precio;
    }
    
    public String getPro(){
        return producto;
    }
    public double getPre(){
        return precio;
    }
    
}
