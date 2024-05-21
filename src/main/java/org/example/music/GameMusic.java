package org.example.music;

public class GameMusic extends Musics {
    private String artist;

    public GameMusic(String title, String lyrics1, String lyrics2, String artist) {
        super(title, lyrics1, lyrics2);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }
}