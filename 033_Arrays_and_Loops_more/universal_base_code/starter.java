import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int []y = new int [100];
		int min = 1000;
		
		int x = 0;
		while (x<y.length){
			y[x] = (rand.nextInt(150) + 51);
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