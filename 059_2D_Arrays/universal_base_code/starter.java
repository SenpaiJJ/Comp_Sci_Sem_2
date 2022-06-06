import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int [][] arr = new int[5][4];
		for(int x = 0; x < arr.length; x = x + 2){
			for(int y = 0; y < arr[0].length; y = y + 2){
				arr[x][y] = 4;
				System.out.println(arr[x][y]);
			}
		}

	}
}
