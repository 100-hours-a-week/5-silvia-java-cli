package org.example.game;

import org.example.music.GameMusic;

import javax.swing.*;
import java.util.Scanner;

public class GameRound implements Runnable {
    private final GameMusic song;
    private final HintProvider hintProvider;
    private final Scanner scanner;
    private final Object lock = new Object();
    private int score;
    private int remainingAttempts;
    private TimerThread timerThread;
    private InputThread inputThread;
    private boolean ispassed;
    private volatile boolean songAnswered;

    public GameRound(GameMusic song, HintProvider hintProvider, Scanner scanner, int score) {
        this.song = song;
        this.hintProvider = hintProvider;
        this.scanner = scanner;
        this.score = score;
        this.remainingAttempts = 3;
    }

    @Override
    public void run() {
        System.out.println("¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪");
        System.out.println("(" + Game.remainGames + "/10) 가사를 보고 노래 제목을 맞춰보세요:");
        System.out.println("🎵 \"" + song.getLyrics1() + "\"");

        songAnswered = false;
        ispassed = false;

        // 타이머 시작 (20초로 설정)
        timerThread = new TimerThread(20, lock);
        timerThread.start();

        // 입력 스레드 시작
        inputThread = new InputThread();
        inputThread.start();

        try {
            timerThread.join();
            inputThread.interrupt();
            inputThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        if (!songAnswered && !timerThread.isRunning() && !ispassed) {
            System.out.println("\n❌ 타이머 종료! 정답: 〘\"" + song.getTitle() + "\"〙. 현재 점수: " + score);
        }
    }

    public int getScore() {
        return score;
    }

    private class InputThread extends Thread {
        @Override
        public void run() {
            while (!songAnswered && remainingAttempts > 0 && timerThread.isRunning()) {
                String input = JOptionPane.showInputDialog(null,
                        "제목을 입력하거나 힌트를 요청하세요 (힌트: hint, 패스: pass):",
                        "노래 맞추기 게임",
                        JOptionPane.QUESTION_MESSAGE);

                if (input == null) {
                    continue;
                }

                // 콘솔에 입력값 출력
                System.out.println("\n⌨️ 사용자 입력: " + input);

                if (input.equalsIgnoreCase("hint")) {
                    hintProvider.provideHint(scanner, song);
                } else if (input.equalsIgnoreCase("pass")) {
                    System.out.println("❌ 땡~! 정답은 〘" + song.getTitle() + "〙 입니다! 현재 점수: " + score);
                    ispassed = true;
                    timerThread.stopTimer();
                    break;
                } else if (input.equalsIgnoreCase(song.getTitle())) {
                    score += 10;
                    System.out.println("⭕️ 정답입니다! 현재 점수: " + score);
                    timerThread.stopTimer();
                    songAnswered = true;
                    timerThread.stopTimer(); // 정답을 맞추면 타이머 중지
                } else {
                    remainingAttempts--;
                    if (remainingAttempts > 0) {
                        System.out.println("땡~! (남은 기회: " + remainingAttempts + ")");
                    } else {
                        System.out.println("❌ 정답은 〘" + song.getTitle() + "〙 입니다! 현재 점수: " + score);
                        ispassed = true;
                        timerThread.stopTimer();
                    }
                }
            }
        }
    }
}