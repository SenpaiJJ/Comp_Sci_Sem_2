import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	System.out.println("You will be adding 2 numbers of your choice together");
	Scanner myObj = new Scanner(System.in);
    double Math1;
    System.out.println("Enter First Number"); 
    Math1 = myObj.nextDouble();   
    System.out.println("First Number Is: " + Math1);
    Scanner myObj2 = new Scanner(System.in);
    double Math2;
    System.out.println("Enter Second Number"); 
    Math2 = myObj2.nextDouble();   
    System.out.println("Second Number Is: " + Math2);
	System.out.println(Math1);
	System.out.println(Math2);
	System.out.println("_______");
	System.out.println(Math1 + Math2);
	
	// add two numbers
	double sum = (Math1 + Math2);
    System.out.println("The sum is:  "+ sum);
		
		
		
		
		
		
	}
}
