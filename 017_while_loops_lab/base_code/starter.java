import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner Repeat = new Scanner(System.in);
	System.out.println("What name would you like to repeat?");
	String name;
	name = Repeat.nextLine();
	System.out.println("You have chosen the name " + name);
	System.out.println("How many time would you like to loop this name?");
	int looper;
	looper = Repeat.nextInt();
	int c = 0;
	while (true)
	{
		if (c == looper)
		{
			break;
		}
		c = c + 1;
	
		System.out.println("You have chosen to loop : " + name);
	}
	}
}
