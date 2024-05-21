package org.example.music;

public class Musics extends MusicTitle {
    protected String lyrics1;
    protected String lyrics2;

    public Musics(String title, String lyrics1, String lyrics2) {
        super(title);
        this.lyrics1 = lyrics1;
        this.lyrics2 = lyrics2;
    }

    public String getLyrics1() {
        return lyrics1;
    }

    public String getLyrics2() {
        return lyrics2;
    }
}
