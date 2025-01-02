
import java.util.Scanner;

public class LetterPostShop {

    static void printMenu() {
        System.out.println("Songkhia Post Office");
        System.out.println("Program is created by Thanaphat");
        System.out.println("--------------Menu--------------");
        System.out.println("0 : Exit");
        System.out.println("1 : Normal Letter");
        System.out.println("2 : Register Letter");
        System.out.println("3 : EMS Letter");
        System.out.println("--------------------------------");
    }

    static int sendNormal(int weight) {
        if (weight < 20) {
            return 3;
        } else if (weight < 100) {
            return 5;
        } else if (weight < 250) {
            return 9;
        } else if (weight < 500) {
            return 15;
        } else if (weight < 1000) {
            return 25;
        } else if (weight < 2000) {
            return 45;
        }
        return 0;
    }

    static int sendRegister(int price) {
        price += 13;
        return price;
    }

    static int sendEMS(int weight) {
        if (weight < 20) {
            return 27;
        } else if (weight < 100) {
            return 32;
        } else if (weight < 250) {
            return 37;
        } else if (weight < 500) {
            return 47;
        } else if (weight < 1000) {
            return 62;
        } else if (weight < 2000) {
            return 77;
        }
        return 0;
    }

    public static void main(String[] args) {
        int i = 1, weight;
        Scanner sc = new Scanner(System.in);
        printMenu();
        do {
            System.out.print("Please Enter Menu (0-3) : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 0:
                    i++;
                    break;
                case 1:
                    System.out.println("1. Normal Letter");
                    System.out.print("\tEnter weight (g) : ");
                    weight = sc.nextInt();
                    sendNormal(weight);
                    System.out.println("\tNormal Letter Service Price : " + sendNormal(weight) + " bath\n ");
                    break;
                case 2:
                    System.out.println("2. Register Letter");
                    System.out.print("\tEnter weight (g) : ");
                    weight = sc.nextInt();
                    sendNormal(weight);
                    sendRegister(sendNormal(weight));
                    System.out.println("\tRegister Letter Service Price : " + sendRegister(sendNormal(weight)) + " bath\n");
                    break;
                case 3:
                    System.out.println("3. EMS Letter");
                    System.out.print("\tEnter weight (g) : ");
                    weight = sc.nextInt();
                    sendEMS(weight);
                    System.out.println("\tEMS Letter Service Price : " + sendEMS(weight) + " bath\n");
                    break;
            }
        } while (i == 1);
    }
}
