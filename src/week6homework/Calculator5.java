package week6homework;

//Write a program for a calculator with addition, subtraction, multiplication and division methods
// all with parameters and use string concatenation methods.(Note:Two static and Two instance methods)Write a program for a calculator with addition, subtraction, multiplication
//and division methods all with parameters and use string concatenation
//methods.(Note: Two static and Two instance methods.)//

import java.util.Scanner;

public class Calculator5 {
    static int x;
    static int y;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter value of x = ");
        x = scanner.nextInt();
        System.out.print(" Enter value of y = ");
        y = scanner.nextInt();
        Calculator5 obj = new Calculator5();
        obj.addition();
        obj.subtraction();
        multiplication();
        division();
        scanner.close();
    }
    public void addition() {
        System.out.println("addition = " + (x + y));
    }
    public void subtraction() {
        System.out.println(" subtraction = " + (x - y));
    }
    public static void multiplication() {
        System.out.println(" multiplication = " + (x * y));
    }
    public static void division() {
        System.out.println(" division = " + (x / y));

    }
}

