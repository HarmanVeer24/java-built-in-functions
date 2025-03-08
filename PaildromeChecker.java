import java.util.Scanner;

public class PaildromeChecker {
    public static void main(String[] args) {
        String input = getInput("Enter a string: ");
        boolean isPalindrome = checkPalindrome(input);
        System.out.println(input + " is " + (isPalindrome ? "a palindrome." : "not a palindrome."));
    }
    //user input
    private static String getInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextLine();
    }
    //helper function
    private static boolean checkPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
//input racecar
//output true
