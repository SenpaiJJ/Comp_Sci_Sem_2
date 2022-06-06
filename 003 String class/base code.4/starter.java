import java.util.Scanner;
import java.util.Random;

	
	class Dog {
		
		public String name;
		public int age;
		
		public Dog()
		{
			name = new String("Clifford");
			age = (3);
		}
		public Dog(String a, int c)
		{
			name = a;
			age = c;
		}
		public Dog(String a, String c)
		{
			name = a;
			breed = c;
		}
		public void bark()
		{
			System.out.println(name + "Barks");
		}
		public boolean isSleeping()
		{
			Random rand = new Random();
			boolean x = rand.nextBoolean();
			if(x)
			return true;
			else
			return false;
		}
	}
		
		
		
		
	class starter {
		public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		Random Rand = new Random();
		System.out.println("You will be making 2 dogs, The First dog will require : |1|- A Dogs name.|2|- The Dog's Age. ");
		String q = sc.nextLine();
		int s = sc.nextInt();
		Dog x = new Dog();
		Dog y = new Dog(q, s);
		System.out.println("You have chosen the name: " + q + ", And the Age "+ s);
		
			
		System.out.println("For the second dog, you will be inputting the following: |1|- A Dogs name.|2|- A Dog's Breed.  ");	
		String r = sc.nextLine();
		Dog z = new Dog(q, r);
		q = sc.nextLine();
		System.out.println("You have chosen the name: " + q + ", And the Breed "+ s);
		}
	}
	
		
		
		
		
		
		
		

		