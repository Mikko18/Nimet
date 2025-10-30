import java.util.Scanner;

public class NameGuessingGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String correctName = "Jeff";
        String guess;

        System.out.println("Guess the name:");
        while (true) {
            guess = in.nextLine();

            if (guess.equalsIgnoreCase(correctName)) {
                System.out.println("Yes! Congratulations!");
                break;
            } else {
                System.out.println("No. Try again:");
 }
        }

        
    }
}

