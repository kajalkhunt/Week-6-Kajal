package week6homework;

//. Write a Java program to convert a decimal number to binary number.
//Input Data:
// Input a Decimal Number : 5
//Expected Output
//Binary number is: 101//
public class Decimal17 {

    public static void main(String[] args) {
        decimal();
    }

    public static void decimal() {

        String s1 = "5";
        int binary = Integer.parseInt(s1);
        String decimal = Integer.toBinaryString(binary);
        System.out.print(" Binary number is : ");
        System.out.println(decimal);

    }

}
