package chap1;

public class Student {

    protected String studentId, studentName, faculty, major;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void enrollment(String studenId) {
        System.out.println("enrollment()");
    }

    public void payment(String studentId) {
        System.out.println("Moujay");
    }

    public void addCourse(String studenId) {
        System.out.println("addCourse()");
    }

    public void dropCourse(String studenId) {
        System.out.println("dropCourse()");
    }

    public void printAttribute() {
        System.out.println("\n================================");
        System.out.println("ID : " + studentId);
        System.out.println("Name : " + studentName);
        System.out.println("Faculty : " + faculty);
        System.out.println("Major : " + major);
        System.out.println("================================");
    }
} //end
