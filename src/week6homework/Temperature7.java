package week6homework;
//Write a program to insert any temperature value in degree Fahrenheit and
//convert to degree Celsius ((F − 32) × 5/9 = 0°C).//

import java.util.Scanner;

public class Temperature7 {
    static double F;

    public static void main(String[] args) {
        temperature();
    }

    public static void temperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please enter F = ");
        F = scanner.nextInt();
        scanner.close();
        System.out.println(" Celsius = " + ((F - 32) * 0.555));


    }
}
