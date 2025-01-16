
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
    } //end printMenu class

    static int sendNormal(int weight) {
        if (weight < 20)
            return 3; //end weight < 20 if
        else if (weight < 100)
            return 5; //end weight < 100 if
        else if (weight < 250)
            return 9; //end weight < 250 if
        else if (weight < 500)
            return 15; //end weight < 500 if
        else if (weight < 1000)
            return 25; //end weight < 1000 if
        else if (weight < 2000)
            return 45; //end weight < 2000 if
        return 0;
    } //end sendNormal class

    static int sendRegister(int price) {
        price += 13;
        return price;
    } //end sendRegister class

    static int sendEMS(int weight) {
        if (weight < 20)
            return 27; //end weight < 20 if
        else if (weight < 100)
            return 32; //end weight < 100 if
        else if (weight < 250)
            return 37; //end weight < 250 if
        else if (weight < 500)
            return 47; //end weight < 500 if
        else if (weight < 1000)
            return 62; //end weight < 1000 if
        else if (weight < 2000)
            return 77; //end weight < 2000 if
        return 0;
    } //end sendEMS class

    public static void main(String[] args) {
        int i = 1, weight;
        Scanner sc = new Scanner(System.in);
        printMenu(); //call printMenu class
        do {
            System.out.print("Please Enter Menu (0-3) : ");
            int menu = sc.nextInt(); //get menu

            switch (menu) {
                case 0:
                    i++;
                    break; //end case 0 of menu
                case 1:
                    System.out.println("1. Normal Letter");
                    System.out.print("\tEnter weight (g) : ");
                    weight = sc.nextInt(); //get weight
                    sendNormal(weight); //call sendNormal class
                    System.out.println("\tNormal Letter Service Price : " + sendNormal(weight) + " bath\n ");
                    break; //end case 1 of menu
                case 2:
                    System.out.println("2. Register Letter");
                    System.out.print("\tEnter weight (g) : ");
                    weight = sc.nextInt(); //get weight
                    sendNormal(weight); //call sendNormal class
                    sendRegister(sendNormal(weight)); //call sendRegister class
                    System.out.println("\tRegister Letter Service Price : " + sendRegister(sendNormal(weight)) + " bath\n");
                    break; //end case 2 of menu
                case 3:
                    System.out.println("3. EMS Letter");
                    System.out.print("\tEnter weight (g) : ");
                    weight = sc.nextInt(); //get weight
                    sendEMS(weight); //call sendEMS class
                    System.out.println("\tEMS Letter Service Price : " + sendEMS(weight) + " bath\n");
                    break; //end case 3 of menu
            } //end menu switch
        } while (i == 1); //end do-while loops
    } //end main class
} //end LetterPostShop class
