import java.util.Scanner;
import java.util.Random;

class starter {
    public static void main(String args[]) {
        // the string "I love to learn coding remotely." will appear in
        // the command window when you compile and run this program.
        Scanner ask = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Slot Machine Rules:");
        System.out.println("Each player starts with $100.");
        System.out.println("Input a wager less than your total amount of money.");
        System.out.println("The slot machine will roll 3 numbers from 1 to 10.");
        System.out.println("a. If two numbers match, you double your money.");
        System.out.println("b. If three numbers match, you triple your money.");
        System.out.println("c. If none match, you lose your money.");
        System.out.println("Do you want to play(Yes/yes/Y/y)");
        System.out.println("If not type (No/no/N/n)");
        String yes;
        yes = ask.nextLine();
        while(true) {
                if ((yes=="Yes") || (yes=="yes") || (yes=="Y") || (yes=="y")) {
                System.out.println("You have $100. How much would you like to wager");
                int wager;
                wager = ask.nextInt();
                if ((100>=wager) || (wager>0)) {
                    break;
                }
            }
            int one = rand.nextInt(10);
            int two = rand.nextInt(10);
            int three = rand.nextInt(10);
            int wager = ask.nextInt();
            int sum = wager*3;
            int summ = wager*2;
            int money = 100;
            int lost = money-wager;
            if ((one==two) && (one==three)) {
                System.out.println("You now have " + sum);
            }
            else if ((one==two) && (one==three) || (two==one) && (two==three) || (three==one) && (three==two)) {
                System.out.println("You now have " + summ);
            }
            else {
                System.out.println("Oof you lost, you now have " + lost);
            }
        }
        else if ((yes=="No") || (yes=="no") || (yes=="N") || (yes=="n")) {
            System.out.println("Okie play next timee");
        }
        else {
            System.out.println("Invalid repsonse");
        }
        
    }
}