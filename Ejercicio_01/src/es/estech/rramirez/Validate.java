package es.estech.rramirez;

import java.util.Scanner;

public class Validate {
    static int validateInteger(Scanner sc){
        while (!sc.hasNextInt()){
            System.out.print("¡Introduce un valor numérico entero! ");
            sc.next();
        }
        return sc.nextInt();
    }

    static int validatePositive(Scanner sc){
        int number = validateInteger(sc);
        while (number <= 0){
            System.out.print("¡Introduce un número mayor que 0! ");
            number = validateInteger(sc);
        }
        return number;
    }
}
