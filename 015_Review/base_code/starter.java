import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the command window when you compile and run this program.
		//Part 1
	//name
	Scanner Input1 = new Scanner(System.in);
	System.out.println("What your name");
	String name;
	name = Input1.nextLine();
	//username
	System.out.println("Now you shall pick a username such as King of Idiots :)");
	String username;
	username = Input1.nextLine();
	//type of character
String cha;
System.out.println("Now pick a character such as Warrior, Rogue or Wizard.");
cha = Input1.nextLine();
System.out.println("Your character is " + cha);
String wizardd = ("Wizard");
String warriorr = ("Warrior");
String roguee = ("Rogue");
boolean wizard = (cha.equals(wizardd));
boolean warrior = (cha.equals(warriorr));
boolean rogue = (cha.equals(roguee));
if (wizard)
{
System.out.println("You can use magic now. Abracadabra >:)");
}
else if (warrior)
{
System.out.println("You have a sword. Poke Poke ;)");
}
else if (rogue)
{
System.out.println("You have all abilites. Wowwwwww :)");
}
else
{
System.out.println("You have typed an invalid role or you forgot to capitalize. Please rerun program");
}
//upgrading
System.out.println("You can know upgrade your character. You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
//strength
int strength;
System.out.println("Strength upgrading (1-10)");
strength = Input1.nextInt();
if (strength>10)
{
System.out.print("Please input a value less or equal to 10");
System.out.println(" Strength upgrading (1-10)");
strength = Input1.nextInt();
//int s = 25-strength;
//System.out.println("You have " + s + " points left");
}
int s = 25-strength;
System.out.println("You have " + s + " points left");
//dexterity
int dexterity;
System.out.println("Dexterity (1-10)");
dexterity = Input1.nextInt();
if (dexterity>10)
{
System.out.print("Please input a value less or equal to 10");
System.out.println(" Dexterity upgrading (1-10)");
dexterity=Input1.nextInt();
//int d = s-dexterity;
//System.out.println("You have " + d + " points left");
}
int d = s-dexterity;
System.out.println("You have " + d + " points left");
//Intelligence
int intelligence;
System.out.println("Intelligence (1-10)");
intelligence = Input1.nextInt();
if (intelligence>10)
{
System.out.print("Please input a value less or equal to 10");
System.out.println(" Intelligence upgrading (1-10)");
intelligence=Input1.nextInt();
//int i = d-intelligence;
//System.out.println("You have " + i + " points left");
}
int i = d-intelligence;
System.out.println("You have " + i + " points left");
//Constitution
int con;
System.out.println("Constitution (1-10)");
con = Input1.nextInt();
if (con>10)
{
System.out.print("Please input a value less or equal to 10");
System.out.println(" Constitution upgrading (1-10)");
con=Input1.nextInt();
//int c = i-con;
//System.out.println("You have " + c + " points left");
}
int c = i-con;
System.out.println("You have " + c + " points left");
//Charisma
int charisma;
System.out.println("Charisma (1-10)");
charisma = Input1.nextInt();
if (charisma>10)
{
System.out.print("Please input a value less or equal to 10");
System.out.println(" Charisma upgrading (1-10)");
charisma=Input1.nextInt();
//int ch = con-charisma;
//System.out.println("You have " + ch + " points left");
int ch = con-charisma;
System.out.println("You have " + ch + " points left");
}
}
}
