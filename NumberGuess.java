import java.util.Scanner;
import java.util.Random;

class NumberGuess{
	public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   //user input
	   System.out.println("pls enter user input:");
	   int input = sc.nextInt();
	   Random random = new Random();
	   int upperBound = 100;
	   int lowerBound = 1;
	   while(true){
		int unique = random.nextInt(upperBound-lowerBound+1)+lowerBound;
		System.out.println("computer generated guess");
		if(unique == input){
			System.out.println(unique+" Correct,Computer and user input are equal");
			break;
		}
		else if(unique>input){
			System.out.println(unique+" computer input is greater pls try again");
			upperBound = unique-1;
	    }
		else{
			System.out.println(unique+" computer input is lesser pls try again");
			lowerBound = unique+1;
        }
		}	   
	}
}
