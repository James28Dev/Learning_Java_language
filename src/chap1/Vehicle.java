
package chap1;

public class Vehicle {
    String brand, series, color;
    double price;
    
    void move(){
        System.out.println("move()");
    }
    
    boolean turnRight() {
        System.out.println("turnRight()");
        return true;
    }
    
    boolean turnLeft() {
        System.out.println("turnLeft()");
        return true;
    }
    
    void doBreak() {
        System.out.println("break()");
    }
    
    void start() {
        System.out.println("start()");
    }
    
    void stop() {
        System.out.println("stop()");
    }
    
    void showDetail() {
        System.out.println("Brand :" + brand);
        System.out.println("Series :" + series);
        System.out.println("Color :" + color);
        System.out.println("Price :" + price);
    }
    
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        System.out.println("car object " + car);
        car.brand = "Honda";
        car.series = "CRV";
        car.color = "Pink";
        car.price = 1500000;
        car.start();
        car.move();
        car.turnLeft();
        car.turnRight();
        car.doBreak();
        car.stop();
        car.showDetail();
    }
}
