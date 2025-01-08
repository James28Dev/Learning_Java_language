
package chap1;

public class Human {
    String name, gender;
    int age;
    
    void introduce() {
        System.out.println("introduce()");
    }
    
    void sleep() {
        System.out.println("sleep()");
    }
    
    void speak() {
        System.out.println("speak()");
    }
    
    void showDetail() {
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Age : " + age);
        
    }
    
    public static void main(String[] args) {
        Human man = new Human();
        System.out.println("man object : " + man);
        man.name = "james";
        man.gender = "Male";
        man.age = 21;
        man.showDetail();
        man.introduce();
        man.sleep();
        man.speak();
    }
}
