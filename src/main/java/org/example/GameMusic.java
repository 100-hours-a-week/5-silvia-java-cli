package org.example;

public class GameMusic {
    private String title;
    private String lyrics1;
    private String lyrics2;
    private String singer;

    public GameMusic(String title, String lyrics1, String lyrics2,  String singer) {
        this.title = title;
        this.lyrics1 = lyrics1;
        this.lyrics2 = lyrics2;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public String getLyrics1() {
        return lyrics1;
    }

    public String getLyrics2() {
        return lyrics2;
    }

    public String getSinger() {
        return singer;
    }
}
