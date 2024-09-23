package _01_basic_syntax;

// 형변환
// - 데이터 타입을 변환하는 것
// - (type)var
//      - type: 변경하려는 데이터 타입
//      - var: 변수명

public class Casting {
    public static void main(String[] args) {
        // 묵시적 형변환 (Wider Conversion)
        // - 더 작은 타입에서 더 큰 타입으로의 자동 형변환
        // - 반대의 경우에는 묵시적 형변환이 불가능 -> 명시적으로 변환해야 함
        int smallNumber = 10;
        System.out.println("smallNumber = " + smallNumber);

        double bigNumber = smallNumber; // int 를 double 로 자동 형변환
        System.out.println("bigNumber = " + bigNumber);

        //////////////////////////////////////////////////////////////////
        // 명식적 형변환 (Narrow Conversion)
        // - 더 큰 타입에서 작은 타입으로의 형변환
        double anotherBigNumber = 20.5;
        System.out.println("anotherBigNumber = " + anotherBigNumber);
        int anotherSmallNumber = (int) anotherBigNumber; // int 를 double 로 형변환
        System.out.println("anotherSmallNumber = " + anotherSmallNumber);

        // 주의. 명시적 형변환의 경우, 데이터 손실이 발생할 수 있음
        int largeNumber = 1000;
        System.out.println("largeNumber = " + largeNumber);
        byte smallByte = (byte) largeNumber; // int 를 byte 로 강제 형변환
        System.out.println("smallByte = " + smallByte); // smallByte = -24 (의도하지 않은 값이 나옴)

        // 1. 1000을 2진수로 변환하면 1111101000
        // 2. byte는 8비트만 저장 가능, 1000의 하위 8비트 11101000가 남음.
        // 3. 남은 8비트는 2의 보수 표현법 해석, 부호 비트(최상위 비트)가 1이므로 음수
        // 4. 10진수로 변환하면 `-24`
    }
}