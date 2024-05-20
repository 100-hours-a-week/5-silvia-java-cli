package org.example;

public class ArtistHint extends Musics {
    protected String singer;

    public ArtistHint(String title, String lyrics, String singer) {
        super(title, lyrics);
        this.singer = singer;
    }

    public String getSinger() {
        return singer;
    }
}
