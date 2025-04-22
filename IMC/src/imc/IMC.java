
package imc;
import java.util.Scanner;

public class IMC {


    public static void main(String[] args) {
        CalcularIMC imcCalculador = new CalcularIMC();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce tu peso en kilogramos: ");
        double peso = sc.nextDouble();
        
        System.out.print("Introduce tu altura en metros: ");
        double altura = sc.nextDouble();
        
        double imc = imcCalculador.calcular(peso, altura);
        
        String categoria = imcCalculador.clasificarIMC(imc);
        
        // Mostrar el resultado
        System.out.println("Tu IMC es: "+imc);
        System.out.println("Tu Categoría de peso es de: " +categoria);
        
    }
}
    
