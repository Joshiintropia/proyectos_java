package tabla_multiplicar;

import java.util.Scanner;

public class tabla_multiplicar {
    public static void main(String[] args) {
        System.out.println("***Ingresa la tabla de multiplicar que quieres ver***");

        int tabla = new Scanner(System.in).nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(tabla + " * " + i + " = " + (tabla * i));
        }
    }
}
