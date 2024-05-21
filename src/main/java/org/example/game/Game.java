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
    private int remainGames;
    private int remainingAttempts;
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

        for (int i = 0; i < numberOfGames; i++) {
            GameMusic song = songList.get(i);
            remainingAttempts = 3;
            remainGames++;
            hintProvider.reset();

            System.out.println("¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪");
            System.out.println("(" + remainGames + "/10) 가사를 보고 노래 제목을 맞춰보세요:");
            System.out.println("\"" + song.getLyrics1() + "\"");

            boolean songAnswered = false;
            while (!songAnswered && remainingAttempts > 0) {
                String input = promptUser(scanner);

                if (input.equalsIgnoreCase("hint")) {
                    hintProvider.provideHint(scanner, song);
                    input = promptUser(scanner);
                } else if (input.equalsIgnoreCase("pass")) {
                    System.out.println("❌ 땡~! 정답은 〘" + song.getTitle() + "〙 입니다! 현재 점수: " + score);
                    break;
                }

                if (input.equalsIgnoreCase(song.getTitle())) {
                    score += 10;
                    System.out.println("⭕️ 정답입니다! 현재 점수: " + score);
                    songAnswered = true;
                } else {
                    remainingAttempts--;
                    if (remainingAttempts > 0) {
                        System.out.println("땡~! (남은 기회: " + remainingAttempts + ")");
                    } else {
                        System.out.println("❌ 정답은 〘" + song.getTitle() + "〙 입니다! 현재 점수: " + score);
                    }
                }
            }
        }

        System.out.println("╔═════════════════════ °• ♔ •° ═════════════════════╗");
        System.out.println("   게임 종료! 최종 점수: " + score);
        printResult();
        System.out.println("╚═════════════════════ °• ♔ •° ═════════════════════╝");
    }

    private String promptUser(Scanner scanner) {
        if (hintProvider.canProvideHint()) {
            System.out.print("제목을 입력하거나 힌트를 요청하세요 (힌트: hint, 패스: pass): ");
        } else {
            System.out.print("제목을 입력하거나 패스를 요청하세요 (패스: pass): ");
        }
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("pass")) {
            remainingAttempts = 0; // Set remaining attempts to 0 to force break the while loop in play method
        }
        return input;
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
