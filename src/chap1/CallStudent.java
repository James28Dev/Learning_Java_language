
package chap1;

public class CallStudent {
    public static void main(String[] args) {
        Student james = new Student();
        System.out.println("Student = " + james);
        james.studentName = "Thanaphat Suwancharoen";
        james.studentId = "664234011";
        james.faculty = "Science and Technology";
        james.major = "Computer Science";
        james.printAttribute();
        james.enrollment("664234011");
        james.payment("664234011");
        james.addCourse("664234011");
        james.dropCourse("664234011");
        
        Student ople = new Student();
        System.out.println("Student = " + ople);
        ople.studentName = "Suvanee Kongjarean";
        ople.studentId = "664234035";
        ople.faculty = "Science and Technology";
        ople.major = "Computer Science";
        ople.printAttribute();
        ople.enrollment("664234035");
        ople.payment("664234035");
        ople.addCourse("664234035");
        ople.dropCourse("664234035"); 
    }
}
