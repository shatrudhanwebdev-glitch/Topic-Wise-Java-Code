import java.util.Scanner;

public class Ex1 {

    // shatrudhan.web.developer

    public static void main(String[] args) {

        // WAP to take usere input of a imployee name, age, salary within Scanner Class.

        Scanner sc = new Scanner(System.in);

        // input name, age, salary from user
        System.out.print("Enter name : ");
        String name = sc.nextLine();

        System.out.print("Enter age : ");
        int age = sc.nextInt();

        System.out.print("Enter salary : ");
        double salary = sc.nextDouble();

        // final output
        System.out.println("Name of imployee : " + name);
        System.out.println("Age of imployee : " + age);
        System.out.println("Salary of imployee : " + salary);

        sc.close();
    }
}