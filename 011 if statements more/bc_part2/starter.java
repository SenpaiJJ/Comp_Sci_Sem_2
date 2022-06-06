import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
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
	Scanner myObj3 = new Scanner(System.in);
    double Math3;
    System.out.println("Enter Third Number"); 
    Math3 = myObj3.nextDouble();   
    System.out.println("Third Number Is: " + Math3);
	boolean shmitty1 = (Math1 < Math2 && Math2 < Math3);
	if (shmitty1)
	{
		System.out.println(Math3 + " is the greatest number.");
	}
	boolean shmitty2 = (Math1 > Math2 && Math1 > Math3);
	if (shmitty2)
	{
		System.out.println(Math1 + " is the greatest number.");
	}
	boolean shmitty3 = (Math1 > Math2 &&  Math2 > Math3);
	if (shmitty3)
	{
		System.out.println(Math3 + " is the greatest number.");
	}
		
	}
}
