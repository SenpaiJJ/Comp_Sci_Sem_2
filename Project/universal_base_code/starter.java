import pkg.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


class starter {
	public static void main(String args[]) throws FileNotFoundException {
        File text = new File("./wordle.txt");		
        Random rand = new Random();
        Scanner sc = new Scanner(text);
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        ArrayList<String> arr = new ArrayList<String>();
        while(sc.hasNextLine()){	
            String line = sc.nextLine();
            arr.add(line);
            i++;
        }      
		String Answer;
		System.out.println(" Would you Like to play wordle?");
		System.out.println("Type 'YEA' if you would you like to play");
		Answer = scanner.nextLine();
		if (Answer.equals("YEA")){
		    System.out.println("Great :)");
		}
		else{
		    System.out.println("Well, sorry to see you go, but oh well :(");
		    return;
		}
		int lineNumber = rand.nextInt(2499);
		String Guess;
		String WordleAnswer;
		WordleAnswer = arr.get(lineNumber);
        System.out.println("Lets begin");
        Guess = scanner.nextLine();
        if (!arr.contains(Guess)){
            System.out.println("Your word is not in the dictionary as a 5 letter word.");
            return;
        }
        
        while(true){
                // if(WordleAnswer(i).equals(Guess(i))){
                //     System.out.println("Your guess of: " + Guess(i) + "is in the correct spot");
                // }
                // else{
                //     System.out.println("Your guess of: " + Guess(i) + "is in the correct, but in the wrong spot");
                // }
            }
        }
	}
}
