import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input what length you want you stars to be");
		int a = sc.nextInt();
		System.out.println("Please input how many rows you want you stars to have");
		int b = sc.nextInt();
		
	
	for(int j = 0; j < b; j++){
		for (int i = 0; i < a; i++){
			System.out.print("*");
		}
		System.out.println("");
	}
	

		
	}
}
