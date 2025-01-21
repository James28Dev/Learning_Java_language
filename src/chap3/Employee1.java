package chap3;
public class Employee1 {
    static int id = 4001;
    String name = "Ney";
    int age = 18;
    
    static void work(){
        System.out.println("work()");
    }
    
    void getSalary(){
        System.out.println("getSalary()");
    }
    
    public static void main(String[] args) {
        // call static
        System.out.println("ID : "+id);
        work();
        // call non-static
        Employee1 em = new Employee1();
        System.out.println("Name : "+em.name);
        System.out.println("Age : "+em.age);
   }
}//end
