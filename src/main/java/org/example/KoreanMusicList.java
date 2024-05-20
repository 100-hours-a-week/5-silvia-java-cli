package org.example;

public class KoreanMusicList {
    private GameMusic[] songs;

    public KoreanMusicList() {
        songs = new GameMusic[]{
                new GameMusic("좋은날", "눈물이 차올라서 고갤 들어", "아이유"),
                new GameMusic("깊은 밤을 날아서", "난 오직 그대 사랑하는 마음에 바보 같은 꿈 꾸며", "이문세"),
                new GameMusic("어디에도", "행복했던 것만 기억에 남아", "엠씨더맥스"),
                new GameMusic("비와 당신", "이젠 당신이 그립지 않죠", "럼블피쉬"),
                new GameMusic("사랑이었다", "알 수 없다 눈 뜨고 꿈꾸는 기분일까", "지코"),
                new GameMusic("응급실", "이 바보야, 진짜 아니야", "izi"),
                new GameMusic("스토커", "내가 이렇게 사랑하는데 이렇게 원하는데", "10cm"),
                new GameMusic("폰서트", "듣고 싶은 노래를 말 만해, everything", "10cm"),
                new GameMusic("시간을 거슬러", "갈수록 짙어져 간 그리움에 잠겨", "린"),
                new GameMusic("사랑의 배터리", "당신 없인 못 살아 정말 나는 못 살아", "홍진영"),
        };
    }

    public GameMusic[] getSongs() {
        return songs;
    }
}
