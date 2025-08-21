import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1 {

    // shatrudhan.web.developer

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // input from user
        System.out.print("Enter number : ");
        int number = Integer.parseInt(br.readLine());

        // condition
        if (number > 50) { // only > 50 print hoga
            System.out.println("Larger number");
        }

    }
}