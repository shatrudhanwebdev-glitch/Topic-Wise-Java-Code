public class Ex10 {

    // shatrudhan.web.developer

    public static void main(String[] args) {

        // Question - Find the second largest element in the array.

        int arr[] = { 15, 25, 23, 12, 21, 36, 49, 74 };

        int largest = arr[0], secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest number = " + secondLargest);
    }
}
