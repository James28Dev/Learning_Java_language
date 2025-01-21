package chap3;
public class Employee2 {
    int id;
    String name;
    int age;

    public Employee2() {
        System.out.println("Default Cont");
    }

    public Employee2(int id) {
        this.id = id;
    }

    public Employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Employee2(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    
    static void work(){
        System.out.println("work()");
    }
    
    void getSalary(){
        System.out.println("getSalary()");
    }
    
    void printAttribute(){
        System.out.println("-----------------------------");
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("-----------------------------");
    }
    
    public static void main(String[] args) {
        // call static
//        work();
        // call non-static
        Employee2 em = new Employee2();
        em.printAttribute();
        Employee2 em2 = new Employee2(4001);
        em2.printAttribute();
        Employee2 em3 = new Employee2(4001, "Ney");
        em3.printAttribute();
        Employee2 em4 = new Employee2(4001, "Ney",18 );
        em4.printAttribute();
//        System.out.println("ID : "+em.id);
//        System.out.println("Name : "+em.name);
//        System.out.println("Age : "+em.age);
   }
}//end
