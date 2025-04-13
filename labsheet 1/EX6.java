import java.util.Scanner;

class Types {

    public void type1(int num) {
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

    public void type2(int num) {
        for (int i = 1; i <= num; i++) { 
            for (int j = 1; j <= num - i; j++) { 
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { 
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}

public class EX6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int number = scanner.nextInt();

        Types obj = new Types();
        obj.type1(number);

        System.err.print("\n \n");

        obj.type2(number);

    }

}
