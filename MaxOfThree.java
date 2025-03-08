import java.util.Scanner;
public class MaxOfThree {
    public static void main(String[] args) {
        int num1 = getInput("Enter first number: ");
        int num2 = getInput("Enter second number: ");
        int num3 = getInput("Enter third number: ");
        
        int max = findMaximum(num1, num2, num3);
        System.out.println("The maximum number is: " + max);
    }
    //user input
    private static int getInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }
    // calculating max of three
    private static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}

//input 
//45
//56
//34
//output 
//56
