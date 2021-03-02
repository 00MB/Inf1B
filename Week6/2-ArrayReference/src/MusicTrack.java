public class MusicTrack {

    String trackartist;
    String tracktitle;
    public MusicTrack(String artist, String title) {
        trackartist = artist;
        tracktitle = title;
    }

    public String getArtist() {
        return trackartist;
    }

    public String getTitle() {
        return tracktitle;
    }

    public String toString() {
        return tracktitle+" | "+trackartist;
    }
}
