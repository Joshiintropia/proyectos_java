package es_bisiesto;

import java.util.Scanner;

public class es_bisiesto {
    public static void main(String[] args) {
        System.out.println("***Ingresa el ano que quieres saber si es bisiesto***");
        int anio = new Scanner(System.in).nextInt();

        if ((anio % 4 == 0) && !(anio % 100 == 0) || (anio % 400 == 0)){
            System.out.println("El anio " + anio + " SI es Bisiesto");
        }else{
            System.out.println("El anio " + anio + " NO es Bisiesto");
        }

    }
}
