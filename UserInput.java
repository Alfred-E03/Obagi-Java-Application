import java.util.Scanner;

public class UserInput{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = input.nextline();
		
		System.out.print("Enter your age: ");
		byte age = input.nextByte();
		
		System.out.print("Enter your address: ");
		String address = input.nextline();
		
		System.out.print("Enter your account balance: ");
		float balance = input.nextfloat();
		
		System.out.print("Do you love Java(True/False): ")
		boolean isJava = input.nextBoolean();
		System.out.println();
		
		System.out.printf("Hello %s, you are welcome to First Bank%n,name);
		System.out.printf("You account balance is %c%.2f%n","$", balance);
		System.out.printf("Your are living in %s %n",address);
		System.out.printf("You are %d years old %n,age);
		System.out.printf("%s do you love Java? %b%n",name,isJava);
		
	}
}