package chap1;

public class Human {

    String name, gender;
    int age;

    void introduce() {
        System.out.println("introduce()");
    } //end introduce class

    void sleep() {
        System.out.println("sleep()");
    } //end sleep class

    void speak() {
        System.out.println("speak()");
    } //end speak class

    void showDetail() {
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Age : " + age);
    } //end showDetail class

    public static void main(String[] args) {
        Human man = new Human(); //create man object
        System.out.println("man object : " + man);
        man.name = "james";
        man.gender = "Male";
        man.age = 21;
        man.showDetail(); //call showDetail class
        man.introduce(); //call introduce class
        man.sleep(); //call sleep class
        man.speak(); //call speak class
    } //end main class
} //end Human class
