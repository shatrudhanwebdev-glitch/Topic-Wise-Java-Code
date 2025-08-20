import java.util.Scanner;

public class ScannerClassExample {

    // shatrudhan.web.developer

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input from user
        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();

        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();

        // sum of num1 and num2
        int sum = num1 + num2;

        // final result
        System.out.println("Sum of num1 and num2 = " + sum);

        sc.close();
    }
}