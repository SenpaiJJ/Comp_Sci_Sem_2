import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the command window when you compile and run this program.
	Random randomGenerator = new Random();
      int randomInt = randomGenerator.nextInt(9) + 0;
      System.out.println("First Random number is : " + randomInt);
	Random randomGenerator2 = new Random();
      int randomInt2 = randomGenerator2.nextInt(100) + 1;
      System.out.println("Second Random number is : " + randomInt2);
	Random randomGenerator3 = new Random();
      double randomInt3 = randomGenerator3.nextDouble()*1 + 2.5;
      System.out.println("Third Random number is : " + randomInt3);
		Random randomGenerator4 = new Random();
      double randomInt4 = randomGenerator4.nextDouble()*575 + 14;
      System.out.println("Fourth Random number is : " + randomInt4);	
		
		
		
		
	}
}
