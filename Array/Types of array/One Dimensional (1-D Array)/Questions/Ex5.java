import java.util.Scanner;

public class Ex5 {
    // shatrudhan.web.developer

    public static void main(String[] args) {

        // Question - Take input from the user into an array and then print it.

        Scanner sc = new Scanner(System.in);

        // ask user for array size
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        // ceate array of given size
        int arr[] = new int[size];

        // input elements from user
        System.out.println("Enter " + size + " elements : ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }

        // print elements
        System.out.println("Array elements are : ");

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        sc.close();

    }
}
