package numero_mayor;

import java.util.Scanner;

public class numero_mayor {
    public static void main(String[] args) {
        System.out.println("***Ingresa tres numeros para determinar cual es el mas grande. No importa el orden");
        System.out.println("***Ingresa el primer numero");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("***Ingresa el segundo numero");
        int num2 = new Scanner(System.in).nextInt();
        System.out.println("***Ingresa el tercer numero");
        int num3 = new Scanner(System.in).nextInt();

        //Si A>B y B<C entonces C>A
        if (num1 > num2){
            System.out.println("El numero " + num1 + " es el mayor");
        }else if(num2 > num3) {
            System.out.println("El numero " + num2 + " es el mayor");
        } else {
            System.out.println("El numero " + num3 + " es el mayor");
        }
        
    }
}
