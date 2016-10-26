import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int numberToGuess = rand.nextInt(1000);
		System.out.println(numberToGuess);
		int numberOfTries = 0;
		int guess=0;
		System.out.println("Guess the number between 1 and 1000");
		while(numberToGuess != guess){
		Scanner scan = new Scanner(System.in);
		guess = scan.nextInt();
		numberOfTries++;
		
		if(numberToGuess == guess){
			System.out.println("You guessed right. You Won!!");
			System.out.println("Number of guesses is "+numberOfTries);
			
		}
		else if (numberToGuess > guess){
			System.out.println("You guessed low. Guess again.");
		}
		else{
			System.out.println("You guessed high. Guess again.");
		}
		
	}
	}

}
