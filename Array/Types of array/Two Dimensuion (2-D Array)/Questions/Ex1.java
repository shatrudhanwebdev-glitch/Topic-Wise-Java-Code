public class Ex1 {

    // shatrudhan.web.developer

    public static void main(String[] args) {

        // WAP to print 2-D array?

        int arr[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } }; // yaha pe maine ek 2-D array banaya hai jisme 3 rows and 3 columns hai.

        for (int i = 0; i < arr.length; i++) { // yaha pe maine outer loop chlaya hai jo rows ko represent krta hai.
            for (int j = 0; j < arr[i].length; j++) { // yaha pe maine inner loop chlaya hai jo columns ko represent krta hai.
                System.out.print(arr[i][j] + " "); // finally yaha pe maine array ke elements ko print karaya hai.
            }
            System.out.println(); // yaha pe maine ek new line print karaya hai taaki next row nayi line me print ho.
        }
    }
}