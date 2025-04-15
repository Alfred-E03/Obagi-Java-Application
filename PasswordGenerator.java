import java.util

public class PasswordGenerator{
	private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
	private static final String DIGITS = "0123456789";
	private static final String SPECIAL = "!@#$%^&*()-_+=<>?";
	
	public static final String ALL_CHARS = UPPER + LOWER + DIGITS + SPECIAL;
	private static final Random random = new();
	
	private static String generatePassword(int length) {
		StringBuilder password = new StringBuilder(length);
		for (int i = 0; < length; i++) {
			int index = random.nextInt(All_CHARS, length());
			password.append(All_CHARS.charAt(index));
			
		}
	}
	
	public static void main(String[] args) {
		int length = 12;
		String password = generatePassword(length);
		System.out.println("Generate Password: " + password); 
	}
	
}