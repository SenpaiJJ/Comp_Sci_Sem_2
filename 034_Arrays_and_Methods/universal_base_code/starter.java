import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random r = new Random();
		int []a = new int[100];
		int x = 0;
		while(x < 100){
			a[x] = r.nextInt(100) + 1;	
			x++;
	}
	toStringArray(a);
	getArrayAverage(b);
	System.out.println("The Average is: " + b);
	}

	
		
	public static void toStringArray(int[]a){
		int count = 0;
		while(count < 100){
			System.out.println(a[count]);
			count++;
			}
			return;
		}
	public static double getArrayAverage(int[]a){
		int c = 0;
		double ans = 0;
			while(c<100){
				ans = a[c] + ans;
				c++;
			}
			double swag = (ans/100);
			return swag;
	}
}