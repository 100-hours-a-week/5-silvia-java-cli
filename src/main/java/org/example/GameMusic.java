package org.example;

public class GameMusic {
    private String title;
    private String lyrics;
    private String singer;

    public GameMusic(String title, String lyrics, String singer) {
        this.title = title;
        this.lyrics = lyrics;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public String getLyrics() {
        return lyrics;
    }

    public String getSinger() {
        return singer;
    }
}
