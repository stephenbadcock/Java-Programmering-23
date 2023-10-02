package labs.lab1;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        int numberOfRounds = 1, numberOfSides, currentGuess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("- Tärningsspelet -");
        System.out.println("------------------");
        System.out.println();

        System.out.print("Välj hur många omgångar vill du spela: ");
        numberOfRounds = scanner.nextInt();
        
        System.out.print("Välj hur många sidor tärningen ska ha: ");
        numberOfSides = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Skriv in ditt namn: ");
        Player player = new Player(scanner.nextLine());

        player.addDie(numberOfSides);

        //System.out.println("Die sides: " + die.getCurrentValue());
        //System.out.println("Hej " + player.getName() + " score: " + player.getScore());

        for(int i = 1; i <= numberOfRounds; i++) {
            System.out.print("Gissning #" + i + ": ");
            currentGuess = scanner.nextInt();

            player.rollDice();
            System.out.println(player.die.getCurrentValue());

            if(currentGuess == player.die.getCurrentValue()) {
                System.out.println("Korrekt!");
                player.increaseScore();
            }
            
            System.out.println("Poäng: " + player.getScore());
        }

        scanner.close();
    }
}
