package org.example;

import java.util.Scanner;

class Game {
    private KoreanMusicList kmusic;
    private int score;
    private int numberOfGames;

    public Game() {
        kmusic = new KoreanMusicList();
        score = 0;
        numberOfGames = 10;  // 게임 횟수 설정
    }

    public void GameChoice() {
        Scanner scanner = new Scanner(System.in);
        String gameChoice = scanner.nextLine();

        switch (gameChoice) {
            case "1":

        }

    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        GameMusic[] songs = kmusic.getSongs();
        int songCount = songs.length;

        for (int i = 0; i < numberOfGames; i++) {
            GameMusic song = songs[i % songCount];
            System.out.println("가사를 보고 노래 제목을 맞춰보세요:");
            System.out.println("\"" + song.getLyrics() + "\"");
            System.out.println("제목을 입력하거나 힌트를 요청하세요 (힌트: hint):");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("hint")) {
                System.out.println("가수: " + song.getSinger());
                System.out.println("제목을 입력하세요:");
                input = scanner.nextLine();
            }

            if (input.equalsIgnoreCase(song.getTitle())) {
                score += 10;
                System.out.println("정답입니다! 현재 점수: " + score);
            } else {
                System.out.println("틀렸습니다. 정답은 " + song.getTitle() + "입니다. 현재 점수: " + score);
            }
        }

        System.out.println("게임 종료! 최종 점수: " + score);
        printResult();
    }

    private void printResult() {
        if (score < 30) {
            System.out.println("노래를 잘 모르시는군요. 더 열심히 들어보세요!");
        } else if (score < 60) {
            System.out.println("노래에 대해 조금 알고 계시네요. 더 많은 노래를 들어보세요!");
        } else if (score < 90) {
            System.out.println("노래에 대해 꽤 많이 알고 계시네요. 훌륭해요!");
        } else {
            System.out.println("노래 박사시네요! 대단해요!");
        }
    }
}
