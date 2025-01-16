
public class MultiplicationTable {

    static void printHead() {
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (int i = 1; i <= 12; i++)
            System.out.print("\t" + i); //end for loops
        System.out.println("\n----------------------------------------------------------------------------------------------------");
    } //end printHead class

    static void printDetails() {
        for (int i = 2; i <= 12; i++) {
            System.out.print(i + "\t");
            for (int j = 1; j <= 12; j++)
                System.out.print(i * j + "\t"); //end for loops
            System.out.println("\n");
        } //end for loops
    } //end printDetails class

    public static void main(String[] args) {
        printHead(); //call printHead class
        printDetails(); //call printDetails class
    } //end main class
} //end MultiplicationTable class
