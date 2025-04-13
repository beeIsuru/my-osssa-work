import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        int num1,num2,sum;
        double avg=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1= ");
        num1=scanner.nextInt();

        System.out.println("Enter number 2= ");
        num2=scanner.nextInt();

        sum=num1+num2;
        avg=sum / 2;

        System.out.println("The sum =" + sum);
        System.out.println("The average = " + avg);
        



    }
}
