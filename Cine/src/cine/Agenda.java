
package cine;

public class Agenda {
    private String nombre;
    private long telefono;
    
    public Agenda(String nombre, long telefono){
        this.nombre=nombre;
        this.telefono=telefono;
    }
    
    public String getNombre(){
        return nombre;
    }
    public long getTelefono(){
        return telefono;
    }
    public void MostrarContacto(){
        System.out.println("Nombre: " + nombre + ", Telefono: " + telefono);
    }
}
