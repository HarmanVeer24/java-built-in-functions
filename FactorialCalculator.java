import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        int number = getInput("Enter a number: ");
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
    //user input
    private static int getInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }
    // factorial calculation recursive
    private static long calculateFactorial(int num) {
        if (num == 0) return 1;
        return num * calculateFactorial(num - 1);
    }
}
//input 5
//output 120

