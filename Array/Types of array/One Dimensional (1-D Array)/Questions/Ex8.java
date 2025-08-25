public class Ex8 {

    // shatrudha.web.developer

    public static void main(String[] args) {

        // Question - Count how many even and odd numbers are present in the array.

        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int evencount = 0, oddcount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }
        System.out.println("Count even number = " + evencount);
        System.out.println("Count odd number = " + oddcount);
    }
}