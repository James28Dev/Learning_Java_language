
public class HelloWorld {

    static String checkBirthday(int day) {
        String strDay = "", warn;
        if (day >= 6)
            warn = "is holiday."; //end day >= 6 if
        else
            warn = "is normal day."; //end else
        switch (day) {
            case 1:
                strDay = "Monday ";
                break; //end case 1 of day
            case 2:
                strDay = "Tuesday ";
                break; //end case 2 of day
            case 3:
                strDay = "Wednesday ";
                break; //end case 3 of day
            case 4:
                strDay = "Thursday ";
                break; //end case 4 of day
            case 5:
                strDay = "Friday ";
                break; //end case 5 of day
            case 6:
                strDay = "Saturday ";
                break; //end case 6 of day
            case 7:
                strDay = "Sunday ";
                break; //end case 7 of day
        } //end day switch
        return strDay + warn;
    } //end checkBirthday class

    static String checkGpa(int score) {
        if (score >= 80)
            return "A"; //end score >= 80 if
        else if (score >= 70)
            return "B"; //end score >= 70 if
        else if (score >= 60)
            return "C"; //end score >= 60 if
        else if (score >= 50)
            return "D"; //end score >= 50 if
        else
            return "E"; //end else
    } //end checkGpa class

    static String checkAge(int age) {
        if (age < 50)
            return "young"; //end age < 50 if
        else
            return "old"; //end else
    } //end checkAge class

    static void printMajor() {
        System.out.println("Computer Science");
    } //end printMajor class

    static void printInfo(String id, String name) {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
    } //end printInfo class

    public static void main(String[] args) {
        printMajor(); //call printMajor class
        printInfo("664234011", "Thanaphat Suwancharoen");
        System.out.println("Age : " + checkAge(21));
        System.out.println("Gpa : " + checkGpa(90));
        System.out.println("Birthday : " + checkBirthday(1));
    } //end main class
} //end HelloWorld class
