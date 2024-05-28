package org.example.game;

import org.example.music.GameMusic;
import org.example.music.KoreanMusicList;
import org.example.music.PopMusicList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Game {
    private final KoreanMusicList kmusic;
    private final PopMusicList pmusic;
    private int score;
    private final int numberOfGames = 10;
    public static int remainGames;
    public static int remainingAttempts;
    private final HintProvider hintProvider;
    private final GameMusic[] songs;

    public Game(int musicChoice) {
        kmusic = new KoreanMusicList();
        pmusic = new PopMusicList();
        score = 0;
        remainGames = 0;
        remainingAttempts = 3;
        hintProvider = new HintProvider();

        List<GameMusic> songList;
        if (musicChoice == 1) {
            songList = kmusic.getSongs();
        } else if (musicChoice == 2) {
            songList = pmusic.getSongs();
        } else {
            throw new IllegalArgumentException("유효한 숫자를 입력해주세요.");
        }
        songs = songList.toArray(new GameMusic[0]);
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<GameMusic> songList = new ArrayList<>();
        Collections.addAll(songList, songs);
        Collections.shuffle(songList);

        while (remainGames < numberOfGames) {
            GameMusic song = songList.get(remainGames);
            remainGames++;
            hintProvider.reset();

            GameRound gameRound = new GameRound(song, hintProvider, scanner, score);
            Thread gameRoundThread = new Thread(gameRound);
            gameRoundThread.start();

            try {
                gameRoundThread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }

            score = gameRound.getScore();
        }

        System.out.println(" ");
        System.out.println("╔═════════════════════ °• ♔ •° ═════════════════════╗");
        System.out.println("   게임 종료! 최종 점수: " + score);
        printResult();
        System.out.println("╚═════════════════════ °• ♔ •° ═════════════════════╝");
    }

    private void printResult() {
        if (score < 30) {
            System.out.println("   노래를 잘 모르시는군요. 더 열심히 들어보세요!");
        } else if (score < 60) {
            System.out.println("   노래에 대해 좀 알고 계시네요. 더 많은 노래를 들어보세요!");
        } else if (score < 80) {
            System.out.println("   노래에 대해 꽤 많이 알고 계시네요. 훌륭해요!");
        } else {
            System.out.println("   노래 박사시네요! 대단해요!");
        }
    }
}
