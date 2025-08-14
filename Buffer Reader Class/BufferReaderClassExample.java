import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderClassExample {

    // shatrudhan.web.developer

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        System.out.print("Enter 1st number : ");

        int num2 = Integer.parseInt(br.readLine());
        System.out.print("Enter 2nd number : ");

        int sum = num1 + num2;

        System.out.println("Sum of num1 and num2 = " + sum);
    }
}