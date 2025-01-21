package chap3;

public class CallEmployInfoTest {
    public static void main(String[] args) {
        double newSalary =25000 + EmployInfoTest.incSalary(25000, EmployInfoTest.rate);
        System.out.println("เงินเดือนใหม่ คือ "+newSalary);
    }
}//end
