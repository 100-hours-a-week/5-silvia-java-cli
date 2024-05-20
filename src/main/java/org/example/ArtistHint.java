package org.example;

public class ArtistHint extends Musics {
    protected String singer;

    public ArtistHint(String title, String lyrics1, String lyrics2, String singer) {
        super(title, lyrics1, lyrics2);
        this.singer = singer;
    }

    public String getSinger() {
        return singer;
    }
}
