public class Ex7 {

    // shatrudhan.web.developer

    public static void main(String[] args) {

        // Question - Find the largest element in the array.

        // int arr[] = { 10, 11, 12, 13, 14, 15 };
        // int max = arr[0];

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > max) {
        // max = arr[i];
        // }

        // }
        // System.out.println("Largest element " + max);

        // Question - Find the smallest element in the array.

        int arr[] = { 15, 85, 75, 95, 42, 65, 45, 12, 35, 23, 88 };
        int smaller = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smaller) {
                smaller = arr[i];
            }

        }
        System.out.println("Smallest element = " + smaller);
    }
}
