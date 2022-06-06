import pkg.*;
import java.util.Scanner;
import java.util.Random;


class myCharacter{
	public myCharacter(){
	Scanner sc = new Scanner(System.in);
	String input;
	System.out.println("please CHoose Warrior, Wizard, or Rogue");
	input = sc.nextLine();
	while (true){
		if (input.equals("Wizard"))
		System.out.println("You chose the muncha with da wand");
		
		else if (input.equals("Rogue"))
		System.out.println("YOu gonna be swingin sowrds for awhile cause you a rogue");
		
		else if (input.equals("Warrior"))
		System.out.println("I guess you som type of barbarian or something.");
		
		else
		System.out.println("THAT AINT RIGHT");
		break;
	}
}
}






class starter {
	public static void main(String args[]) {
		// Your code goes below here
	myCharacter test = new myCharacter();
	
		
	}
}
