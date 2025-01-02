
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
    }

    static void printGasStation() {
        System.out.println("\t------------------Petrol Brand------------------");
        System.out.println("\t1. PTT");
        System.out.println("\t2. BCP");
        System.out.println("\t3. Shell");
        System.out.println("\t4. Esso");
    }

    static void printCarType() {
        System.out.println("\t--------------------Car Type--------------------");
        System.out.println("\t1 : Sedan");
        System.out.println("\t2 : Pickup");
    }

    static void printGasSedan() {
        System.out.println("\t--------------------Gas Type--------------------");
        System.out.println("\t1 : Gasohol 95");
        System.out.println("\t2 : Gasohol 91");
        System.out.println("\t3 : Benzin 91");
    }

    static void printGasPickup() {
        System.out.println("\t--------------------Gas Type--------------------");
        System.out.println("\t1 : Diesel");
    }

    static void printGasType(int carType) {
        switch (carType) {
            case 1:
                printGasSedan();
                break;
            case 2:
                printGasPickup();
                break;
        }
    }

    static double printReceiptAndTax(int menu, int brand, int carType, int gasType, double totalAmount) {
        double amount = 0, litre = 0, tax = 0;
        System.out.println("\t------------------------------------------------");
        switch (brand) {
            case 1:
                System.out.println("\tPTT Gas Station");
                break;
            case 2:
                System.out.println("\tBCP Gas Station");
                break;
            case 3:
                System.out.println("\tShell Gas Station");
                break;
            case 4:
                System.out.println("\tEsso Gas Station");
                break;
            default:
                System.out.println("\tEmpty");
        }
        switch (menu) {
            case 1:
                System.out.println("\tReceipt");
                break;
            case 2:
                System.out.println("\tTax Invoice");
                break;
        }
        System.out.println("\t------------------------------------------------");
        tax = totalAmount * 0.07;
        amount = totalAmount - tax;
        if (brand == 1) {
            if (carType == 1 && gasType == 1) {
                litre = amount / ptt[0];
                System.out.printf("\tGasohol-95\t");
            } else if (carType == 1 && gasType == 2) {
                litre = amount / ptt[1];
                System.out.print("\tGasohol-91\t");
            } else if (carType == 1 && gasType == 3) {
                litre = amount / ptt[2];
                System.out.print("\tBenzin-91\t");
            } else if (carType == 2 && gasType == 1) {
                litre = amount / ptt[3];
                System.out.print("\tDiesel\t\t");
            }
        } else if (brand == 2) {
            if (carType == 1 && gasType == 1) {
                litre = amount / bcp[0];
                System.out.printf("\tGasohol-95\t");
            } else if (carType == 1 && gasType == 2) {
                litre = amount / bcp[1];
                System.out.print("\tGasohol-91\t");
            } else if (carType == 1 && gasType == 3) {
                litre = amount / bcp[2];
                System.out.print("\tBenzin-91\t");
            } else if (carType == 2 && gasType == 1) {
                litre = amount / bcp[3];
                System.out.print("\tDiesel\t\t");
            }
        } else if (brand == 3) {
            if (carType == 1 && gasType == 1) {
                litre = amount / shell[0];
                System.out.printf("\tGasohol-95\t");
            } else if (carType == 1 && gasType == 2) {
                litre = amount / shell[1];
                System.out.print("\tGasohol-91\t");
            } else if (carType == 1 && gasType == 3) {
                litre = amount / shell[2];
                System.out.print("\tBenzin-91\t");
            } else if (carType == 2 && gasType == 1) {
                litre = amount / shell[3];
                System.out.print("\tDiesel\t\t");
            }
        } else if (brand == 4) {
            if (carType == 1 && gasType == 1) {
                litre = amount / esso[0];
                System.out.printf("\tGasohol-95\t");
            } else if (carType == 1 && gasType == 2) {
                litre = amount / esso[1];
                System.out.print("\tGasohol-91\t");
            } else if (carType == 1 && gasType == 3) {
                litre = amount / esso[2];
                System.out.print("\tBenzin-91\t");
            } else if (carType == 2 && gasType == 1) {
                litre = amount / esso[3];
                System.out.print("\tDiesel\t\t");
            }
        } else {
            System.out.print("\tEmpty\t\t");
        }
        String formattedLitre = String.format("%.1f", litre);
        String formattedAmount = String.format("%.1f", amount);
        String formattedTax = String.format("%.1f", tax);
        String formattedTotalAmount = String.format("%.1f", totalAmount);
        System.out.println(formattedLitre + " Litre\t" + formattedTotalAmount + " Bath");
        System.out.println("\t------------------------------------------------");
        switch (menu) {
            case 3:
                System.out.println("\tAmount : " + formattedAmount);
                System.out.println("\tVAT 7% : " + formattedTax);
                System.out.println("\ttotal amonut : " + formattedTotalAmount);
                break;
        }
        return 0;
    }

    public static void main(String[] args) {
        int i = 1, brand = 0, carType = 0, gasType = 0;
        double totalAmount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Gasoline Calculation");
        System.out.println("Program is created by Thanaphat");
        do {
            printMainMenu();
            System.out.print("Please Enter Menu [0-3] : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 0:
                    i++;
                    break;
                case 1:
                    do {
                        printGasStation();
                        System.out.print("\tPlease Select Petrol Brand : ");
                        brand = sc.nextInt();
                    } while (brand < 1 || brand > 4);
                    do {
                        printCarType();
                        System.out.print("\tPlease Enter Car Type : ");
                        carType = sc.nextInt();
                    } while (carType < 1 || carType > 2);
                    do {
                        printGasType(carType);
                        System.out.print("\tPlease Enter Gas Type : ");
                        gasType = sc.nextInt();
                    } while ((carType == 1 && (gasType < 1 || gasType > 3)) || (carType == 2 && (gasType < 1 || gasType > 1)));
                    System.out.print("\tPlease Enter Amount : ");
                    totalAmount = sc.nextDouble();
                    break;
                case 2:
                    printReceiptAndTax(menu, brand, carType, gasType, totalAmount);
                    break;
                case 3:
                    printReceiptAndTax(menu, brand, carType, gasType, totalAmount);
                    break;
            }
        } while (i == 1);
    }
}
