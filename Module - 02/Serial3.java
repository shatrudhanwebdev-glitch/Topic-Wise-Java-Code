public class Serial3 {

    // shatrudhan.web.developer

    static int sum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {

        // A method can call multiple times

        int result1 = sum(50, 25);
        int result2 = sum(45, 35);
        int result3 = sum(25, 45);

        System.out.println("Result1 = " + result1);
        System.out.println("Result2 = " + result2);
        System.out.println("Result3 = " + result3);
    }
}
