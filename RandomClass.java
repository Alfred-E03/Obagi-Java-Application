import java.security.SecureRandom;
import java.util.Scanner;

public class RandomClass{
	public static void main (String[] args) {
		SecureRandom secureRandom = new  SecureRandom();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your number: ");
		int userInput = input.nextInt();
		
		if (userInput <=0) {
			System.out.println("Enter a positive number above 0");
		}
		else {
			int number= secureRandom.nextInt(userInput);
			System.out.printf("Random number is %d%n",number);
		}
	}
}