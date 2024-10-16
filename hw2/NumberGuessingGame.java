//Submitted by Cosme Boisset - HW2 - A Number Guessing Game
//Link to repo: https://gitlab.cs.uno.edu/cgboisse/cgboisse_1583/-/tree/main/hw2?ref_type=heads
import java.util.Scanner;
import java.util.Random;

/*
Your task is to create an exciting Number Guessing Game in Java. The game will
generate a random number between 1 and 10, and the player will attempt to guess the
number. The game will provide feedback based on the guesses. To quit the game, the
player can enter -1.
*/

public class NumberGuessingGame {
	public static void main(String[] args) {
		//setup
		Random randomNumberGenerator = new Random();
		Scanner input = new Scanner(System.in);

		//Generate a random number between 1 and 10 (inclusive) 
		int randomNumber = randomNumberGenerator.nextInt(10) + 1;
		
		int totalPlayerGuesses = 1;
		boolean gameOver = false;



		/* Display a friendly welcome message to the player "Welcome to the Number 
		Guessing Game, <provide your first , last name>!" */
		System.out.println("Welcome to the Number Guessing Game, Cosme Boisset");

		//start game
		while (gameOver == false) {

			/*Prompt the player to enter their guess for the randomly generated number 
			"Guess a number between 1 and 10 (-1 to quit): ". */
			int playerGuess = input.nextInt();
			System.out.println("Guess a number between 1 and 10 (-1 to quit): " + playerGuess);

			/*If the player enters -1 as their guess, display a message saying they quit the game
			and end the program. Example: "You have quit the game. Goodbye!" */
			if (playerGuess == -1) {
					System.out.println("You have quit the game. Goodbye!");
					System.exit(-1);
				}


			//Compare the player's guess with the randomly generated number and provide
			if (playerGuess < randomNumber) {
				System.out.println("Too low!");
				totalPlayerGuesses++;

			} else if (playerGuess > randomNumber) {
				System.out.println("Too high!");
				totalPlayerGuesses++;

			} else if (playerGuess == randomNumber) {
				System.out.println("Congratulations! You guessed the correct number in " + totalPlayerGuesses + " attempts.");
				gameOver = true;
				System.exit(-1);


				}

		}

	}
}