public class Operators{
	public static void main(String[] args){
		//Assignment operator(=)
		
		int num1 = 13;
		int num2 = 5;
		
		num1 += num2;
		
		//Assignment operator(+,*,-,/,%)
		int sum = num1 + num2;
		
		int product = num1 * num2;
		
		int difference = num1 - num2;
		
		double quotient = (double)num1 / num2;
		
		int remainder = num1 % num2;
		
		//Relational Operators (>,<,>=,<=,==,!=)
		boolean isLessThan = num1 < num2;
		boolean isGreaterThan = num1 > num2;
		boolean isGreaterOrEqual = num1 >= num2;
		boolean isLessOrEqual = num1 <= num2;
		boolean isNotEqualTo = num1 != num2;
		
		//Logical Operators (&&,||,!)
		boolean isAnd = num1 > num2 && num1 >=num2;
		boolean isOr = num1 == num2 || num1 > num2;
		boolean isNot = !(num1 == num2 || num1 > num2);
		
		
		System.out.printf("The sum of the numbers is %d%n",sum);
		System.out.printf("The prodcut of the numbers is %d%n",product);
		System.out.printf("The difference between %d and %d is %d%n",num1,num2,difference);
		System.out.printf("The qoutient is %f%n",quotient);
		//.decimalspaces- "%.decimalspacesf%n"
		System.out.printf("The qoutient is %.1f%n",quotient);
		System.out.printf("The remainder is %d%n",remainder);
		
		//Relational Results
		System.out.println("=========================");
		System.out.printf("Is %d < %d? %b%n",num1,num2,isLessThan);
		System.out.printf("Is %d > %d? %b%n",num1,num2,isGreaterThan);
		System.out.printf("Is %d >= %d? %b%n",num1,num2,isGreaterOrEqual);
		System.out.printf("Is %d <= %d? %b%n",num1,num2,isLessOrEqual);
		System.out.printf("Is %d != %d? %b%n",num1,num2,isNotEqualTo);
		
		//Logical Results
		System.out.println("=========================");
		System.out.printf("Is %d > %d && %d >= %d? %b%n",num1,num2,num1,num2,isAnd);
		System.out.printf("Is %d == %d || %d > %d? %b%n",num1,num2,num1,num2,isOr);
		System.out.printf("Is !(%d == %d || %d > %d)? %b%n",num1,num2,num1,num2,isNot);
		
 
	}
}