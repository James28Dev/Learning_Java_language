
import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name : ");
        String name = sc.next();
        
        System.out.print("Enter surname : ");
        String surname = sc.next();
        
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        
        System.out.print("Enter gpa : ");
        double gpa = sc.nextDouble();
        
        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
        System.out.println("age = " + age);
        System.out.println("gpa = " + gpa);
        
        String strAge = HelloWorld.checkAge(age);
        System.out.println("AGE = " + strAge);
    }
}
