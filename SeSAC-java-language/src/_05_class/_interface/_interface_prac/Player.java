package _05_class._interface._interface_prac;

interface Manual {
    void start(String music);
    void stop(String music);
}

class MP3Player implements Manual {

    @Override
    public void start(String music) {
        System.out.println("MP3 플레이어에서 '" + music + "' 음악을 재생합니다.");
    }

    @Override
    public void stop(String music) {
        System.out.println("MP3 플레이어에서 '" + music + "' 음악을 정지합니다.");
    }
}

class CDPlayer implements Manual {

    @Override
    public void start(String music) {
        System.out.println("CD 플레이어에서 '" + music + "' 앨범을 재생합니다.");
    }

    @Override
    public void stop(String music) {
        System.out.println("CD 플레이어에서 '" + music + "' 앨범을 정지합니다.");
    }
}

public class Player {
    public static void main(String[] args) {
        MP3Player mp3 = new MP3Player();
        CDPlayer cd = new CDPlayer();

        System.out.println("====== MP3 Player ======");
        mp3.start( "아이유 블루밍");
        mp3.stop("아이유 블루밍");

        System.out.println("====== CD Player ======");
        cd.start("아이유 꽃갈피");
        cd.stop("아이유 꽃갈피");
    }
}
