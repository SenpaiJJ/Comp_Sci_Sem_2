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
        for (int i = 0; i < arr.length-1; i++){
            int minimum = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[minimum])
                    minimum = j;
            int temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;
            }
	}
	for(int i = 0; i < arr.length; i++){
		System.out.println(arr[i]);
	}
	
}
}
