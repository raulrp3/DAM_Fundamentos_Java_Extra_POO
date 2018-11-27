package es.estech.rramirez;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square square;
        int element;
        System.out.print("Introduce el número de elementos: ");
        element = Validate.validatePositive(sc);
        square = new Square(element);
        System.out.println();
        System.out.println(square.print());
    }
}
