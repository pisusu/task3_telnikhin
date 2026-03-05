package Task5;

import java.util.HashSet;

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
