
package imc;

public class CalcularIMC {
    public double calcular(double peso, double altura) {
        return peso / (altura * altura);
    }


    public String clasificarIMC(double imc) {

        int categoria = (int) (imc / 5); 

        switch (categoria) {
            case 0:
            case 1:
                return "Bajo peso";  
            case 2:
            case 3:
                return "Peso normal";  
            case 4:
                return "Sobrepeso";  
            default:
                return "Obesidad";  
        }
    }
    
}
