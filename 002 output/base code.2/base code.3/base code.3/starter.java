import java.util.Scanner;
import java.util.Random;


class starter {
    
    public static int multiply(int a, int b){
    
    
    return 0;
}
    public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("Input 2 intigers to multiply together");
	int First;
	int Second;
	First = sc.nextInt();
	Second = sc.nextInt();
	System.out.println("You have chosen the numbers " + First + " And " + Second);
	int Sum = First * Second;
	System.out.println(Sum);
	
	if (Sum%3 == 0){
	    System.out.println("They are divisible by 3");
	}
	else{ 
	
	    System.out.println("They are not divisible by 3");
	
}


    }
	}

