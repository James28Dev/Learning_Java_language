package chap3;

public class EmployInfoTest {

    static double rate = 0.05;

    static double incSalary(double Salary, double inc) {
        return Salary * inc;
    }

    public static void main(String[] args) {
        double newSalary = 25000 + incSalary(25000, rate);
        System.out.println("เงินเดือนใหม่ คือ " + newSalary);
    }
}//end
