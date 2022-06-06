import pkg.*;
import java.util.Scanner;
import java.util.Random;


class myCharacter{
	public myCharacter(){
	Scanner sc = new Scanner(System.in);
	String input;
	System.out.println("Theese are the base values: Strength: 5 || Dexterity: 5 || Intelligence 5 || Constitution: 5 || Charistma: 5");
	int setStrength = 5;
	int setDexterity = 5;
	int setIntelligence = 5;
	int setConstitution = 5;
	int setCharisma = 5;
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
		System.out.println("You have chosen the dunce class");
		System.out.println("Strength: 0");
		System.out.println("Intelligence: -100");
		System.out.println("Dexterity: 0");
		System.out.println("Charistma: 0");
		System.out.println("Constitution: 0");
		break;
	}
	while (input.equals("Rogue")){
		System.out.println("Strength: 10");
		System.out.println("Intelligence: 5");
		System.out.println("Dexterity: 10");
		System.out.println("Charistma: 0");
		System.out.println("Constitution: 10");
		break;
	}
	while (input.equals("Wizard")){
		System.out.println("Strength: 0");
		System.out.println("Intelligence: 15");
		System.out.println("Dexterity: 0");
		System.out.println("Charistma: 5");
		System.out.println("Constitution: 5");
		break;
	}	
	while (input.equals("Warrior")){
		System.out.println("Strength: 20");
		System.out.println("Intelligence: 0");
		System.out.println("Dexterity: 0");
		System.out.println("Charistma: 0");
		System.out.println("Constitution: 5");
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