import java.util.Scanner;

public class Ex1 {

    // shatrudhan.web.developer

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input from user
        System.out.print("Enter name : ");
        String name = sc.nextLine();

        System.out.print("Enter age : ");
        int age = sc.nextInt();

        System.out.print("Enter salary : ");
        double salary = sc.nextDouble();

        // final result
        System.out.println("Name of imployee : " + name);
        System.out.println("Age of imployee : " + age + " years ");
        System.out.println("Salary of imployee : " + salary);

        sc.close();
    }
}