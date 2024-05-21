package org.example.music;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class MusicList {
    protected List<GameMusic> songs;

    public MusicList() {
        songs = new ArrayList<>();
    }

    public List<GameMusic> getSongs() {
        return songs;
    }

    public List<GameMusic> showList() {
        System.out.println(getListName() + " 리스트:");
        int index = 1;
        for (GameMusic song : songs) {
            System.out.println("("+index+")"+" 제목: " + song.getTitle() + ", 가수: " + song.getArtist() + " / 가사: " + song.getLyrics1() + ", " + song.getLyrics2());
            index++;
        }
        return songs;
    }

    public void addMusic(String title, String lyrics1, String lyrics2, String artist) {
        songs.add(new GameMusic(title, lyrics1, lyrics2, artist));
        System.out.println(title + " 노래가 추가되었습니다.");
    }

    public void removeMusic(String title) {
        Iterator<GameMusic> iterator = songs.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            GameMusic song = iterator.next();
            if (song.getTitle().equals(title)) {
                iterator.remove();
                found = true;
                System.out.println(title + " 노래가 삭제되었습니다.");
                break;
            }
        }
        if (!found) {
            System.out.println(title + " 노래를 찾을 수 없습니다.");
        }
    }

    protected abstract String getListName();
}
