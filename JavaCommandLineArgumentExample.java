public class JavaCommandLineArgumentExample {

    // shatrudhan.web.developer

    public static void main(String[] args) {

        int i;
        for (i = 0; i < args.length; i++) {
            System.out.println(args[i]);

            /*
             * Run karne ki tarika
             * Compile karo:
             * javac JavaCommandLineArgumantExample.java
             * java JavaCommandLineArgumant Hello World 123
             * 
             * ⚠ Dhyaan rahe: java ke baad sirf class ka naam aata hai (file ka .java ya
             * .class extension nahi lagana).
             */
        }
    }

}