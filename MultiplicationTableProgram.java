import java.util.Scanner;

public class MultiplicationTableProgram{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			
			System.out.print("Enter number: ");
			int number = input.nextInt();
			
			System.out.printf("Multiples of %d%n",number);
				
			for(int m = 1; m <= 20; m++){
				int multiple = m*number;
				System.out.printf("%d*%d=%d%n",number,m,multiple);
			}
	}
}
