
package temperatura;

import java.util.Scanner;


public class Temperatura {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rango asc = new Rango();

        System.out.println("Ingrese la temperatura a la que quiere almacenar el producto: ");
        int gradosDeseados = sc.nextInt();

        asc.Temp(gradosDeseados);
        
    }
    
}
