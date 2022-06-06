import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Put how many cookies you want");
		int a = sc.nextInt();
		
		ArrayList<String> arr = new ArrayList<String>(a);
		for(int i = 0; i < a; i++){
			arr.add(i, "Cookie");
		}
		for(int i = 0; i < a; i++){
			System.out.println(arr.get(i));
		}
		
	}
}
