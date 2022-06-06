import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Random rand = new Random();
	int i = 0;
	int a = 0;
	int b = 0;
	int counter = 0;
	Dwarf[]c = new Dwarf[100];
	String [] names = new String[7];
	names[0] = "Grumpy";
	names[1] = "Dopey";
	names[2] = "Doc";
	names[3] = "Happy";
	names[4] = "Bashful";
	names[5] = "Sneezy";
	names[6] = "Sleepy";
	for(i = 0; i < 100; i++){
		c[i] = new Dwarf();	
	}
	for(i = 0; i < 100; i++){
		int r = rand.nextInt(7);
		String tempname = names[r];
		c[i].setName(tempname);
		
	}
	int Ages = 0;
	for(i = 0; i < 100; i++){
    	Ages = rand.nextInt(100) + 1;
    	int tempint = Ages;
    	c[i].setAge(tempint);
	}
	
	for(i = 0; i < 100; i++){
		System.out.println(c[i].getName());
	}
	for(i = 0; i < 100; i++){
		System.out.println(c[i].getAge());
	}
	System.out.println("The name to match is: " + c[0]);
	for (i = 0; i < 100; i++){
		if (c[i].isSameName(c[0].getName())){
			System.out.println("We found another name to match at: " + i);
			i++;
		}
		else{
			i++;
		}
	}

	
	
	}
	

		
	}
