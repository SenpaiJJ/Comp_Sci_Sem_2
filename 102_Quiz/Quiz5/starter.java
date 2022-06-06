import pkg.*;
import java.util.Scanner;
import java.util.Random;


public class BatteryCharger{
	private int[] rateTable;
	private int getChargingCost(int startHour, int chargeTime){
		int [] hours = new int [24];
		int lastHourOfCharge = startHour + chargeTime;
		hours[0] = 50;
		hours[1] = 60;
		hours[2] = 160;
		hours[3] = 60;
		hours[4] = 80;
		hours[5] = 100;
		hours[6] = 100;
		hours[7] = 120;
		hours[8] = 150;
		hours[9] = 150;
		hours[10] = 150;
		hours[11] = 200;
		hours[12] = 40;
		hours[13] = 240;
		hours[14] = 220;
		hours[15] = 220;
		hours[16] = 200;
		hours[17] = 200;
		hours[18] = 180;
		hours[19] = 180;
		hours[20] = 140;
		hours[21] = 100;
		hours[22] = 80;
		hours[23] = 60;
		System.out.println("You have chosen to start at " + startHour);
		System.out.println("You will need to charge for " + chargeTime + " Hours");
		while(true){
			if (startHour + chargeTime = lastHourOfCharge){
				System.out.println("Your total charge time was " + chargeTime);
			}
		}
		System.out.println("Your rate started at " + hours[startHour] + " And ended at " + hours[lastHourOfCharge]);
	}
	public int getChargeStartTime(int chargeTime){
			
	}
		
		
		
}
