package chap1;

public class GraduateStudent extends Student {

    private String studyLevel, thesisAdver;

    public String getStudylevel() {
        return studyLevel;
    }

    public void setStudylevel(String studylevel) {
        this.studyLevel = studylevel;
    }

    public String getThesisAdver() {
        return thesisAdver;
    }

    public void setThesisAdver(String thesisAdver) {
        this.thesisAdver = thesisAdver;
    }

    public void oralExamination(String studenid) {
        System.out.println("oralExamination()");
    }

    public void thesisExamination(String studenid) {
        System.out.println("thesisExamination()");
    }

    @Override
    public void payment(String studentId) {
        System.out.println("Pay by Credit");
    }

    @Override
    public void printAttribute() {
        super.printAttribute();
        System.out.println("StudyLevel : " + studyLevel);
        System.out.println("ThesisAdver : " + thesisAdver);
    }
} //end
