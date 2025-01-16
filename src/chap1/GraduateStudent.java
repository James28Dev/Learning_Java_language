package chap1;

public class GraduateStudent extends Student {

    private String studyLevel, thesisAdver;

    public String getStudylevel() {
        return studyLevel;
    } //end getStudylevel class

    public void setStudylevel(String studylevel) {
        this.studyLevel = studylevel;
    } //end setStudylevel class

    public String getThesisAdver() {
        return thesisAdver;
    } //end getThesisAdver class

    public void setThesisAdver(String thesisAdver) {
        this.thesisAdver = thesisAdver;
    } //end setThesisAdver class

    public void oralExamination(String studenid) {
        System.out.println("oralExamination()");
    } //end oralExamination class

    public void thesisExamination(String studenid) {
        System.out.println("thesisExamination()");
    } //end thesisExamination class

    @Override
    public void payment(String studentId) {
        System.out.println("Pay by Credit");
    } //end payment class

    @Override
    public void printAttribute() {
        super.printAttribute();
        System.out.println("StudyLevel : " + studyLevel);
        System.out.println("ThesisAdver : " + thesisAdver);
    } //end printAttribute class
} //end GraduateStudent class
