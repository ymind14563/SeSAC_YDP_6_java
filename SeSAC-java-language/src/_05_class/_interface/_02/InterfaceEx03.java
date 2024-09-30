package _05_class._interface._02;

// 전화 기능을 위한 인터페이스
interface Phone {
    void makeCall(String number);
    void answerCall();
}

// 인터넷 기능을 위한 인터페이스
interface InternetDevice {
    void browseWeb(String url);
    void sendEmail(String address, String content);
}

// 카메라 기능을 위한 인터페이스
interface Camera {
    void takePhoto();
    void recordVideo();
}

// 다중 인터페이스 구현
// - 구현 객체는 여러 개의 인터페이스를 implements 할 수 있음
class SmartPhone implements Phone, InternetDevice, Camera {
    @Override
    public void takePhoto() { System.out.println("사진을 촬영합니다."); }

    @Override
    public void recordVideo() { System.out.println("동영상을 촬영합니다."); }

    @Override
    public void browseWeb(String url) { System.out.println(url + "로 접속합니다."); }

    @Override
    public void sendEmail(String address, String content) { System.out.println(address + "로 이메일을 보냅니다. 발송내용: " + content); }

     @Override
    public void makeCall(String number) { System.out.println(number + "로 전화를 겁니다."); }

    @Override
    public void answerCall() { System.out.println("전화를 받습니다."); }
}


public class InterfaceEx03 {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.makeCall("010-0000-0000");
        sp.answerCall();

        sp.browseWeb("www.example.com");
        sp.sendEmail("test@example.com", "안녕");

        sp.takePhoto();
        sp.recordVideo();
    }
}


//    추상 클래스 vs. 인터페이스
//    # 추상 클래스
//    - 클래스 내 추상 메소드가 하나 이상 포함 abstract 로 정의된 경우
//    # 인터페이스
//    - 모든 메소드가 추상 메소드인 경우
//    # 공통점
//    - 상속 받는 클래스 or 구현하는 인터페이스 안에 있는 "추상 메서드 구현 강제화"
//            # 차이점
//    - 추상 클래스: 추상 클래스를 상속 받아 기능을 이용하고 "확장"하는 것
//    - 인터페이스: 함수 껍데기만! 함수 구현 강제화 -> 구현 객체들의 "같은 동작을 보장"
//            => "목적"이 다름
//    인터페이스 -> "무엇을 해야하는가"
//    추상 클래스 -> "무엇인가" 정의하면서 일부 구현 제공