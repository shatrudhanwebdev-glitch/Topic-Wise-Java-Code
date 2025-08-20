import java.io.Console;

public class ConsoleClassExample {

    // shatrudhan.web.developer

    public static void main(String[] args) {

        Console c = System.console();

        // input from user
        System.out.print("Enter your name : ");
        String name = c.readLine();

        // final result
        System.out.println("My name is " + name + " Kumar. ");
    }
}