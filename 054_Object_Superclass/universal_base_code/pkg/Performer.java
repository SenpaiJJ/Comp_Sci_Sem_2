package pkg;
import java.util.Scanner;
import java.util.Random;



public class Performer{

	public String Name;
	public int age;
	public Performer(){
		Name = "Doja Cat";
		age = 26;
	}
	public void toString (Object z){
		System.out.println(age);
		System.out.println(Name);
	}
	public Performer(int age){
		Name = "Doja Cat";
		this.age = age;
	}
	public Performer(String Name){
		this.Name = Name;
		age = 26;
	}
	public Performer(int age, String Name){
		this.Name = Name;
		this.age = age;
	}
	public String getName(){
		return Name;
	}
	public void Practicing(){
		System.out.println(Name + " Is practicing!");
	}
	public void Performing(){
		System.out.println(Name + " Is performing!");
	}
	


}
