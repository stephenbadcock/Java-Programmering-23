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
        
        do {
            System.out.print("Välj hur många sidor tärningen ska ha (1-6): ");
            numberOfSides = scanner.nextInt();
            scanner.nextLine();
        } while (numberOfSides < 1 || numberOfSides > 6);
        
        System.out.print("Skriv in ditt namn: ");
        Player player = new Player(scanner.nextLine());
        System.out.println();

        player.addDie(numberOfSides);

        for(int i = 1; i <= numberOfRounds; i++) {
            System.out.println("Kast #" + i);
            System.out.println("==========");
            System.out.print("Gissa på ett värde mellan 1 och " + numberOfSides + ": ");
            currentGuess = scanner.nextInt();
            System.out.println();

            System.out.println("Tärningen kastas...");
            try {
                Thread.sleep(500);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            player.rollDice();
            System.out.println(player.getDieValue());

            if(currentGuess == player.getDieValue()) {
                System.out.println("Korrekt!");
                player.setScore();
            } else {
                System.out.println("Fel!");
            }
            
            System.out.println();
            System.out.println("Dina poäng: " + player.getScore());
            System.out.println();
        }

        System.out.println("Du gissade rätt på " + player.getScore() + " av " + numberOfRounds + " kast. Snyggt jobbat, " + player.getName());

        scanner.close();
    }
}
