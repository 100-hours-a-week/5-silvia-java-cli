package org.example.game;

import org.example.music.GameMusic;

import javax.swing.*;
import java.util.Scanner;

public class HintProvider extends AbstractHintProvider {

    @Override
    public void provideHint(Scanner scanner, GameMusic song) {
        if (!canProvideHint()) {
            JOptionPane.showMessageDialog(null, "힌트를 사용할 수 없습니다.", "힌트 불가", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        boolean validHint = false;
        while (!validHint) {
            String[] options = {"다음 가사", "가수"};
            int choice = JOptionPane.showOptionDialog(
                    null,
                    "어떤 힌트를 보시겠습니까?",
                    "힌트 선택",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            switch (choice) {
                case 0:
                    JOptionPane.showMessageDialog(null, "다음 가사: " + song.getLyrics2(), "힌트", JOptionPane.INFORMATION_MESSAGE);
                    validHint = true;
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "가수: " + song.getArtist(), "힌트", JOptionPane.INFORMATION_MESSAGE);
                    validHint = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "올바른 선택이 아닙니다. 다시 시도해주세요.", "잘못된 선택", JOptionPane.ERROR_MESSAGE);
            }
        }
        remainHint = 0;
    }
}
