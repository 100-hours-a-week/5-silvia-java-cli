package org.example;

class Musics {
    protected String title;
    protected String lyrics;

    public Musics(String title, String lyrics) {
        this.title = title;
        this.lyrics = lyrics;
    }

    public String getTitle() {
        return title;
    }

    public String getLyrics() {
        return lyrics;
    }
}