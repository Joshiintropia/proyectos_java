
package par_impar;

import java.util.Scanner;

public class par_impar {
    public static void main(String[] args) {
        System.out.println("***Ingresa un numero para determinar si es par o impar***");
        
        int num = new Scanner(System.in).nextInt();

        if (num % 2 == 0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
    }
    
}