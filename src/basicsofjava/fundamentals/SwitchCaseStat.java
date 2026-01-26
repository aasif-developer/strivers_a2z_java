package basicsofjava.fundamentals;
import java.util.Scanner;
class SwitchCaseStat {
    public static void main(String[] args) {
        System.out.print("Enter a number between 1 to 7 :");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        System.out.println("1.NORMAL SWITCH CASE FORMAT :");
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }
        System.out.println("2.ENHANCED SWITCH CASE FORMAT :");
        System.out.print("Enter a number between 1 to 7 :");
        Scanner obj = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid");
        }
    }
}
