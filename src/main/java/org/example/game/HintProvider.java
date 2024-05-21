package org.example.game;

import org.example.music.GameMusic;

import java.util.Scanner;

public class HintProvider extends AbstractHintProvider {

    @Override
    public void provideHint(Scanner scanner, GameMusic song) {
        if (!canProvideHint()) {
            System.out.println("힌트를 사용할 수 없습니다.");
            return;
        }

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
                    System.out.println("가수: " + song.getArtist());
                    validHint = true;
                    break;
                default:
                    System.out.println("올바른 번호를 입력해주세요.");
            }
        }
        remainHint = 0;
    }
}