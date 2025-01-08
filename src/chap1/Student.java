
package chap1;

public class Student {
    String studentId, studentName, faculty, major;
    
    void enrollment(String studenId) {
        System.out.println("enrollment()");
    }
    
    void payment(String studentId) {
        System.out.println("payment()");
    }
    
    void addCourse(String studenId) {
        System.out.println("addCourse()");
    }
    
    void dropCourse(String studenId) {
        System.out.println("dropCourse()");
    }
    void printAttribute() {
        System.out.println("================================");
        System.out.println("ID : " + studentId);
        System.out.println("Name : " + studentName);
        System.out.println("Faculty : " + faculty);
        System.out.println("Major : " + major);
        System.out.println("================================");
    }
}
