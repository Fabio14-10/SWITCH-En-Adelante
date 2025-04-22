
package umbral;
import java.util.Scanner;

public class Umbral {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alerta sensor = new Alerta();
        
        System.out.println("Ingrese la temperatura en grados celsius: ");
        double Temp=sc.nextDouble();
        
        sensor.Aprobar(Temp);
        
    }
    
}
