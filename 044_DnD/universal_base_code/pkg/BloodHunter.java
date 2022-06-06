package pkg;
import java.util.Scanner;
import java.util.Random;


public class BloodHunter {
	int Health = 0;
	int Attack = 0;
	String Name = "";
	
	public BloodHunter(){
		Random rand = new Random();
		Health = rand.nextInt(15) + 1;
		Attack = rand.nextInt(15) + 1;
		Name = "Rodius";
	}
	public void SetHealth(int a){
		Health = a;
	}
	public int GetHealth(){
		return Health;
	}
	public void SetAttack(int b){
		Attack = b;
	}
	public int GetAttack(){
		return Attack;
	}
}