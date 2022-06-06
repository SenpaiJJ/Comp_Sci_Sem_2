import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
Scanner myObj4 = new Scanner(System.in);
    double Math4;
    System.out.println("Enter First Number"); 
    Math4 = myObj4.nextDouble();   
    System.out.println("First Number Is: " + Math4);
    Scanner myObj5 = new Scanner(System.in);
    double Math5;
    System.out.println("Enter Second Number"); 
    Math5 = myObj5.nextDouble();   
    System.out.println("Second Number Is: " + Math5);
    boolean youns = Math4 == Math5;
    if (youns) 
    {
        System.out.println( Math4 + " is equal to " +  Math5);
    }
    
    boolean youns2 = Math4 > Math5;
    if (youns2)
    {
        System.out.println(Math4 + " is greater to " + Math5);
    }
    boolean youns3 = Math4 < Math5;
    if (youns3)
    {
        System.out.println(Math4 + " is less than " + Math5);
    }
		
		
		
	
	}
}
