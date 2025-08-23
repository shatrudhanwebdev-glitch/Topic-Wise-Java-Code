public class Ex4 {

    // shatrudhan.web.developer

    public static void main(String[] args) {

        // WAP to copy a array?

        int arr[] = { 10, 20, 30, 40, 50 };

        // new array banaya same size ka
        int copy[] = new int[arr.length];

        // copying array
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        // printing copied array
        System.out.println("Copy array");
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}
