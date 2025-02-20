package factorial;

import java.util.Scanner;

@SuppressWarnings("resource")
public class factorial {
    public static void main(String[] args) {
        System.out.println("***Ingresa el numero que quieres ver su factorial***");

        double numero = new Scanner(System.in).nextDouble();
        double factorial = 1;

        while (numero != 0) {
            factorial *= numero;
            numero--;
        }
        System.out.println("El factorial es: " + factorial);        
    }
}
