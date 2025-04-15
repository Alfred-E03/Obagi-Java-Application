import java.security.SecureRandom;

public class SecureRandomClass{
	public static void main (String[] args) {
		SecureRandom secureRandom = new  SecureRandom();
		
		boolean option = secureRandom.nextBoolean();
		System.out.printf("Do you love java? %b%n",option);
		
		int integer = secureRandom.nextInt();
		System.out.printf("The generated integer is %d%n",integer);
		
		int integerwithbound = secureRandom.nextInt(70000);
		System.out.printf("The generated integer is %d%n",integerwithbound);
		
		long number = secureRandom.nextLong();
		System.out.printf("The generatedinteger is %d%n",number);
		
		long number2 = secureRandom.nextLong(900_000_000_000L);
		System.out.printf("The generatedinteger is %d%n",number2);

	}
}