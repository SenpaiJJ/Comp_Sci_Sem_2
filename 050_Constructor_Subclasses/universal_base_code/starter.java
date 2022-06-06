import pkg.*;
import java.util.Scanner;
import java.util.Random;



class starter extends Musician {
	public static void main(String args[]) {
		String a = "";
		int b = 0;
		String c = "";
		Preformer g = new Preformer();
		Preformer h = new Preformer(b);
		Musician i = new Musician();
		Musician j = new Musician(a);
		Musician k = new Musician(a, c);
		Musician l = new Musician(a, b, c);

		System.out.println(g.getName());
		g.Practicing();
		System.out.println(h.getName());
		h.Preforming();
		System.out.println(i.getName());
		i.Preforming();
		i.playInstrument();
		j.Practicing();
		j.getInstrument();
		
		System.out.println(k.getName());
		k.Practicing();
		k.getInstrument();
		
		System.out.println(l.getName());
		l.Preforming();
		l.playInstrument();
	
	
	}
}
