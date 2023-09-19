import java.util.Random;

public class ex60 {
    public static void main(String[] args) {
        int rollOne = 0, rollTwo = 1, min = 1, max = 6;
        
        System.out.println("Here comes the dice!\n");

        while (rollOne != rollTwo) {
            Random rand = new Random();

            rollOne = rand.nextInt(max + 1 - min) + min;
            System.out.println("Roll #1: " + rollOne);

            rollTwo = rand.nextInt(max + 1 - min) + min;
            System.out.println("Roll #2: " + rollTwo);

            System.out.println("The total is: " + (rollOne + rollTwo) + "\n");
        }
    }
}
