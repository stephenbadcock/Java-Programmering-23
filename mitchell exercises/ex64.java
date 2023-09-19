import java.util.Scanner;
import java.util.Random;

public class ex64 {
    public static void main(String[] args) {
        int correctNumber, min = 1, max = 10, yourGuess, guessCount = 0;
        boolean yourCorrect = false;

        Random rand = new Random();

        correctNumber = rand.nextInt(max + 1 - min) + min;

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.\n");

        Scanner sc = new Scanner(System.in);

        while (yourCorrect == false) {
            System.out.print("Your guess: ");
            yourGuess = sc.nextInt();

            guessCount++;

            if (yourGuess != correctNumber) {
                System.out.println("That is incorrect. Guess again.");
            } else {
                System.out.println("That's right! You're a good guesser.");

                yourCorrect = true;
            }
        }

        sc.close();

        System.out.println("It only took you " + guessCount + " tries.");
    }
}
