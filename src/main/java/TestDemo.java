import java.util.Random;
import java.util.Scanner;

public class TestDemo {
	
	static Scanner sc = new Scanner(System.in);
	
    public static void main (String args[]) {
    	
    	//User interaction for addPositive method. 
    	
    	//working on creating a method that houses this user interaction
    	//called: userInputForAddPositive
    	
    	System.out.println("Enter a positive integer a=");
    	int a = sc.nextInt();
    	System.out.println("Enter another positive integer b=");
    	int b = sc.nextInt();
    	
    	int c = addPositive(a, b);
    	
    	System.out.println("The sum of integers a=" + a + " and b=" + b + " is " + c);
    	
    	
    }
	public static int addPositive(int a, int b) {
	
		if ( a > 0 && b > 0 ) {
			int c = a + b; 
			return c;
		}
		
		else {
			throw new IllegalArgumentException("\nBoth parameters must be positive!");
		}
		
	}
	
	public int randomNumberSquared() {
		int squaredNum = getRandomInt() * getRandomInt();
		return squaredNum;
	}

	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
}
