
package ascensor;
import java.util.Scanner;

public class Ascensor {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MoverAsc asc = new MoverAsc();

        System.out.println("Ingrese el número de piso al que desea ir (entre 1 y 10): ");
        int pisoDeseado = sc.nextInt();

        asc.moverAscensor(pisoDeseado);
        
    }
}
    
