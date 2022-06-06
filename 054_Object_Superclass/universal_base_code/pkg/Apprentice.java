package pkg;
import java.util.Scanner;
import java.util.Random;



public class Apprentice extends Musician{
	public String School;
	public int yearsOfExperience;
	public Apprentice(){
		School = "CVHS";
		yearsOfExperience = 0;
		instrument = "Trumpet";
	}
	public Apprentice(String School, int yearsOfExperience){
		this.School = School;
		this.yearsOfExperience = yearsOfExperience;
	}
	public Apprentice(String School, String instrument, int yearsOfExperience){
		super(instrument);
		this.School = School;
		this.yearsOfExperience = yearsOfExperience;
	}
	public Apprentice(String Name, int age, String School, String instrument, int yearsOfExperience){
		this.instrument = instrument;
		this.School = School;
		this.yearsOfExperience = yearsOfExperience;
	}
	public void Practicing(){
		System.out.println(Name + " Has been practising for " + yearsOfExperience + " Years.");
	}
	public void Preforming(){
		System.out.println(Name + " Has been performing for " + yearsOfExperience + " Years.");
	}
	public String getInstrument(){
		return instrument;
	}
	public void playInstrument(){
		System.out.println(Name + " Is performing using the " + instrument);
	}
	public void practiceAtUniversity(){
		System.out.println(Name + " Is practicing at the school : " + School);
	}

	

		
}