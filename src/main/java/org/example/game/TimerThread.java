package org.example.game;

public class TimerThread extends Thread {
    private int seconds;
    private boolean running = true;
    private final Object lock;

    public TimerThread(int seconds, Object lock) {
        this.seconds = seconds;
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            while (seconds > 0 && running) {
                synchronized (lock) {
                    System.out.printf("\r⏰ 남은 시간: %d초", seconds);
                    System.out.flush();
                }
                Thread.sleep(1000); // 1초 대기
                seconds--;
            }
            if (running) {
                synchronized (lock) {
//                    System.out.println("\n타이머 종료!");
                }
            }
        } catch (InterruptedException e) {
            synchronized (lock) {
//                System.out.println("\n타이머가 중단되었습니다.");
            }
        } finally {
            running = false;
        }
    }

    public boolean isRunning() {
        return running;
    }

    public void stopTimer() {
        running = false;
        this.interrupt();
    }

    @Override
    public void interrupt() {
        running = false;
        super.interrupt();
    }
}