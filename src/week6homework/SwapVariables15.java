package week6homework;

import java.util.Scanner;

//Write a Java program to swap two variables.//
public class SwapVariables15 {
    int x;
    int y;
    int z;

    public static void main(String[] args) {
        SwapVariables15 obj = new SwapVariables15();
        obj.swap();

    }
    public void swap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the value of x = ");
        x = scanner.nextInt();
        System.out.print(" Enter the value of y = ");
        y = scanner.nextInt();
        int z = x;
        int x = y;
        int y = z;
        System.out.println();
        System.out.println(" After swapping the value : ");
        System.out.println(" value of x = " + x);
        System.out.println(" value of y = " + y);
        scanner.close();

    }

}
