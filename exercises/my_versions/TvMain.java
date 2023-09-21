public class TvMain {
    public static void main(String[] args) {
        TvStore store = new TvStore();

        store.whiteTv2.screenSize = 20.0;            
        store.whiteTv2.prize = 30;
        store.whiteTv2.colour = "grey";

        Tv greyTv = new Tv();

        greyTv.screenSize = 60.5;
        greyTv.prize = 2000;
        greyTv.colour = "grey";

        Tv blackTv = store.whiteTv2;
        
        System.out.println("Welcome to " + store.storeName);
        System.out.println("Our products:");
        System.out.println("A " + store.whiteTv.colour + " " + store.whiteTv.screenSize + " inch TV for " + store.whiteTv.prize + " kr.");
        System.out.println("A " + store.whiteTv2.colour + " " + store.whiteTv2.screenSize + " inch TV for " + store.whiteTv2.prize + " kr.");
        System.out.println("A " + greyTv.colour + " " + greyTv.screenSize + " inch TV for " + greyTv.prize + " kr.");
        System.out.println("A " + blackTv.colour + " " + blackTv.screenSize + " inch TV for " + blackTv.prize + " kr.");
    }
}


