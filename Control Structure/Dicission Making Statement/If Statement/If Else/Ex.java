import java.util.Scanner;

public class Ex {

    // shatrudhan.web.developer

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input from user
        System.out.println("Enter number : ");
        int number = sc.nextInt();

        // condition
        if (number > 50) {
            System.out.println("Larger number");
        }

        else {
            System.out.println("Smaller number");
        }

        sc.close();
    }
}