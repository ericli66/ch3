import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		
		//pick a random number
		int number = random.nextInt(100) + 1;
		
		//Print instructions
		System.out.println("I'm thinking of a number between 1 and 100");
		System.out.println("(including both). Can you guess what it is?");
		System.out.print("Type a number: ");
		
		//read the guess number
		int guessNumber = in.nextInt();
		System.out.println("Your guess is: " + guessNumber);
		
		//calculate difference
		int difference = Math.abs(guessNumber - number);
		
		//Print result
		System.out.println("The number I was thinking of is: " + number);
		System.out.println("You were off by: " + difference);
	}
}
