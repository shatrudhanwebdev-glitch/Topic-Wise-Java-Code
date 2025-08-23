public class Ex3 {

    // shatrudhan.web.developer

    public static void main(String[] args) {

        // WAP to reverse an array?

        int arr[] = { 20, 30, 40, 50, 60 }; // ek integer array banaya hu jisme 5 elements hai.

        for (int i = arr.length - 1; i >= 0; i--) { // i = arr.length - 1 (4) se i >= 0 tak loop chlaya hu.
            System.out.println("Reverse array : " + arr[i]); // finllly reverse array ko yaha print karaya hu.
        }
    }
}
