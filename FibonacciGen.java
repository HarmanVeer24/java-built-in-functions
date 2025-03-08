import java.util.Scanner;

public class FibonacciGen {
    public static void main(String[] args) {
        int terms = getInput("Enter the number of terms: ");
        printFibonacci(terms);
    }
    //user input
    private static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }
    //helper function
    private static void printFibonacci(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
//input 6
//output 0 1 1 2 3 5 

