package week6homework;
//Write a Java program to convert a given string into lowercase.
// Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
// Output: the quick brown fox jumps over the lazy dog.//
public class LowerCase19 {

    public static void main(String[] args) {
        lowercase();
    }
    public static void lowercase(){
        String S = " THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG. ";
        System.out.println(" Sample Input : " + S );
        System.out.println(" Output : " + S.toLowerCase());
    }
}
