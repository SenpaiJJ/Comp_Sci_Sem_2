import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int []y= new int[1000];
		int x = 0;
		while (x < 1000){
			Random rand = new Random();
			y[x] = rand.nextInt();
			x++;
			
		}
		x = 0;
		System.out.println("GJ");
		while (x<1000){
			System.out.println(y[x]);
			if (x> 1000)
			break;
			x++;

		}
	}
}
