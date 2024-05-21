package org.example.music;

public class KoreanMusicList extends MusicList {

    public KoreanMusicList() {
        songs.add(new GameMusic("좋은날", "눈물이 차올라서 고갤 들어", "나는요 오빠가 좋은 걸 어떡해", "아이유"));
        songs.add(new GameMusic("깊은 밤을 날아서", "우리들 만나고 헤어지는 모든 일들이 어쩌면 어린애들 놀이같아", "난 오직 그대 사랑하는 마음에 바보 같은 꿈 꾸며", "이문세"));
        songs.add(new GameMusic("어디에도", "행복했던 것만 기억에 남아", "우린 어디에도 없는 사랑을 해", "엠씨더맥스"));
        songs.add(new GameMusic("비와 당신", "이젠 당신이 그립지 않죠", "보고 싶은 마음도 없죠", "럼블피쉬"));
        songs.add(new GameMusic("사랑이었다", "알 수 없다 눈 뜨고 꿈꾸는 기분일까", "괜히 가슴이 소란스러워지고", "지코"));
        songs.add(new GameMusic("응급실", "후회하고 있어요 우리 다투던 그날", "이 바보야, 진짜 아니야", "izi"));
        songs.add(new GameMusic("스토커", "나도 알아 나의 문제가 무엇인지", "난 못났고 별볼일 없지", "10cm"));
        songs.add(new GameMusic("폰서트", "듣고 싶은 노래를 말 만해, everything", "이건 세상에서 제일 비싼 단독 공연", "10cm"));
        songs.add(new GameMusic("시간을 거슬러", "구름에 빛은 흐려지고 창가에 요란히 내리는", "갈수록 짙어져 간 그리움에 잠겨", "린"));
        songs.add(new GameMusic("사랑의 배터리", "당신 없인 못 살아 정말 나는 못 살아", "내겐 당신만이 전부예요 당신이 너무 좋아 완전 좋아요", "홍진영"));
        songs.add(new GameMusic("벚꽃 엔딩", "봄바람 휘날리며 흩날리는 벚꽃 잎이", "오늘은 우리 같이 걸어요 이 거리를", "버스커 버스커"));
        songs.add(new GameMusic("너의 의미", "너의 그 한 마디 말도 그 웃음도", "나 이제 뭉게구름 위에 성을 짓고", "산울림"));
        songs.add(new GameMusic("너의 모든 순간", "이윽고 내가 한눈에 너를 알아봤을 땐", "거기 있어줘서 그게 너라서", "성시경"));
        songs.add(new GameMusic("야생화", "하얗게 피어난 얼음 꽃 하나가", "사랑은 피고 또 지는 타버리는 불꽃", "박효신"));
        songs.add(new GameMusic("취중진담", "그래 난 취했는지도 몰라 취했는지도 몰라", "네 앞에 서면 준비했었던 말도 왜 난", "김동률"));
        songs.add(new GameMusic("꿈에", "어떤 말을 해야 하는지 난 너무 가슴이 떨려서", "혹시 이게 꿈이란 걸 그대가 알게 하진 않을꺼야", "박정현"));
        songs.add(new GameMusic("초록빛", "버려진 담배꽁초 흔들리는 처량함", "서있는 저 사람도 깜빡이고 서있지만", "폴킴"));
        songs.add(new GameMusic("붉은 노을", "난 너를 사랑하네", "이 세상은 너뿐이야", "빅뱅"));
        songs.add(new GameMusic("거북이", "상처가 아물고 다 나으면 떠나가", "상처가 많아 너 혼자서 매일 외롭게 숨는거니", "다비치"));
        songs.add(new GameMusic("오리 날다", "나는 꿈을 꾸었죠 네모단 달이 떴죠", "하늘 위 떠 있는 멋진 달 되고 싶어", "체리필터"));
        songs.add(new GameMusic("밤편지", "이 밤 그날의 반딧불을 당신의 창 가까이 보낼게요", "난 파도가 머물던 모래 위에 적힌 글씨처럼", "아이유"));
        songs.add(new GameMusic("소주 한 잔", "술이 한 잔 생각나는 밤 같이 있는 것 같아요", "떠나는 그대 얼굴이 혹시나 울지나 않을까", "임창정"));
        songs.add(new GameMusic("밤양갱", "떠나는 길에 네가 내게 말했지 너는 바라는 게 너무나 많아", "달디달고, 달디달고, 달디단", "비비"));
        songs.add(new GameMusic("가질수 없는 너", "술에 취한 네 목소리 문득 생각났다던 그 말", "며칠 사이 야윈 널 달래고 집으로 돌아오면서", "뱅크"));
        songs.add(new GameMusic("아로하", "어두운 불빛아래 촛불 하나 와인 잔에 담긴 약속하나", "나 바라는 건 오직 하나 영원한 행복을 꿈꾸지만", "조정석"));
        songs.add(new GameMusic("어땠을까", "내가 그때 널 (내가 그때 널) 잡았더라면 (잡았더라면)", "왜 그랬을까 그 땐 사랑이 뭔지 몰랐어", "싸이"));
    }

    @Override
    protected String getListName() {
        return "한국 음악";
    }
}