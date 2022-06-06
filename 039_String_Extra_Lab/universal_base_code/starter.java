import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner (System.in);
		System.out.println("Please input a phrase for me to print out, then reverse just to flex... hehehehhe ;)");
		String a = sc.nextLine();
		String b = " ";
		int x = 0;
		int t = 0;
		while(true){
			t = x;
			x = a.indexOf(b, x+1);
			System.out.print(a.substring(t, x));
			if(x == -1){
				break;
			}
		}
		
		
		// System.out.print("The last name is:");
		// 	for(int i = x; i < a.length(); i++){
		// 		String y = a.substring(i, i+1);
		// 		System.out.print(y);
  //            }
		
		
	}
}