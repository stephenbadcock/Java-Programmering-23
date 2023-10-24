public class Playlist {
    private Song[] mySongs;

    public Playlist(Song[] mySongs) {
        this.mySongs = mySongs;
    }

    public double displayPlaylistDuration() {
        int playlistDurationSeconds = 0;
        double rest;
        double playlistDuration;

        for (Song song : mySongs) {
            playlistDurationSeconds += song.getLength();
        }

        playlistDuration = playlistDurationSeconds / 60;
        rest = (playlistDurationSeconds % 60) / 100.0;
        playlistDuration = playlistDuration + rest;

        return playlistDuration;
    }

    public void printPlaylist() {
        System.out.println("Din spellista:");
        System.out.println();

        for (Song song : mySongs) {
            double songDuration =song.getLength() / 60;
            double rest = (song.getLength() % 60) / 100.0;
            songDuration = songDuration + rest;

            System.out.println(song.getArtist() + " - " + song.getTitle() + " " + songDuration);
            System.out.println();
        }
    }
    
}
