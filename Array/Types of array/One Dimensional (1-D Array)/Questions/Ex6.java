public class Ex6 {

    // shatrudhan.web.developer

    public static void main(String[] args) {

        // Question - Find the sum of all elements in the array.

        int arr[] = { 10, 20, 30, 40, 50, 60 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all array = " + sum);
    }
}
