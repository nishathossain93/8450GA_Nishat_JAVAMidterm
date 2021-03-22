package string.problems;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */


        checkPalindrome("Madam");

    }


    public static void checkPalindrome(String word) {
        String actual = word.toLowerCase();
        String reverse = " ";

        for (int i = actual.length() - 1; i >= 0; i--) {
            reverse = reverse + actual.charAt(i);
        }
        if (actual.equals(reverse)) {
            System.out.println("is palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
