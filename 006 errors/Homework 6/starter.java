import java.util.Scanner;
import java.util.Random;

class starter {
    public static boolean checkPrime(int a) {
        int counter = 1;
        int counter2 = 0;
        while(counter<=a) {
            if(a%counter == 0){
                counter2++;
            }
            counter++;
        }
        if(counter2 == 2){
            return true;
        }
        return false;
    }
    public static void printNames(int b){
        int counter = 0;
        while(counter <= b){
            if(checkPrime(counter)){
                System.out.println(counter);
            }
            counter++;
        }
    }

    public static void main(String args[]) {
        // the string "I love to learn coding remotely." will appear in
        // the command window when you compile and run this program.
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number and we'll print out every prime until that number:");
        int input = sc.nextInt();
        printNames(input);
    }