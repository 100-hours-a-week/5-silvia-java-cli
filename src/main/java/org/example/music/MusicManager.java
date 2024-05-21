package org.example.music;

import java.util.Scanner;

public class MusicManager {
    private KoreanMusicList koreanMusicList;
    private PopMusicList popMusicList;

    public MusicManager() {
        this.koreanMusicList = new KoreanMusicList();
        this.popMusicList = new PopMusicList();
    }

    public void manageMusic() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. 음악리스트 보기");
            System.out.println("2. 음악 추가");
            System.out.println("3. 음악 삭제");
            System.out.println("4. 메인 메뉴로 돌아가기");
            System.out.print("번호를 입력해주세요: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    viewMusicList(scanner);
                    break;
                case 2:
                    addMusic(scanner);
                    break;
                case 3:
                    deleteMusic(scanner);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }

    private void viewMusicList(Scanner scanner) {
        System.out.println("1. 한국 가요 보기");
        System.out.println("2. 팝송 보기");
        System.out.print("번호를 입력해주세요: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            koreanMusicList.showList();
        } else if (choice == 2) {
            popMusicList.showList();
        } else {
            System.out.println("잘못된 선택입니다.");
        }
    }

    private void addMusic(Scanner scanner) {
        System.out.println("1. 한국 가요 추가");
        System.out.println("2. 팝송 추가");
        System.out.print("번호를 입력해주세요: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("추가할 음악 제목: ");
        String title = scanner.nextLine();
        System.out.print("가수: ");
        String artist = scanner.nextLine();
        System.out.print("가사1: ");
        String lyrics1 = scanner.nextLine();
        System.out.print("가사2: ");
        String lyrics2 = scanner.nextLine();

        if (choice == 1) {
            koreanMusicList.addMusic(title, lyrics1, lyrics2, artist);
        } else if (choice == 2) {
            popMusicList.addMusic(title, lyrics1, lyrics2, artist);
        } else {
            System.out.println("잘못된 선택입니다.");
        }
    }

    private void deleteMusic(Scanner scanner) {
        System.out.println("1. 한국 가요 삭제");
        System.out.println("2. 팝송 삭제");
        System.out.print("번호를 입력해주세요: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            koreanMusicList.showList();
            System.out.print("삭제할 음악 번호: ");
            int index = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            koreanMusicList.removeMusicByIndex(index);
        } else if (choice == 2) {
            popMusicList.showList();
            System.out.print("삭제할 음악 번호: ");
            int index = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            popMusicList.removeMusicByIndex(index);
        } else {
            System.out.println("잘못된 선택입니다.");
        }
    }
}
