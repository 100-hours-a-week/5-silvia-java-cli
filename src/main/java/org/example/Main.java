package org.example;

import java.util.Scanner;

public class Main {
    private static void printAsciiArt() {
        System.out.println("88b           d88  88        88   ad88888ba   88    ,ad8888ba,        ,ad8888ba,    88        88  88  888888888888 ");
        System.out.println("888b         d888  88        88  d8\"     \"8b  88   d8\"'    `\"8b      d8\"'    `\"8b   88        88  88           ,88  ");
        System.out.println("88`8b       d8'88  88        88  Y8,          88  d8'               d8'        `8b  88        88  88         ,88\" ");
        System.out.println("88 `8b     d8' 88  88        88  `Y8aaaaa,    88  88                88          88  88        88  88       ,88\"     ");
        System.out.println("88  `8b   d8'  88  88        88    `\"\"\"\"\"8b,  88  88                88          88  88        88  88     ,88\"       ");
        System.out.println("88   `8b d8'   88  88        88          `8b  88  Y8,               Y8,    \"88,,8P  88        88  88   ,88\"         ");
        System.out.println("88    `888'    88  Y8a.    .a8P  Y8a     a8P  88   Y8a.    .a8P      Y8a.    Y88P   Y8a.    .a8P  88  88\"          ");
        System.out.println("88     `8'     88   `\"Y8888Y\"'    \"Y88888P\"   88    `\"Y8888Y\"'        `\"Y8888Y\"Y8a   `\"Y8888Y\"'   88  888888888888  ");
    }

    private static void printGameDescription() {
        System.out.println("노래 맞추기 게임 설명:");
        System.out.println("이 게임은 주어진 가사를 보고 노래 제목을 맞추는 퀴즈 게임입니다.");
        System.out.println("총 10개의 랜덤한 노래가 주어지며, 각 노래의 가사를 보고 제목을 맞추면 10점을 획득합니다.");
        System.out.println("힌트를 요청하면 가수 이름이 제공되고, 점수에는 영향을 주지 않습니다.");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean exit = false;

        while (!exit) {
            printAsciiArt();
            System.out.println("1. 게임 설명");
            System.out.println("2. 게임하러가기");
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
                default:
                    System.out.println("올바른 숫자를 입력하세요.");
            }

        }
    }
}