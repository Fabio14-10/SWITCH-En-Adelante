
package combinado;
import java.util.Scanner;

public class Combinado {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Asc asc = new Asc();
        
        System.out.println("Ingrese el número de piso al que desea ir: ");
        int pisoDeseado = sc.nextInt();
        System.out.println("Ingrese la temperatura en grados celsius: ");
        double Temp=sc.nextDouble();
        
        asc.Acertar(Temp);
    }
}
