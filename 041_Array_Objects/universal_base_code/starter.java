import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("The Wizards and the Warriors will be battleing.");
	int b = 0;
	int a = 0;
	Warrior[]c= new Warrior[100];
	Wizard[]d = new Wizard[100];
	c[a] = new Warrior("Mikey");
	d[b] = new Wizard ("John");
	int i = 0;
	while (true){
		if (i < 100){
			c[i] = new Warrior("Mikey");
			d[i] = new Wizard("John");
			i++;
		}
		else{
			System.out.println("All of the Wizards and Warriors are ready to Battle!");
			break;
			
		}
		
	}
	while(true){
		d[b].attack(c[a]);
		
		if (c[a].isDead()){
			a++;
		}
		if (c[99].isDead()){
			System.out.println("The Wizards have won.");
			System.out.println((99 - b) + " Wizard are left remaining.");
			break;
		}
		
		
		c[a].attack(d[b]);
		
		if(d[b].isDead()){
			b++;
		}
		if (d[99].isDead()){
			System.out.println("The Warriors have won.");
			System.out.println((99 - a) + " Warriors are left remaining.");
			break;
		}
	}
	}
}
