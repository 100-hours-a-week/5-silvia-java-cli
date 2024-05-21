package org.example.game;

import java.util.Scanner;

public class GameChoice {
    public static int getMusicChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪");
        System.out.println("어떤 음악으로 진행하시겠습니까?");
        System.out.println("1. 한국 인기 가요");
        System.out.println("2. 해외 팝송");
        System.out.print("번호를 입력하세요: ");
        int musicChoice = scanner.nextInt();
        switch (musicChoice) {
            case 1:
                System.out.println("한국 인기 가요를 선택하셨습니다.");
                System.out.println("(모든 노래 제목은 한글입니다.)");
                return 1;
            case 2:
                System.out.println("해외 팝송을 선택하셨습니다.");
                System.out.println("(Title Case를 지켜주세요.)");
                return 2;
            default:
                System.out.println("올바른 숫자를 입력하세요.");
                return getMusicChoice();
        }
    }
}
