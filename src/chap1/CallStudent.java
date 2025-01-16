package chap1;

public class CallStudent {

    public static void main(String[] args) {
        System.out.println("1--------Student--------");
        Student james = new Student(); //create james object
        System.out.println("Student = " + james);
        james.setStudentName("Thanaphat Suwancharoen"); //call setStudentName class in Student.java
        james.setStudentId("664234011"); //call setStudentId class in Student.java
        james.setFaculty("Science and Technology"); //call setFaculty class in Student.java
        james.setMajor("Computer Science"); //call setMajor class in Student.java
        james.printAttribute(); //call printAttribute class in Student.java
        james.enrollment("664234011"); //call enrollment class in Student.java
        james.payment("664234011"); //call payment class in Student.java
        james.addCourse("664234011"); //call addCourse class in Student.java
        james.dropCourse("664234011"); //call dropCourse class in Student.java
        
        Student ople = new Student(); //create ople object
        System.out.println("Student = " + ople);
        ople.setStudentName("Suvanee Kongjarean"); //call setStudentName class in Student.java
        ople.setStudentId("664234035"); //call setStudentId class in Student.java
        ople.setFaculty("Science and Technology"); //call setFaculty class in Student.java
        ople.setMajor("Computer Science"); //call setMajor class in Student.java
        ople.printAttribute(); //call printAttribute class in Student.java
        ople.enrollment("664234035"); //call enrollment class in Student.java
        ople.payment("664234035"); //call payment class in Student.java
        ople.addCourse("664234035"); //call addCourse class in Student.java
        ople.dropCourse("664234035"); //call dropCourse class in Student.java
        
        System.out.println("2--------GraduateStudent--------");
        
        GraduateStudent ney = new GraduateStudent(); //create ney object
        ney.studentId = "664234001"; //call studentId in Student.java
        ney.studentName = "Thanesuan Phetnused"; //call studentName in Student.java
        ney.faculty = "Science and Technology"; //call faculty in Student.java
        ney.major = "Computer Science"; //call major in Student.java
        ney.setStudylevel("Master Degree"); //call setStudylevel class in GraduateStudent.java
        ney.setThesisAdver("Mr.John"); //call setThesisAdver class in GraduateStudent.java
        
        ney.oralExamination("664234001"); //call oralExamination class in GraduateStudent.java
        ney.thesisExamination("664234001"); //call thesisExamination class in GraduateStudent.java
        ney.payment("664234001"); //call payment class in GraduateStudent.java
        ney.printAttribute(); //Override call printAttribute class in in GraduateStudent.java extends by Student.java
    } //end main class
} //end CallStudent class
