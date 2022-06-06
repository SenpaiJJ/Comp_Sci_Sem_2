package pkg;
import java.util.Scanner;
import java.util.Random;



public class Musician extends Preformer{


	public String Instrument;
	public Musician(){
		Instrument = "Chello";
	}
	public Musician(String h){
		Instrument = h;
	}
	public Musician(String h, String t){
		Instrument = h;
		super.Name = t;
	}
	public Musician(String h, int u, String t){
		Instrument = h;
		super.Name = t;
		super.Age = u;
	}
	public void Practicing(){
		System.out.println(Name + " Is practicing!");
	}
	public void Preforming(){
		System.out.println(Name + " Is preforming!");
	}
	public String getInstrument(){
		return Instrument;
	}
	public void playInstrument(){
		System.out.println(Name + " Is preforming using the " + Instrument);
	}


		
}