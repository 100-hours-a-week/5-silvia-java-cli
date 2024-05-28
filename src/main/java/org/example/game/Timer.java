//package org.example.game;
//
//public class Timer extends Thread {
//    private int timeLeft;
//    private boolean timeUp;
//    private final Game game;
//
//    public Timer(Game game) {
//        this.game = game;
//        this.timeLeft = 10; // 10 seconds for each question
//        this.timeUp = false;
//    }
//
//    public void resetTimer() {
//        timeLeft = 10;
//        timeUp = false;
//    }
//
//    public boolean isTimeUp() {
//        return timeUp;
//    }
//
//    @Override
//    public void run() {
//        try {
//            while (timeLeft > 0 && !isInterrupted()) {
//                System.out.print("남은 시간: " + timeLeft + "초\r");
//                Thread.sleep(1000);
//                timeLeft--;
//            }
//            if (timeLeft == 0) {
//                timeUp = true;
//                game.timeIsUp(); // Notify the game that time is up
//            }
//        } catch (InterruptedException e) {
//            // Handle interruption
//            Thread.currentThread().interrupt();
//        }
//    }
//}
