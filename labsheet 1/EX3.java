import java.util.Scanner;

public class EX3 {

    public static void main(String[] args) {
        int age;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Age= ");
        age=scanner.nextInt();

        if(age<18){
            System.err.println("child");
        }
        else{
            System.out.println("Adult");
        }

    }
}
