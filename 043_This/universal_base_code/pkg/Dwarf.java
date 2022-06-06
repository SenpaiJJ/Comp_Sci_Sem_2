package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dwarf{
	int age;
	String name;
	public Dwarf(){
		age = 0;
		name = "";
	}
	public Dwarf(String name, int age){ 
	
		this.age = 0;
		this.name = "";
		
	}
	public boolean isSameName(String name){
		while(true){
			if(this.name.equals(name)){
				return true;
			}
			else{
				return false;
			}
		}
	}
	
	public void setName(String a){
		name = a;
	}
	public String getName(){
		return name;
	}
	public void setAge(int b){
		age = b;
	}
	public int getAge(){
		return age;
	}
	
}
