public class StaticVariableExample {

    // shatrudhan.web.developer

    static int number = 45; // This is a static variable ( declered inside the class but outside the main )

    public static void main(String[] args) {
        /*
         * Static variable ko access Direct class name se access kiya jaata hai.
         * Example: StaticVariableExample.number
         */

        System.out.println(StaticVariableExample.number);
    }
}