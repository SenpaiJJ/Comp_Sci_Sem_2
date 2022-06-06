import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		
		int [] arr = new int[200];
		for (int i = 0; i < arr.length; i++){
			arr[i] = rand.nextInt(300);
		}
        for (int i = 1; i < arr.length; ++i) {
            int k = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = k;
        }
        for (int i = 0; i < arr.length; ++i){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
    }
}