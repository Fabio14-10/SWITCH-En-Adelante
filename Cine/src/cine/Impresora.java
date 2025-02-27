
package cine;


public class Impresora {
    private int PagDisp; 
    private int TotalImp; 

    public Impresora(){
        this.PagDisp = 100; 
        this.TotalImp = 0;  
    }

    public void imprimir(int cantidad){
        if (cantidad <= PagDisp) {
            PagDisp -= cantidad; 
            TotalImp += cantidad; 
        } else {
            System.out.println("No hay suficientes hojas disponibles para imprimir esa cantidad.");
        }
    }

    public int ObtenerTotalImp(){
        return TotalImp;
    }

    public int ObtenerPagDisp(){
        return PagDisp;
    }
}