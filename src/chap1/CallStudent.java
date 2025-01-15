package chap1;

public class CallStudent {

    public static void main(String[] args) {
        System.out.println("1--------Student--------");
        Student james = new Student();
        System.out.println("Student = " + james);
        james.setStudentName("Thanaphat Suwancharoen");
        james.setStudentId("664234011");
        james.setFaculty("Science and Technology");
        james.setMajor("Computer Science");
        james.printAttribute();
        james.enrollment("664234011");
        james.payment("664234011");
        james.addCourse("664234011");
        james.dropCourse("664234011");
        
        Student ople = new Student();
        System.out.println("Student = " + ople);
        ople.setStudentName("Suvanee Kongjarean");
        ople.setStudentId("664234035");
        ople.setFaculty("Science and Technology");
        ople.setMajor("Computer Science");
        ople.printAttribute();
        ople.enrollment("664234035");
        ople.payment("664234035");
        ople.addCourse("664234035");
        ople.dropCourse("664234035");
        
        System.out.println("2--------GraduateStudent--------");
        
        GraduateStudent ney = new GraduateStudent();
        ney.studentId = "664234001";
        ney.studentName = "Thanesuan Phetnused";
        ney.faculty = "Science and Technology";
        ney.major = "Computer Science";
        ney.setStudylevel("Master Degree");
        ney.setThesisAdver("Mr.John");
        
        ney.oralExamination("664234001");
        ney.thesisExamination("664234001");
        ney.payment("664234001");
        ney.printAttribute();
    }
}
