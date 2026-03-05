package Task5;

import java.util.HashSet;

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
