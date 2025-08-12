import java.io.*;

public class BufferedReaderClassExample {

    // shatrudhan.web.developer

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter 1st number : ");
        int num1 = Integer.parseInt(br.readLine());

        System.out.print("Enter 2nd number : ");
        int num2 = Integer.parseInt(br.readLine());

        int mul = num1 * num2;

        System.out.println("Value of muntiple num1 and num2 = " + mul);
    }
}