import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter and integer to be used by the factorial of 5");
	int a = sc.nextInt();
	int y = a;
	int c = a;
	int b = 1;
	while (true){
		//c = c -1;
		y = y * b;
		if (b == (a-1)){
			break;
		}
		b = b + 1;
	}
	System.out.println(y);	
		
	}
	
}
