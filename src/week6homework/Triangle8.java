package week6homework;
//Write a program to calculate the area of a triangle.//

import java.util.Scanner;

public class Triangle8 {

    static double b;
    static double h;

    public static void area() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter value of b = ");
        b = scanner.nextDouble();
        System.out.print(" Enter value of h = ");
        h = scanner.nextDouble();
        scanner.close();
        System.out.println(" Total area of Triangle = " + (b * h / 2.0));
    }

    public static void main(String[] args) {
        area();
    }
}

