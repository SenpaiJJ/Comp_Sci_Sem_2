import java.util.Scanner;
import java.util.Random;

class starter {
    public static void main(String args[]) {
        // the string "I love to learn coding remotely." will appear in
        // the command window when you compile and run this program.
        int c = 0;
        int y[] = new int[20];
        System.out.println("forward version:");
        while(true) {
            Random rand = new Random ();
            y[c] = rand.nextInt(50);
            if (c < 19) {
                System.out.print(y[c] + ", ");
            }
            else {
                System.out.println(y[c]);
            }
            c = c + 1;
            if (c == 20) {
                break;
            }
        }
        System.out.println("");
        System.out.println("backward version now:");
        for (c = y.length - 1; c >= 0; c--) {
            if (c > 0) {
                System.out.print(y[c] + ", ");
            }
            else {
                System.out.println(y[c]);
            }
        }
    }
}