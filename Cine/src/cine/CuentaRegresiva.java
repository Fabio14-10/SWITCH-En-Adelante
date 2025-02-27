
package cine;

public class CuentaRegresiva {
    private int cuenta;
    
    public CuentaRegresiva(int numero){
        this.cuenta=numero;
    }
    
    public void Calcular(){
        while (cuenta >=0){
            System.out.println(cuenta);
            cuenta--;
        }
        System.out.println("Tiempo Cumplido!");
    }
    
}
