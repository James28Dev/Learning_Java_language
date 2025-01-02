
public class HelloWorld {

    static String checkBirthday(int day) {       
        String strDay = "", warn;
        if (day >= 6) {
            warn = "is holiday.";
        } else {
            warn = "is normal day.";
        }
        switch (day) {
            case 1:
                strDay = "Monday ";
                break;
            case 2:
                strDay = "Tuesday ";
                break;
            case 3:
                strDay = "Wednesday ";
                break;
            case 4:
                strDay = "Thursday ";
                break;
            case 5:
                strDay = "Friday ";
                break;
            case 6:
                strDay = "Saturday ";
                break;
            case 7:
                strDay = "Sunday ";
                break;
        }
        return strDay + warn;
    }

    static String checkGpa(int score) {
        if (score >= 80) {
            return "A";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 60) {
            return "C";
        } else if (score >= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    static String checkAge(int age) {
        if (age < 50) {
            return "young";
        } else {
            return "old";
        }
    }

    static void printMajor() {
        System.out.println("Computer Science");
    }

    static void printInfo(String id, String name) {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
    }

    public static void main(String[] args) {
        printMajor();
        printInfo("664234011", "Thanaphat Suwancharoen");
        System.out.println("Age : " + checkAge(21));
        System.out.println("Gpa : " + checkGpa(90));
        System.out.println("Birthday : " + checkBirthday(1));
    }
}
