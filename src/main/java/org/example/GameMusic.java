package org.example;

public class GameMusic extends Musics {
    private String singer;

    public GameMusic(String title, String lyrics1, String lyrics2, String singer) {
        super(title, lyrics1, lyrics2);
        this.singer = singer;
    }

    public String getSinger() {
        return singer;
    }
}
