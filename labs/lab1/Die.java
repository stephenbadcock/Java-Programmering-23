package labs.lab1;

import java.util.Random;

public class Die {
    private int numberOfSides, currentValue, min = 1;
    private Random random = new Random();

    Die(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void roll() {
        currentValue = random.nextInt(numberOfSides + 1 - min) + min;
    }
}
