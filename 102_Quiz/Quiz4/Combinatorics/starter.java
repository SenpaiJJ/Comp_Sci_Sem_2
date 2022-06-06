import pkg.*;
import java.util.Scanner;
import java.util.Random;
public class Combinatorics{
	
	public static int factorial(int n){
		int fact = 1;
		if(n==1){
			return 1;
		}
		else{
			for ( x = 1; x < (n+ 1); x++){
			fact = fact * x;
			return fact;
			}
	}
class starter {
	public static void numCombinations(int n, int r){
		int numCombos;
		if (r > n){
			numCombos = 0;
		}
		if (r < n){
			int numCombos = (factorial(n)/(factorial(r)+(factorial(n-r))));
			System.out.println("There are " + x + " Ways of finding " + r);
	}
		
}
