public class Ex2 {

    // shatrudhan.web.developer

    public static void main(String[] args) {

        // WAP to find sum and averrage of an array.

        int arr[] = { 12, 13, 14, 15, 16 }; // ek integer array banaya hu jisme 5 elements hai.
        int sum = 0; // sum ko 0 se initiolize kiya hu.
        int averrage = 0; // averrage ko 0 se initiolize kiya hu.

        for (int i = 0; i < arr.length; i++) { // i = 0 se i < arr.length (5) tak loop chlaya hu.
            sum = sum + arr[i]; // har emelements ko sum se add karaya hu or sum sum me store karaya hu.

        }
        averrage = sum / arr.length; // sum ko arr.length se divide karaya hu or averrage me store karaya hu.

        System.out.println("Sum of array : " + sum); // finllly sum ko yaha print karaya hu.
        System.out.println("Avarrage of array : " + averrage); // finllly averrage ko yaha print karaya hu.
    }
}