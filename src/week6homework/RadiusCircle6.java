package week6homework;

//Write a program to enter any radius value of the circle and find out the
// area.(Formula of Area A=PI*r*r).//Write a program to enter any radius value of the circle and find out the
//area.(Formula of Area A=PI*r*r).

import java.util.Scanner;

public class RadiusCircle6 {
     double PI = 3.1416;
     static double r;

    public static void main(String[] args) {
        radiuscircle();
    }
    public static void radiuscircle()  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle = ");
        r= scanner.nextInt();
        scanner.close();
        System.out.println(" Area A= " + (3.1416*r*r));

         }
}
