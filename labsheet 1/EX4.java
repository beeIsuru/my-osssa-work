import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of the day");
        int date = scanner.nextInt();

        switch (date) {
            case 1:
                System.err.println("Day of the week: Monday");
                break;
            case 2:
                System.err.println("Day of the week: Tuesday");
                break;
            case 3:
                System.err.println("Day of the week: tWednesday");
                break;
            case 4:
                System.out.println("Day of the week: Thursday");
                break;
            case 5:
                System.out.println("Day of the week: Friday");
                break;
            case 6:
                System.out.println("Day of the week: Saturday");
                break;
            case 7:
                System.out.println("Day of the week: Sunday");
                break;

            default:
                break;
        }

        System.out.println("Good bye15");
    }
}
