package week6homework;
 //1.1 Declare two instance variables.
 //1.2 Declare one instance method.
 //1.3 Call both instance variables into the instance method inside the print statement.
 //1.4 Declare the Main method.
 //1.5 Call the above instance method into the Main method and Run the programme. //Write a Java programme using the following steps.
//1.1 Declare two instance variables.
//1.2 Declare one instance method.
//1.3 Call both instance variables into the instance method inside the print statement.
//1.4 Declare the Main method.
//1.5 Call the above instance method into the Main method and Run the programme.//

public class InstanceToInstance1 {
    int a = 10;
    int b = 20;

    public static void main(String[] args) {
        InstanceToInstance1 obj = new InstanceToInstance1();
        obj.myMethod();
    }

    public void myMethod() {

        System.out.println("A =  " + a );
        System.out.println("B =  " + b);

    }
}
