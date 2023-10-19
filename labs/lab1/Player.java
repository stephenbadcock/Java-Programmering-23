public class Player {
    private String name;
    private int score = 0;
    private Die die;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScore() {
        increaseScore();
    }

    public int getScore() {
        return score;
    }

    public void rollDice() {
        System.out.println("Tärningen kastas...");
        System.out.println();
        
        try {
            Thread.sleep(600);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        die.roll();
    }

    public int getDieValue() {
        return die.getCurrentValue();
    }

    private void increaseScore() {
        score++;
    }

    public void addDie(int numberOfSides) {
        die = new Die(numberOfSides);
    }

    public void evaluateScore(int numberOfRounds) {
        double hitRate = ((double) score / numberOfRounds) * 100;
        int hitRateRounded = (int) Math.round(hitRate);

        System.out.print("Du gissade rätt på " + score + " av " + numberOfRounds + " kast (" + hitRateRounded + "%). ");

        if (hitRateRounded == 0) {
            if (numberOfRounds > 6) {
                System.out.println("Det där var kasst! Jag hoppas att du har andra talanger, " + name + ".");
            } else {
                System.out.println("Otur, " + name + ". Testa gärna igen.");
            }
        } else if (hitRateRounded < 25) {
            System.out.println("Det gick inget vidare, " + name + "...");
        } else if (hitRateRounded < 50) {
            System.out.println("Hyfsat försök, " + name + "!");
        } else if (hitRateRounded < 75) {
            System.out.println("Bra jobbat, " + name + "!");
        } else if (hitRateRounded < 100) {
            System.out.println("Snyggt gissat, " + name + "!");
        } else if (hitRateRounded == 100) {
            if (die.getNumberOfSides() == 1) {
                System.out.println("Kom igen, " + name + ". Du valde en ensidig tärning...");
            } else {
                if (numberOfRounds > 3) {
                    System.out.println("Jag hade lämnat in en lottorad om jag var du, " + name + ".");
                } else {
                    System.out.println("Du kan vara synsk, " + name + ", men jag vill se dig gissa ett par gånger till...");
                }
            }
        }
    }
}
