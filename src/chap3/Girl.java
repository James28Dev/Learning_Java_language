package chap3;

public class Girl {

    String name;
    String phone;

    public Girl(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    void print() {
        System.out.println("Name : " + name);
        System.out.println("PhoneNo : " + phone);
    }
}
