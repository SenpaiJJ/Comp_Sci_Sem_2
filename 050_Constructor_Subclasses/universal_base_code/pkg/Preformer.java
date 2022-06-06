package pkg;
import java.util.Scanner;
import java.util.Random;



public class Preformer{

	public String Name;
	public int Age;
	public Preformer(){
		Name = "Doja Cat";
		Age = 26;
	}
	public Preformer(int b){
		Name = "Doja Cat";
		Age = b;
	}
	public Preformer(String a){
		Name = a;
		Age = 26;
	}
	public Preformer(String a, int b){
		Name = a;
		Age = b;
	}
	public String getName(){
		return Name;
	}
	public void Practicing(){
		System.out.println(Name + " Is practicing!");
	}
	public void Preforming(){
		System.out.println(Name + " Is preforming!");
	}
	


}
