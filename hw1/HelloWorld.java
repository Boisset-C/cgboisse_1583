import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		//print console log instructions
		System.out.print("Fill in your first name to be greeted ");


		//create a new scanner class to store user input
		Scanner scanner = new Scanner(System.in);
		//Declare variable to store first name input
		String firstName = scanner.nextLine();
		//Declare variable stored with greeting
		String greeting  = "Hello World this is ";


		//Console logs greeting + whichever name stored in firstName variable
		System.out.println(greeting + firstName);
	}

}