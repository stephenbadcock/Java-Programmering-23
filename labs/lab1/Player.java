package labs.lab1;

public class Player {
    private String name;
    private int score = 0;
    public Die die;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScore() {
    }

    public int getScore() {
        return score;
    }

    public void rollDice() {
        die.roll();
    }

    public void increaseScore() {
        score++;
    }

    public void addDie(int numberOfSides) {
        die = new Die(numberOfSides);
    }
}
