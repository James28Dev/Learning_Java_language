
import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name : ");
        String name = sc.next(); //get name
        
        System.out.print("Enter surname : ");
        String surname = sc.next(); //get surname
        
        System.out.print("Enter age : ");
        int age = sc.nextInt(); //get age
        
        System.out.print("Enter gpa : ");
        double gpa = sc.nextDouble(); //get gpa
        
        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
        System.out.println("age = " + age);
        System.out.println("gpa = " + gpa);
        
        String strAge = HelloWorld.checkAge(age); //call checkAge class in HelloWorld.java
        System.out.println("AGE = " + strAge);
    } //end main class
} //end ScannerExample class
