public class MusicApp {
    public static void main(String[] args) {
        Song[] mySongs = {new Song("In Camera", "Yumi Zouma", 204), new Song("Raisans", "Dinosaur Jr.", 230), new Song("Velvet Alley", "Strung Out", 182)};

        Playlist myPlaylist = new Playlist(mySongs);

        myPlaylist.printPlaylist();

        System.out.println("Total längd: " + myPlaylist.displayPlaylistDuration() + " min");
        
    }
}
