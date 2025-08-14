public class StaticVariableExample {

    // shatrudhan.web.developer

    static int number = 45; // This is a static variable ( declered inside the class but outside the main )

    public static void main(String[] args) {

        String name; // This is a local vaariable
        name = "Ivaan";

        /*
         * Static variable ko access karne ke liye object banane ki koi zaroori nahi
         * hai.
         * Direct class name se access kar sakte hai.
         * Example: StaticVariableExample.number
         */

        System.out.println(name);
        System.out.println(StaticVariableExample.number); // Print for static variable
    }
}