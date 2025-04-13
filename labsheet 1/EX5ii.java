import java.util.Scanner;

public class EX5ii {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) { // Loop for rows
            for (int j = 1; j <= num - i; j++) { // Print spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { // Print stars
                System.out.print("* ");
            }
            System.out.println(); // Move to next line
        }
    }
}
