
import java.util.Scanner;

public class GasolineCalculation {

    static double ptt[] = {36.50, 33.24, 41.54, 29.34};
    static double bcp[] = {37.74, 35.24, 42.64, 28.99};
    static double shell[] = {37.34, 35.04, 41.84, 28.20};
    static double esso[] = {37.03, 35.34, 41.55, 29.10};

    static void printMainMenu() {
        System.out.println("--------------------------Menu--------------------------");
        System.out.println("1. Check in");
        System.out.println("2. Print Receipt");
        System.out.println("3. Print Tax Invoice");
        System.out.println("0. Exit");
    } //end printMainMenu class

    static void printGasStation() {
        System.out.println("\t------------------Petrol Brand------------------");
        System.out.println("\t1. PTT");
        System.out.println("\t2. BCP");
        System.out.println("\t3. Shell");
        System.out.println("\t4. Esso");
    } //end printGasStation class

    static void printCarType() {
        System.out.println("\t--------------------Car Type--------------------");
        System.out.println("\t1 : Sedan");
        System.out.println("\t2 : Pickup");
    } //end printCarType class

    static void printGasSedan() {
        System.out.println("\t--------------------Gas Type--------------------");
        System.out.println("\t1 : Gasohol 95");
        System.out.println("\t2 : Gasohol 91");
        System.out.println("\t3 : Benzin 91");
    } //end printGasSedan class

    static void printGasPickup() {
        System.out.println("\t--------------------Gas Type--------------------");
        System.out.println("\t1 : Diesel");
    } //end printGasPickup class

    static void printGasTypeOfCar(int carType) {
        switch (carType) {
            case 1:
                printGasSedan();
                break; //end case 1 of carType
            case 2:
                printGasPickup();
                break; //end case 2 of carType
        } //end carType switch
    } //end printGasTypeOfCar class

    static String printHeadGasStation(int brand) {
        switch (brand) {
            case 1:
                return "PTT Gas Station"; //end case 1 of brand
            case 2:
                return "BCP Gas Station"; //end case 2 of brand
            case 3:
                return "Shell Gas Station"; //end case 3 of brand
            case 4:
                return "Esso Gas Station"; //end case 4 of brand
            default:
                return "Empty"; //end case default of brand
        } //end brand switch
    } //end printHeadGasStation class

    static String printHeadReceiptAndTax(int menu) {
        switch (menu) {
            case 2:
                return "Receipt"; //end case 2 of menu
            case 3:
                return "Tax Invoice"; //end case 3 of menu
            default:
                return "Empty"; //end case default of menu
        } //end menu switch
    }  //end printHeadReceiptAndTax class

    static String printGasType(int carType, int gasType) {
        switch (carType) {
            case 1:
                switch (gasType) {
                    case 1:
                        return "Gasohol 95"; //end case 1 of gasType
                    case 2:
                        return "Gasohol 91"; //end case 2 of gasType
                    case 3:
                        return "Benzin 91"; //end case 3 of gasType
                } //end gasType switch
            //end case 1 of carType
            case 2:
                return "Diesel"; //end case 2 carType
            default:
                return "Empty"; //end default carType
        } //end carType switch
    } //end printGasType class

    static double calculatorLitre(int brand, int carType, int gasType, double amount) {
        switch (brand) {
            case 1:
                switch (carType) {
                    case 1:
                        switch (gasType) {
                            case 1:
                                return amount / ptt[0]; //end case 1 of gasType
                            case 2:
                                return amount / ptt[1]; //end case 2 of gasType
                            case 3:
                                return amount / ptt[2]; //end case 3 of gasType
                        } //end gasType switch
                    //end case 1 of carType
                    case 2:
                        return amount / ptt[3]; //end case 2 of carType
                } //end carType switch
            //end case 1 of brand
            case 2:
                switch (carType) {
                    case 1:
                        switch (gasType) {
                            case 1:
                                return amount / bcp[0]; //end case 1 of gasType
                            case 2:
                                return amount / bcp[1]; //end case 2 of gasType
                            case 3:
                                return amount / bcp[2]; //end case 3 of gasType
                        } //end gasType switch
                    //end case 1 of carType
                    case 2:
                        return amount / bcp[3]; //end case 2 of carType
                } //end carType switch
            //end case 2 of brand
            case 3:
                switch (carType) {
                    case 1:
                        switch (gasType) {
                            case 1:
                                return amount / shell[0]; //end case 1 of gasType
                            case 2:
                                return amount / shell[1]; //end case 2 of gasType
                            case 3:
                                return amount / shell[2]; //end case 3 of gasType
                        } //end gasType switch
                    //end case 1 of carType
                    case 2:
                        return amount / shell[3]; //end case 2 of carType
                } //end carType switch
            //end case 3 of brand
            case 4:
                switch (carType) {
                    case 1:
                        switch (gasType) {
                            case 1:
                                return amount / esso[0]; //end case 1 of gasType
                            case 2:
                                return amount / esso[1]; //end case 2 of gasType
                            case 3:
                                return amount / esso[2]; //end case 3 of gasType
                        } //end gasType switch
                    //end case 1 of carType
                    case 2:
                        return amount / esso[3]; //end case 2 of carType
                } //end carType switch
            //end case 4 of brand
        } //end brand switch
        return 0;
    } //end calculatorLitre class

    public static void main(String[] args) {
        int i = 1, brand = 0, carType = 0, gasType = 0;
        double tax, amount, totalAmount = 0;
        String strLitre, formattedAmount, formattedTax, formattedTotalAmount;

        Scanner sc = new Scanner(System.in);

        System.out.println("Gasoline Calculation");
        System.out.println("Program is created by Thanaphat");

        do {
            printMainMenu(); //call printMainMenu class
            System.out.print("Please Enter Menu [0-3] : ");
            int menu = sc.nextInt(); //get menu

            switch (menu) {
                case 0:
                    i++;
                    break; //end case 0 of menu
                case 1:
                    do {
                        printGasStation(); //call printGasStation class
                        System.out.print("\tPlease Select Petrol Brand : ");
                        brand = sc.nextInt(); //get brand
                    } while (brand < 1 || brand > 4); //end do-while loops

                    do {
                        printCarType(); //call printCarType class
                        System.out.print("\tPlease Enter Car Type : ");
                        carType = sc.nextInt(); //get carType
                    } while (carType < 1 || carType > 2); //end do-while loops

                    do {
                        printGasTypeOfCar(carType); //call printGasTypeOfCar class
                        System.out.print("\tPlease Enter Gas Type : ");
                        gasType = sc.nextInt(); //get gasType
                    } while ((carType == 1 && (gasType < 1 || gasType > 3)) || (carType == 2 && (gasType < 1 || gasType > 1))); //end do-while loops

                    System.out.print("\tPlease Enter Amount : ");
                    totalAmount = sc.nextDouble(); //get totalAmount
                    break; //end case 1 of menu
                case 2:
                    System.out.println("\t------------------------------------------------");
                    printHeadGasStation(brand); //call printHeadGasStation class
                    printHeadReceiptAndTax(menu); //call printHeadReceiptAndTax class
                    System.out.println("\t" + printHeadGasStation(brand) + "\n\t" + printHeadReceiptAndTax(menu));
                    System.out.println("\t------------------------------------------------");

                    tax = totalAmount * 0.07;
                    amount = totalAmount - tax;

                    printGasType(carType, gasType); //call printGasType class
                    strLitre = String.format("%.1f", calculatorLitre(brand, carType, gasType, amount));
                    System.out.println("\t" + printGasType(carType, gasType) + "\t" + strLitre + " litre\t" + totalAmount + " Bath");
                    System.out.println("\t------------------------------------------------");
                    break; //end case 2 of menu
                case 3:
                    System.out.println("\t------------------------------------------------");
                    printHeadGasStation(brand); //call printHeadGasStation class
                    printHeadReceiptAndTax(menu); //call printHeadReceiptAndTax class
                    System.out.println("\t" + printHeadGasStation(brand) + "\n\t" + printHeadReceiptAndTax(menu));
                    System.out.println("\t------------------------------------------------");

                    tax = totalAmount * 0.07;
                    amount = totalAmount - tax;

                    printGasType(carType, gasType); //call printGasType class
                    formattedAmount = String.format("%.0f", amount);
                    formattedTax = String.format("%.0f", tax);
                    formattedTotalAmount = String.format("%.2f", totalAmount);

                    strLitre = String.format("%.1f", calculatorLitre(brand, carType, gasType, amount));
                    System.out.println("\t" + printGasType(carType, gasType) + "\t" + strLitre + " litre\t" + totalAmount + " Bath");
                    System.out.println("\t------------------------------------------------");
                    System.out.println("\tAmount : " + formattedAmount);
                    System.out.println("\tVAT 7% : " + formattedTax);
                    System.out.println("\ttotal amonut : " + formattedTotalAmount);
                    break; //end case 3 of menu
            } //end menu switch
        } while (i == 1); //end do-while loops
    } //end main class
} //end GasolineCalculation class
