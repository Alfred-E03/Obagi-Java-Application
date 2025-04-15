import java.util.Scanner;
public class MethodOverLoading{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculate Perimeter of different shape");
		System.out.println("Enter 1 to Calculate Perimeter of A Square");
		System.out.println("Enter 2 to Calculate Perimeter of A Rectangle");
		System.out.println("Enter 3 to Calculate Perimeter of A Circle");
		System.out.println();
		
		System.out.print("Enter your choice: ");
		int choice = input.nextInt();
		
		switch(choice) {
			case 1:
			{
				System.out.print("Enter the length of the square: ");
				int lengthOfSquare = input.nextInt();
				
				MethodOverLoading.shape(LengthOfSquare);
			}
			break;
			case 2:
			{
				System.out.print("Enter the length of the rectangle: ");
				int lengthOfRectangle = input.nextInt();
				
				
				System.out.print("Enter the breadth of the rectangle: ");
				int breadthOfRectangle = input.nextInt();
				
				MethodOverLoading.shape(LengthOfRectangle,breadthOfRectangle);
			}
			break;
			case 3:
			{
				System.out.print("Enter the radius of the circle: ");
				double radiusOfCircle = input.nextInt();
				
				MethodOverLoading.shape(raiduesOfCircle);
			}
			break;
			default:
			System.out.println("Invalid input");
		}
	}
	
	public static void shape(int length){
		int perimeterOfSquare = 4 * length;
		
		System.out.printf("The perimter of Square is %d%n",perimterOfSquare);
	}
	
	public static void shape(int length, int breadth) {
		int perimeterOfRectangle = 2 * (length + breadth);
		
		System.out.printf("The perimter of Rectangle is %d%n",perimeterOfRectangle);
	}	
	public static void shape(double radius){
		int perimeterOfCircle = 2 * Math.PI * radiusOfCircle;
		
		System.out.printf("The perimter Of Circle is %d%n",perimeterOfCircle);
	}
}