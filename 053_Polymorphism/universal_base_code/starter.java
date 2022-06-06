import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Performer [] a = new Performer[4];
		a[0] = new Performer();
		a[1] = new Musician();
		a[2] = new Apprentice();
		a[3] = new Actor();
		
		a[0].Performing();
		a[0].Practicing();
		a[1].Performing();
		((Performer)a[1]).Practicing();
		((Apprentice)a[2]).practiceAtUniversity();
		((Musician)a[2]).playInstrument();
		((Actor)a[3]).monologue();
		((Performer)a[3]).Performing();
		
	}
}