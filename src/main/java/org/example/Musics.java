package org.example;

class Musics {
    protected String title;
    protected String lyrics1;
    protected String lyrics2;

    public Musics(String title, String lyrics1, String lyrics2) {
        this.title = title;
        this.lyrics1 = lyrics1;
        this.lyrics2 = lyrics2;
    }

    public String getTitle() {
        return title;
    }

    public String getLyrics1() {return lyrics1;}

    public String getLyrics2() {return lyrics2;}
}