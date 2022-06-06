import pkg.*;
import java.util.Scanner;
import java.util.Random;

public class CombinedTable{
	int TotalSeats = 0;
	double Deserability = 0.0;
	boolean SeatGuests
	
	public CombinedTable(){
		TotalSeats = 0;
		Deserability = 0.0
		
	}
	public CombinedTable(SingleTable a, SingleTable b){
		TotalSeats - (a.getNumSeats() + b.getNumSeats() - 2);
		if (a.getHeight() == b.getHeight()){
			Deserability - ((a.getViewQuality + b.getViewQuality())/2);
		}
		else {
			Deserability = (((a.getViewQuality() + b.getViewQuality())/2) - 10);
		}
	}
}















class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();


		
	}
}
