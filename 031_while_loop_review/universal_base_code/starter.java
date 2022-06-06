import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int a = 0;
		while (true){
			int schmoop = rand.nextInt(100);
			if(a=99){
				break;
			}
			System.out.println(schmoop);
			a = a + 1;
		}
		
	}
}
