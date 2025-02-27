
package cine;

public class CajeroAutomatico {
    private double saldo;
    
    public CajeroAutomatico(double saldoInicial){
        this.saldo=saldoInicial;
    }
    
    public String retirar(double monto){
        if (monto>saldo){
            return "Error: El monto ingresado excede el saldo disponible.";
        } 
        else if (monto <= 0) {
            return "Error: El monto debe ser mayor que cero.";
        } 
        else {
            saldo -= monto;
            return "Retiro exitoso. Su nuevo saldo es: $" + saldo;
        }
}
        public double ObtenerSaldo(){
            return saldo;
        }
}

