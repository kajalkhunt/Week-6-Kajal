package week6homework;

import java.text.DecimalFormat;

//Write a Java program to print the area and perimeter of a rectangle.
//Test Data:
//Width = 5.5 Height = 8.5
// Expected Output:
//Area is 5.6 * 8.5 = 47.60
//Perimeter is 2 * (5.6 + 8.5) = 28.20//
public class PerimeterOfRectangle14 {
    float w = 5.6f;
    float h = 8.5f;

    public static void main(String[] args) {
        PerimeterOfRectangle14 obj = new PerimeterOfRectangle14();
        obj.area();
    }
    public void area() {
        DecimalFormat two = new DecimalFormat(" 00.00 ");
        System.out.println(" Area is 5.6 * 8.5 = " + two.format (5.6 * 8.5));
        System.out.println(" Perimeter is 2 * (5.6 + 8.5) = " + two.format (2 * (5.6 + 8.5)));

    }

}
