import java.util.Scanner;
import java.util.Random;

class starter {

    private static boolean j;
    private static int[] array;


    public static void main(String args[]) {
        j = false;
        array = new int[20];
        egg();
        meal();
        sausage();
        McMuffin();

    }
    public static void egg() {
        int e = 0;
        Random rand = new Random();
        while(e < array.length) {
            array[e] = rand.nextInt(10);
            e++;
        }
    }
    public static void meal() {
        int f = 0;
        while(f < array.length) {
            System.out.print(array[f] + " ");
            f++;
        }
    }
    public static void sausage() {
        Random rand = new Random();
        int f = rand.nextInt(10);
        int d = 0;
        while(d < array.length-1) {
            if(array[d] == array[d + 1]) {
                j = true;
                System.out.println("There are two consecutive numbers in order. They are at " + d + " and " + (d + 1));
                System.out.println("The values of the consecutive numbers are " + array[d]);
                break;
            }
            d++;
        }
    }
    public static void McMuffin() {
        Random rand = new Random();
        int g = rand.nextInt(10);
        System.out.println("Target number is " + g);
        System.out.println("Now I shall look for duplicates of " + g);
        int d = 0;
        while(d < array.length) {
            if(array[d] == g) {
                System.out.println("Index " + d + " is a duplicate");
            }
            d++;
        }
    }
}