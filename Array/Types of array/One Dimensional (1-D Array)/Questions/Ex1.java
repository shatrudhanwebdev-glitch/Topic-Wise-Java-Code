public class Ex1 {

    // shatrudhan.web.developer

    public static void main(String[] args) {

        // WAP sum of array using for loop.

        int arr[] = { 10, 20, 30, 40, 50 }; // ek integer array banaya hu jisme 5 elements hai.
        int sum = 0; // sum ko 0 se initiolize kiya hu.

        for (int i = 0; i < arr.length; i++) { // i = 0 se i < arr.length (5) tak loop chalaya hu.
            sum = sum + arr[i]; // har elements ko sum se add karaya hu.
        }
        System.out.println("Sum of array : " + sum); // finllly sum ko yaha print karaya hu.

    }
}