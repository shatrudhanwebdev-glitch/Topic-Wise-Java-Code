public class Creat2DArrayInJava {

    // shatrudhan.web.developer

    public static void main(String[] args) {

        /*
         * dtatype arrayName[][] = new datatype[rows][columns];
         */
        int arr[][] = new int[3][3]; // yaha pe maine ek 2-D array banaya hai jisme 3 rows and 3 columns hai.

        // yaha pe maine array ke elements ko initialize karaya hu.
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[1][0] = 40;
        arr[1][1] = 50;
        arr[1][2] = 60;
        arr[2][0] = 70;
        arr[2][1] = 80;
        arr[2][2] = 90;

        // yaha pe maine array ke elements ko print karaya hu.
        for (int i = 0; i < arr.length; i++) { // yaha pe maine outer loop chlaya hai jo rows ko represent krta hai.
            for (int j = 0; j < arr[i].length; j++) { // yaha pe maine inner loop chlaya hai jo columns ko represent
                                                      // krta hai.
                System.out.print(arr[i][j] + " "); // finally yaha pe maine array ke elements ko print karaya
                // hai.
            }
            System.out.println(); // yaha pe maine ek new line print karaya hai taaki next row nayi line me print
                                  // ho.
        }
    }
}
