package chap1;

public class Student {

    protected String studentId, studentName, faculty, major;

    public String getStudentId() {
        return studentId;
    } //end getStudentId class

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    } //end setStudentId class

    public String getStudentName() {
        return studentName;
    } //end getStudentName class

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    } //end setStudentName class

    public String getFaculty() {
        return faculty;
    } //end getFaculty class

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    } //end setFaculty class

    public String getMajor() {
        return major;
    } //end getMajor class

    public void setMajor(String major) {
        this.major = major;
    } //end setMajor class

    public void enrollment(String studenId) {
        System.out.println("enrollment()");
    } //end enrollment class

    public void payment(String studentId) {
        System.out.println("Moujay");
    } //end payment class

    public void addCourse(String studenId) {
        System.out.println("addCourse()");
    } //end addCourse class

    public void dropCourse(String studenId) {
        System.out.println("dropCourse()");
    } //end dropCourse class

    public void printAttribute() {
        System.out.println("\n================================");
        System.out.println("ID : " + studentId);
        System.out.println("Name : " + studentName);
        System.out.println("Faculty : " + faculty);
        System.out.println("Major : " + major);
        System.out.println("================================");
    } //end printAttribute class
} //end
