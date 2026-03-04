import java.util.HashSet;

class Track {
    String title;

    Track(String title) {
        this.title = title;
    }
}

class MusicPlaylist {
    HashSet<Track> tracks;

    MusicPlaylist() {
        tracks = new HashSet<>();
    }

    // добавляет песню в плейлист
    void addTrack(Track track) {
        tracks.add(track);
    }

    // выводит весь плейлист
    void showPlaylist() {
        int idx = 1;
        for(Track t : tracks) {
            System.out.println(idx+". "+t.title);
            idx++;
        }
    }

    // очищает плейлист если повторяются или часто проигрываются
    void clearRepeatedTracks(HashSet<String> repeatedTitles) {
        tracks.removeIf(t -> repeatedTitles.contains(t.title));
    }
}

public class Task5 {
    public static void main(String[] args) {
        MusicPlaylist playlist = new MusicPlaylist();

        playlist.addTrack(new Track("Любовь"));
        playlist.addTrack(new Track("Радость"));
        playlist.addTrack(new Track("Меланхолия"));
        playlist.addTrack(new Track("Ностальгия"));
        playlist.addTrack(new Track("Веселье"));
        playlist.addTrack(new Track("Спокойствие"));
        playlist.addTrack(new Track("Радость"));
        playlist.addTrack(new Track("Меланхолия"));
        playlist.addTrack(new Track("Энергия"));
        playlist.addTrack(new Track("Сон"));

        playlist.showPlaylist();

        HashSet<String> oftenPlayed = new HashSet<>();
        oftenPlayed.add("Радость");
        oftenPlayed.add("Меланхолия");

        playlist.clearRepeatedTracks(oftenPlayed);
        playlist.showPlaylist();
    }
}
