package org.example.main;

import org.example.game.GameChoice;
import org.example.game.Game;
import org.example.music.MusicManager;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.Scanner;

public class Main {
    private static void printAsciiArt() {
        System.out.println(" ██████   ██████                     ███          ");
        System.out.println("░░██████ ██████                     ░░░           ");
        System.out.println(" ░███░█████░███  █████ ████  █████  ████   ██████ ");
        System.out.println(" ░███░░███ ░███ ░░███ ░███  ███░░  ░░███  ███░░███");
        System.out.println(" ░███ ░░░  ░███  ░███ ░███ ░░█████  ░███ ░███ ░░░ ");
        System.out.println(" ░███      ░███  ░███ ░███  ░░░░███ ░███ ░███  ███");
        System.out.println(" █████     █████ ░░████████ ██████  █████░░██████ ");
        System.out.println("░░░░░     ░░░░░   ░░░░░░░░ ░░░░░░  ░░░░░  ░░░░░░  ");
        System.out.println("    ██████                ███                     ");
        System.out.println("  ███░░░░███             ░░░                      ");
        System.out.println(" ███    ░░███ █████ ████ ████   █████████         ");
        System.out.println("░███     ░███░░███ ░███ ░░███  ░█░░░░███          ");
        System.out.println("░███   ██░███ ░███ ░███  ░███  ░   ███░           ");
        System.out.println("░░███ ░░████  ░███ ░███  ░███    ███░   █         ");
        System.out.println(" ░░░██████░██ ░░████████ █████  █████████         ");
        System.out.println("   ░░░░░░ ░░   ░░░░░░░░ ░░░░░  ░░░░░░░░░          ");
    }

    private static void printGameDescription() {
        System.out.println("\n");
        System.out.println("¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪");
        System.out.println("♫ 노래 맞추기 게임 설명:");
        System.out.println("♫ 이 게임은 주어진 가사를 보고 노래 제목을 맞추는 퀴즈 게임입니다.");
        System.out.println("♫ 총 10개의 랜덤한 노래가 주어지며, 각 노래의 가사를 보고 제목을 맞추면 10점을 획득합니다.");
        System.out.println("♫ 가수/다른가사 중 하나의 힌트를 요청할 수 있고, 점수에는 영향을 주지 않습니다.");
        System.out.println("♫ 노래 한 곡당 3번의 시도를 할 수 있습니다.");
        System.out.println("¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪¸¸.•*¨*•♫♪");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        System.setProperty("apple.awt.UIElement", "true");
        Logger.getLogger("").setLevel(Level.SEVERE);
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;


        while (!exit) {
            printAsciiArt();
            System.out.println("\n");
            System.out.println("1. 게임 설명");
            System.out.println("2. 게임 시작");
            System.out.println("3. 음악 관리");
            System.out.println("4. 종료");
            System.out.print("번호를 입력해주세요: ");

            String mainChoice = scanner.nextLine();

            switch (mainChoice) {
                case "1":
                    printGameDescription();
                    System.out.println("계속하려면 엔터를 누르세요...");
                    scanner.nextLine();
                    break;
                case "2":
                    int musicChoice = GameChoice.getMusicChoice();
                    Game game = new Game(musicChoice);
                    game.play();
                    exit = true;
                    break;
                 case "3":
                     MusicManager musicManager = new MusicManager();
                     musicManager.manageMusic();
                     break;
                 case "4":
                     System.out.println("게임을 종료합니다.");
                     return;
                default:
                    System.out.println("올바른 숫자를 입력하세요.");
            }

        }
    }
}