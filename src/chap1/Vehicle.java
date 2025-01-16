package chap1;

public class Vehicle {

    String brand, series, color;
    double price;

    void move() {
        System.out.println("move()");
    } //end move class

    boolean turnRight() {
        System.out.println("turnRight()");
        return true;
    } //end turnRight class

    boolean turnLeft() {
        System.out.println("turnLeft()");
        return true;
    } //end turnLeft class

    void doBreak() {
        System.out.println("break()");
    } //end doBreak class

    void start() {
        System.out.println("start()");
    } //end start class

    void stop() {
        System.out.println("stop()");
    } //end stop class

    void showDetail() {
        System.out.println("Brand :" + brand);
        System.out.println("Series :" + series);
        System.out.println("Color :" + color);
        System.out.println("Price :" + price);
    } //end showDetail class

    public static void main(String[] args) {
        Vehicle car = new Vehicle(); //create car object
        System.out.println("car object " + car);
        car.brand = "Honda";
        car.series = "CRV";
        car.color = "Pink";
        car.price = 1500000;
        car.start(); //call start
        car.move(); //call move
        car.turnLeft(); //call turnLeft
        car.turnRight(); //call turnRight
        car.doBreak(); //call doBreak
        car.stop(); //call stop
        car.showDetail(); //call showDetail
    } //end main class
} //end Vehicle class
