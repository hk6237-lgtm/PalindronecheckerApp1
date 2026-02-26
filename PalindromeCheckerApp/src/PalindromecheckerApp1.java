/**
 *=================================================
 * MAIN CLASS -USECASE1palindromeApp
 * ================================================
 *
 * use case 1:Application entry & welcom message
 *
 * Description:
 * this class represents the entry point of the
 * palindrome checker management system.
 *
 * At this stage, the application;
 * -starts execution from the main()method
 * -Displays a welcome message
 * -shows application version
 *
 * no palindrome logic is implemented yet.
 *
 * the goal is to establish a clear startup flow.
 *
 * @author Developer
 * @version 1.0
 */

public class PalindromecheckerApp1 {
    /**
     * Application entry point .
     * <p>
     * this is the first method executed by jvm
     * when the program starts.
     *
     * @param args command-line arguments
     */

    public static void main(String[] args) {
        System.out.println("Welcome to the palindrome checker management system");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");

        //UC2
        /**
         * =========================================================================
         * Main class - usecase2PalindromeCheckerApp1
         * =========================================================================
         *
         * use case 2:Hardcoded palindrome validation
         *
         * Description:
         * This class demonstrates basic palindrome validation
         * using a hardcoded string value.
         *
         * At this stage,the application:
         * - stores a predefined string
         * - compares characters from both ends
         * - Determines whether the string is a palindrome
         * - Displays the result on the console
         *
         * This use case introduces fundamental comparison logic
         * before using advanced data stuctures.
         *
         * @author Developer
         * @version 2.0
         *
         */

            /**
             * Application entry point for UC2.
             *
             * @param args command-line arguments
             */

            String word = "madam";


            String reversed = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversed = reversed + word.charAt(i);
            }

            if (word.equals(reversed)) {
                System.out.println(word + " is a Palindrome.");
            } else {
                System.out.println(word + " is NOT a Palindrome.");
            }




    }

}