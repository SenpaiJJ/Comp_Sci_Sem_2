import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Random rand1 = new Random();
	int number1 = rand1.nextInt(1000);
	int tries1 = 0;
	Scanner input = new Scanner (System.in);
	int guess = input.nextInt();
	boolean win = (guess == number1);
	boolean lose = (guess > number1);
	boolean losee = (guess < number1);
	
	while (win == false);
	
		System.out.println("Guess a number between 1 and 1000");
		guess = input.nextInt();
		tries1++;
	
		if (win)
		{
		System.out.println(" YOu WIN STINKY");
		}
		else if (lose)
		{
		System.out.println("Your guess is too low");
		}
		else if (losee)
		{
		System.out.println("Your guess is too high");
		}
			
			
		}
}
	}
}
