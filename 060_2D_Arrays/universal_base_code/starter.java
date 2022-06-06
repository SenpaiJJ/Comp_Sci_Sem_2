import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Please input what length you want you stars to be(1-10)");
		int a = sc.nextInt();
		System.out.println("Please input how many rows you want you stars to have(1-10)");
		int b = sc.nextInt();
		int [][] arr = new int [a][b];
		for(int j = 0; j < b; j++){
			for (int i = 0; i < a; i++){
				int c = rand.nextInt(11);
				arr[j][i] = c;
			}
			System.out.println("");
		}
		
		for(int j = 0; j < b; j++){	
			for (int i = 0; i < a; i++){
				System.out.println("The value of all of the Row is: ");
			}
			System.out.println("");
		}
	}
	
	
	
	
	

		
}
