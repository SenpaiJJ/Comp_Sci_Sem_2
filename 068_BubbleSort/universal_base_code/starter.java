import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		
		int [] arr = new int[200];
		for (int i = 0; i < arr.length; i++){
			arr[i] = rand.nextInt(300);
		}
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
		    for (int j = 0; j < n - i - 1; j++)
		       if (arr[j] > arr[j + 1]) {
		int temp = arr[j];
		arr[j] = arr[j + 1];
		arr[j + 1] = temp;
	}
	for(int i = 0; i < arr.length; i++){
		System.out.println(arr[i]);
	}
	
}
}
