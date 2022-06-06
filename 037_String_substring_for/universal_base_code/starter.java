import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a word");
		String input = sc.nextLine();
		for(int a = 0; input.length() > a;){
		System.out.println(input.substring(a,a + 1));
		a++;
	}
}
}