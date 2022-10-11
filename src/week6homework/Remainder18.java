package week6homework;
//. Write a Java program to print the sum (addition), multiply, subtract, divide and
//remainder of two numbers.
//Test Data:
//Input first number: 125
//Input second number: 24
//Expected Output :
//125 + 24 = 149
//125 - 24 = 101
//125 x 24 = 3000
//125 / 24 = 5
//125 mod 24 = 5//
public class Remainder18 {

    static int x = 125;
    static int y =24;

    public static void main(String[] args) {
        sum();
        multiply();
        sub();
        divide();
        remainder();
    }
    public static void sum(){
        System.out.println(" 125 +24  = " + (x +y));
    }
    public static void multiply(){
        System.out.println("125-24 = " + (x-y));
    }
    public static void sub( ) {
        System.out.println("125*24 = " + (x * y));
    }
    public static void divide(){
        System.out.println("125/24 = " + (x/y));
    }
    public static void remainder(){
        System.out.println("125mod24 = " + (x%y));
    }
}
