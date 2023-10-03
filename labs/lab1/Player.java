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
        increaseScore();
    }

    public int getScore() {
        return score;
    }

    public void rollDice() {
        die.roll();
    }

    public int getDieValue() {
        return die.getCurrentValue();
    }

    public void increaseScore() {
        score++;
    }

    public void addDie(int numberOfSides) {
        die = new Die(numberOfSides);
    }

    public void evaluateScore(int numberOfRounds) {
        double hitRate = ((double) score / numberOfRounds) * 100;
        System.out.println(hitRate);
        int hitRateRounded = (int) Math.round(hitRate);
        System.out.println(hitRateRounded);

        System.out.print("Du gissade rätt på " + score + " av " + numberOfRounds + " kast (" + hitRateRounded + "%). ");

        if(hitRateRounded == 0) {
            if(numberOfRounds > 4) {
                System.out.println("Det där var kasst! Jag hoppas att du har andra talanger, " + name + ".");
            } else {
                System.out.println("Otur, " + name + ". Testa gärna igen.");
            }
        } else if (hitRateRounded > 0 && hitRateRounded < 25) {
            System.out.println("Det gick inget vidare, " + name + "...");
        } else if (hitRateRounded < 50) {
            System.out.println("Det gick sådär, " + name + ".");
        } else if (hitRateRounded < 75) {
            System.out.println("Bra jobbat, " + name + "!");
        } else if (hitRateRounded < 100) {
            System.out.println("Snyggt gissat, " + name + "!");
        } else if (hitRateRounded == 100) {
            if(numberOfRounds > 4) {
                System.out.println("Jag hade lämnat in en lottorad om jag var du, " + name + ".");
            } else {
                System.out.println("Du kan vara synsk, " + name + ", men jag vill se dig gissa ett par gånger till...");
            }
        }  
    }
}
