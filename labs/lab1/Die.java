import java.util.Random;

public class Die {
    private int numberOfSides, currentValue;
    private Random random;

    public Die(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void roll() {
        random = new Random();

        currentValue = random.nextInt(numberOfSides) + 1;

        System.out.println();

        if (currentValue == 1) {
            System.out.println("█████████");
            System.out.println("█████████");
            System.out.println("████ ████");
            System.out.println("█████████");
            System.out.println("█████████");
        } else if (currentValue == 2) {
            System.out.println("█████████");
            System.out.println("██████ ██");
            System.out.println("█████████");
            System.out.println("██ ██████");
            System.out.println("█████████");
        } else if (currentValue == 3) {
            System.out.println("█████████");
            System.out.println("██ ██████");
            System.out.println("████ ████");
            System.out.println("██████ ██");
            System.out.println("█████████");
        } else if (currentValue == 4) {
            System.out.println("█████████");
            System.out.println("██ ███ ██");
            System.out.println("█████████");
            System.out.println("██ ███ ██");
            System.out.println("█████████");
        } else if (currentValue == 5) {
            System.out.println("█████████");
            System.out.println("██ ███ ██");
            System.out.println("████ ████");
            System.out.println("██ ███ ██");
            System.out.println("█████████");
        } else if (currentValue == 6) {
            System.out.println("█████████");
            System.out.println("██ █ █ ██");
            System.out.println("█████████");
            System.out.println("██ █ █ ██");
            System.out.println("█████████");
        }

        System.out.println();
    }
}
