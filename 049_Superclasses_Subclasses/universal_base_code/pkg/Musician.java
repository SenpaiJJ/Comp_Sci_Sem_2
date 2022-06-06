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