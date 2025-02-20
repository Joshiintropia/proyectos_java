package suma_numeros;

import java.util.Scanner;

public class suma_numeros {
    public static void main(String[] args) {
        System.out.println("***Ingresa el numero de numeros a sumar***");

        int bandera = new Scanner(System.in).nextInt();
        int i = 0;
        int suma_total = 0;
        while (i <= bandera) {
            suma_total += i;
            i++;
        }
        System.out.println("La suma total de los numeros es: " + suma_total);
    }
}
