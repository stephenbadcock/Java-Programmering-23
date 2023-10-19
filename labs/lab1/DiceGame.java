import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        int numberOfRounds, numberOfSides, currentGuess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("╔════════════════════════════╗");
        System.out.println("║   Kast med liten tärning   ║");
        System.out.println("╚════════════════════════════╝");
        System.out.println();
        System.out.println("Försök att gissa tärningens värde.");
        System.out.println();

        do {
            System.out.print("Välj hur många omgångar du vill spela: ");
            numberOfRounds = scanner.nextInt();
        } while (numberOfRounds < 1);
        
        do {
            System.out.print("Välj hur många sidor tärningen ska ha (1-6): ");
            numberOfSides = scanner.nextInt();
            scanner.nextLine();
        } while (numberOfSides < 1 || numberOfSides > 6);
        
        System.out.print("Skriv in ditt namn: ");
        Player player = new Player(scanner.nextLine());
        System.out.println();

        player.addDie(numberOfSides);

        for (int i = 1; i <= numberOfRounds; i++) {
            System.out.println("Kast " + i + " av " + numberOfRounds);
            System.out.println("══════════════");

            do {
                System.out.print("Gissa på ett värde mellan 1 och " + numberOfSides + ": ");
                currentGuess = scanner.nextInt();
            } while (currentGuess < 1 || currentGuess > numberOfSides);
            System.out.println();

            player.rollDice();

            if (currentGuess == player.getDieValue()) {
                System.out.println("Du gissade rätt, " + player.getName() + "!");
                player.setScore();
            } else {
                System.out.println("Du gissade fel, " + player.getName() + ".");
            }          
            System.out.println();

            if (i != numberOfRounds) {
                System.out.println("Dina poäng: " + player.getScore());
                System.out.println();
            }
        }

        player.evaluateScore(numberOfRounds);

        scanner.close();
    }
}
