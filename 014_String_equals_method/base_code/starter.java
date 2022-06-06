import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	System.out.println("You will be choosing from the warrior class, the warrior class, and the rouge class.");
	Scanner Input = new Scanner(System.in);
	String Wizard1 = ("Wizard");
	String Warrior1 = ("Warrior");
	String Rogue1 = ("Rogue");
	System.out.println("please choose between classes");
	String Inp;
	Inp = Input.nextLine();
	
	boolean wiz = (Inp.equals(Wizard1));
	boolean war = (Inp.equals(Warrior1));
	boolean rog = (Inp.equals(Rogue1));
	
	
	if (wiz)
	{
		System.out.println("You can shoot shit out ya hands blud");
	}
	
	
	else if (war)
	{
		System.out.println("You gota sword on ya? you gon need it");

	}

	else if (rog)
	{
		System.out.println("You crazy man!");
	}
	else 
	{
		System.out.println("Dat aint right, try again big man.");
	}

	}
}
