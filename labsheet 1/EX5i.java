import java.util.Scanner;

public class EX5i {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.print("Enter value= ");
        int num = scanner.nextInt();

        int i = 0;
        while (i < num) {
            int j = 0;
            while (j < num) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;

        }
    }
}
