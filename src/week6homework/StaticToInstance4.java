package week6homework;

//4.1 Declare two instance and two static variables.
//4.2 Declare one instance method.
//4.3 Declare one static method.
//4.4 Call all four instance and static variables into both instance and static methods inside the
//print statement.
//4.5 Declare the Main method.
//4.6 Call both instance and static methods into the Main method and run the programme//

public class StaticToInstance4 {
    int x = 5;
    static String name = "Beta";
       int y = 25;
        static String surname = "Patel";

    public static void main(String[] args) {
        StaticToInstance4 obj = new StaticToInstance4();
        obj.myName();
        mySurname();

    }
    public void myName(){
        System.out.println(x);
        System.out.println(y);

    }
    public static void mySurname(){
        System.out.println(name);
        System.out.println(surname);

    }

}


