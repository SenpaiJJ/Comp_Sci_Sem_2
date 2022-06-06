import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
    	Random rand = new Random();
		int a = (int)(Math.random()*10);
		int b = (int)(Math.random()*100) + 1;
		double c = Math.random()*3.5 + 1;
		double d = Math.random()*589 + 14;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		
	}
}
