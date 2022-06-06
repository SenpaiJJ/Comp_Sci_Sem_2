package pkg;
import java.util.Scanner;
import java.util.Random;



public class Musician extends Performer{


	public String instrument;
	public Musician(){
		instrument = "Chello";
	}
	public Musician(String instrument){
		this.instrument = instrument;
	}
	public Musician(String instrument, String Name){
		super(Name);
		this.instrument = instrument;
	}
	public Musician(String instrument, int age, String Name){
		super(age, Name);
		this.instrument = instrument;
	}
	public void Practicing(){
		System.out.println(Name + " Is practicing!");
	}
	public void Preforming(){
		System.out.println(Name + " Is performing!");
	}
	public String getInstrument(){
		return instrument;
	}
	public void playInstrument(){
		System.out.println(Name + " Is performing using the " + instrument);
	}


		
}