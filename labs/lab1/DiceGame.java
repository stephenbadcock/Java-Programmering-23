package labs.lab1;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("- Tärningsspelet -");
        System.out.println("------------------");
        System.out.println();

        // System.out.print("Välj hur många omgångar vill du spela: ");
        // scanner.nextInt();
        
        System.out.print("Välj hur många sidor tärningen ska ha: ");
        Die die = new Die(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Skriv in ditt namn: ");
        Player player = new Player(scanner.nextLine());

        System.out.println("Die sides: " + die.getCurrentValue());
        System.out.println("Hej " + player.getName() + " score: " + player.getScore());

        scanner.close();
    }
}
