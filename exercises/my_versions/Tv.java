class Tv {
    public double screenSize = 44.5;
    public int prize = 6000;
    public String colour = "White";

    Tv(double screenSize, int prize, String colour) {
        this.screenSize = screenSize;
        this.prize = prize;
        this.colour = colour;
    }

    Tv(double screenSize) {
        this(screenSize, 1000, "white");
    }

    Tv(String colour) {
        this(44.0, 20999, colour);
    }
}