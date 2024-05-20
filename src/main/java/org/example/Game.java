package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Game {
    private KoreanMusicList kmusic;
    private PopMusicList pmusic;
    private int score;
    private int numberOfGames;
    private GameMusic[] songs;

    public Game(int musicChoice) {
        kmusic = new KoreanMusicList();
        pmusic = new PopMusicList();
        score = 0;
        numberOfGames = 10;

        if (musicChoice == 1) {
            songs = kmusic.getSongs();
        } else if (musicChoice == 2) {
            songs = pmusic.getSongs();
        } else {
            throw new IllegalArgumentException("Invalid music choice");
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<GameMusic> songList = new ArrayList<>();

        Collections.addAll(songList, songs);
        Collections.shuffle(songList);

        for (int i = 0; i < numberOfGames; i++) {
            GameMusic song = songList.get(i);
            System.out.println("¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪");
            System.out.println("가사를 보고 노래 제목을 맞춰보세요:");
            System.out.println("\"" + song.getLyrics1() + "\"");
            System.out.print("제목을 입력하거나 힌트를 요청하세요 (힌트: hint): ");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("hint")) {
                boolean validHint = false;
                while (!validHint) {
                    System.out.println("1. 다음 가사, 2. 가수");
                    System.out.print("어떤 힌트를 보시겠습니까?: ");
                    String hintChoice = scanner.nextLine();
                    switch (hintChoice) {
                        case "1":
                            System.out.println("다음 가사: " + song.getLyrics2());
                            validHint = true;
                            break;
                        case "2":
                            System.out.println("가수: " + song.getSinger());
                            validHint = true;
                            break;
                        default:
                            System.out.println("올바른 번호를 입력해주세요.");
                            break;
                    }
                }
                System.out.print("노래 제목을 입력하세요: ");
                input = scanner.nextLine();
            }

            if (input.equalsIgnoreCase(song.getTitle())) {
                score += 10;
                System.out.println("정답입니다! 현재 점수: " + score);
            } else {
                System.out.println("틀렸습니다. 정답은 " + song.getTitle() + "입니다. 현재 점수: " + score + "\n");
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
