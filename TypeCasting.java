public class TypeCasting{
	public static void main(String [] args){
	//widening type cast
	double weight = 675;
	System.out.printf("Your wieght is %f %n",weight);
	
	//Narrowing type casting ? =63
	char alpha = '?' ;
	
	int asciiCode = (char)alpha;
	System.out.printf("The ASCII code for ? is %d",asciiCode);
	
	double height = 5.8;
	int myHeight= (int)height;
	System.out.printf("My faculty's height is %d %n", myHeight);
	}
}