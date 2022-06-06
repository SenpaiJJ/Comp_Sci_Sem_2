class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner b = new Scanner(System.in);
        int a;
        int c;
        System.out.println("Please input 1 number");
        a = b.nextInt();
        System.out.println("Please input another number");
        c = b.nextInt();
        System.out.println("Your numbers are " + a + " and " + c);
        boolean g = a%2==0;
        if (g)
        {
            System.out.println(a + " is even");
        }
        else
        {
            System.out.println(a + " is odd");
        }
        boolean h = c%2==0;
        if (h)
        {
            System.out.println(c + " is even");
        }
        else
        {
            System.out.println(c + " is odd");
        }
        System.out.println("Now I will divide your 2 numbers by 3, 4, and 5");
        double aa = a;
        double ac = c;
        System.out.println(a + " divided by 3 is " + aa/3);
        System.out.println(a + " divided by 4 is " + aa/4);
        System.out.println(a + " divided by 5 is " + aa/5);
        System.out.println(c + " divided by 3 is " + ac/3);
        System.out.println(c + " divided by 4 is " + ac/4);
        System.out.println(c + " divided by 5 is " + ac/5);
		
		
	}

	
}
