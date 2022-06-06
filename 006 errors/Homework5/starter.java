import java.util.Scanner;
import java.util.Random;

class starter {
    public static void main(String args[]) {
        // the string "I love to learn coding remotely." will appear in
        // the command window when you compile and run this program.
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Slot Machine Rules:");
        System.out.println("Each player starts with $100.");
        System.out.println("Input a wager less than your total amount of money.");
        System.out.println("The slot machine will roll 3 numbers from 1 to 10.");
        System.out.println("a. If two numbers match, you double your money.");
        System.out.println("b. If three numbers match, you triple your money.");
        System.out.println("c. If none match, you lose your money.");
        System.out.println("Do you want to play(Yes)");
        System.out.println("If not type (No)");
        String input1;
        input1 = sc.nextLine();
        while(true) {
                if ((input1).equals("Yes")) {
                    System.out.println("You have $100. How much would you like to wager");
                    break;
                    }
                else {
                    System.out.println("NAh brodie you didnt input what i was sayin");
                    break;
                    }
        
        String input2;
        input2 = sc.nextLine();
            
            
            
            
            
            
            
            
            
            
        }
    }
}
