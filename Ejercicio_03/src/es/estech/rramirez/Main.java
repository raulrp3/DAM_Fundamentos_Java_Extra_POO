package es.estech.rramirez;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int[] numbers;
        Scanner sc = new Scanner(System.in);
        Operation operation;
        System.out.print("Introduce el tamaño del array: ");
        size = Validate.validatePositive(sc);
        numbers = new int[size];
        System.out.println("Añade los elementos al array: ");
        for (int i = 0; i < size; i++) {
            System.out.printf("Posición[%d]: ", i);
            numbers[i] = Validate.validateInteger(sc);
        }
        sc.close();
        operation = new Operation(size, numbers);
        numbers = operation.order();
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("[%d]: %d\n", i, numbers[i]);
        }
    }
}
