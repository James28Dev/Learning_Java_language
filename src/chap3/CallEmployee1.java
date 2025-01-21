package chap3;
public class CallEmployee1 {
    public static void main(String[] args) {
        // call static
        System.out.println("ID : "+Employee1.id);
        Employee1.work();
        // call non-static
        Employee1 em = new Employee1();
        System.out.println("Name : "+em.name);
        System.out.println("Age : "+em.age);
   }
}//end
