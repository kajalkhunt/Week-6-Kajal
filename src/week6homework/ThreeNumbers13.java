package week6homework;
//Write a Java program that takes three numbers as input to calculate and
//print the average of the numbers.//Write a Java program that takes three numbers as input to calculate and
//print the average of the numbers.//

import java.util.Scanner;

public class ThreeNumbers13 {
    static double x = 15;
    static double y = 25;
    static double z = 35;

    public static void main(String[] args) {
        numbers();
    }
    public static void numbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter first number : ");
        x = scanner.nextDouble();
        System.out.print(" Enter second number : ");
        y = scanner.nextDouble();
        System.out.print(" Enter third number :");
        z = scanner.nextDouble();
        scanner.close();
        System.out.println(" The average value is " + (x + y + z) );

    }


}
