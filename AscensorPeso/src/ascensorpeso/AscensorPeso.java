
package ascensorpeso;

import java.util.Scanner;


public class AscensorPeso {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Peso asc = new Peso();

        System.out.println("Ingrese su peso entre 1 y 150 kg: ");
        int pesoApto = sc.nextInt();
        System.out.println("Digite el piso al que quiera ir");
        int Piso=sc.nextInt();
        System.out.println("Usted ira hacia el piso: "+Piso);

        asc.MoverPeso(pesoApto);
    }
    
}
