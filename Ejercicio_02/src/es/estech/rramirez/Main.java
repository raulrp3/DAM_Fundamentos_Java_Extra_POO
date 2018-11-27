package es.estech.rramirez;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        String letter;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número que desea remplazar: ");
        number = Validate.validatePositive(sc);
        System.out.print("Introduce la letra por la que desea remplazarlo: ");
        letter = sc.next();
        CounterClass counter = new CounterClass(number, letter);
        counter.print();
    }
}
