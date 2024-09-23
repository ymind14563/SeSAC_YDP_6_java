package _02_control_statement;

import java.util.Scanner;

// 조건문
public class ConditionalStatement {

    public static void main(String[] args) {
        // if-else 문
        int number = 10;
        if (number % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        ////////////////////////////////////////////////////
        // String 타입에 대해 조건문 사용시 주의 사항
        /*
        System.out.print("이름을 입력해주세요 >> ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); // 엔터 이전까지의 문자열을 읽음
        System.out.println("name 값 확인: " + name);
        */

        // BAD (`==` 비교 연산자)
        /*
        if (name == "김새싹") {
            System.out.println("환영합니다!");
        } else {
            System.out.println("이름을 다시 확인해주세요!"); // 출력
        }*/

        // GOOD (`.equals()` 메서드 사용)
        /*
        if (name.equals("김새싹")) {
            System.out.println("환영합니다!");
        } else {
            System.out.println("이름을 다시 확인해주세요!"); // 출력
        }*/

        // WHY?
        // - `==` 연산자: 두 객체의 "참조"를 비교 (동일한 메모리 위치를 가르키는지 검사)
        // - `.equals()` 메서드: 두 객체의 "내용"이 동일한지를 비교

        // "문자열 리터럴"의 경우, Java 에서 특별한 취급. 동일한 문자열 리터럴이 사용된 경우,
        // Java 컴파일러는 문자열 풀(string pool) 이라는 공유된 메모리 영역에 해당 문자열 저장
        // 즉, str1 과 str2 는 같은 문자열을 가르키고 있으므로 같은 참조를 가르킴 => 따라서 `==` 연산자로 비교해도 true
        String str1 = "hello";
        String str2 = "hello";

        if (str1 == str2) { // 참조값 비교
            System.out.println("같은 참조를 가르킵니다"); // 출력
        } else {
            System.out.println("다른 참조를 가르킵니다");
        }

        if (str1.equals(str2)) { // 내용 비교
            System.out.println("내용이 같습니다."); // 출력
        } else {
            System.out.println("내용이 다릅니다.");
        }

        // "문자열 동적할당" 의 경우, `new String(...)` 을 사용해 새로운 문자열 객체를 생성하면 서로 다른 객체를 가르킴
        // 즉, str3 와 str4 가 다른 객체 이므로 `==` 연산자로 비교시 false.
        // => Java 에서 문자열 내용을 비교하고 싶을 떄에는 `.equals` 메소드로 비교하는 것이 바람직
        String str3 = new String("hi");
        String str4 = new String("hi");

        if (str3 == str4) { // 참조값 비교
            System.out.println("같은 참조를 가르킵니다");
        } else {
            System.out.println("다른 참조를 가르킵니다"); // 출력
        }

        if (str3.equals(str4)) { // 내용 비교
            System.out.println("내용이 같습니다."); // 출력
        } else {
            System.out.println("내용이 다릅니다.");
        }

        // if ~ else if 문
        // top-down 방식으로 처음 조건식이 참으로 평가되면 해당 식 수행한 다음에 if 절을 빠져나감
        if (number % 3 == 0) {
            System.out.println("3의 배수");
        } else if (number % 5 == 0) {
            System.out.println("5의 배수");
        } else if (number % 2 == 0) {
            System.out.println("2의 배수");
        } else {
            System.out.println("3의 배수도, 5의 배수도, 2의 배수도 아니다");
        }

        // switch ~ case 문
        // - 각 case 문의 break 문은 선택사항으로 break 문 생략시 바로 밑의 case 문으로 넘어감 (여러 case 문으로 하나의 시행문 지정 가능)
        String dayOfWeek;
        int day = 14;

        switch (day) {
            case 1:
                dayOfWeek = "일";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                dayOfWeek = "월~금";
                break;
            case 7:
                dayOfWeek = "토";
                break;
            default:
                dayOfWeek = "잘못된 입력입니다.";
                break;
        }
        System.out.println(dayOfWeek);

    }
}

// “나이를 입력하세요.” 라는 문구를 출력하고 사용자로부터 숫자를 입력 받기
class ConditionalStatement_parc_1 {
    public static void main(String[] args) {
        System.out.println("나이를 입력하세요 -> ");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 1 && age <= 7) {
            System.out.println("유아");
        } else if (age >= 8 && age <= 13) {
            System.out.println("초등학생");
        } else if (age >= 14 && age <= 16) {
            System.out.println("중학생");
        } else if (age >= 17 && age <= 19) {
            System.out.println("고등학생");
        } else if (age >= 20) {
            System.out.println("성인");
        } else {
            System.out.println("잘못된 입력입니다.");
        }

        sc.close();
    }
}

// “이름을 입력하세요.” 라는 문구를 출력하고 사용자로부터 이름을 입력 받기
class ConditionalStatement_parc_2 {
    public static void main(String[] args) {
        System.out.println("이름을 입력하세요 -> ");

        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        if (name.equals("홍길동")) {
            System.out.println("남자");
        } else if (name.equals("성춘향")) {
            System.out.println("여자");
        } else {
            System.out.println("모르겠어요.");
        }

        sc.close();
    }
}

// 사용자로부터 세 개의 정수를 입력받아, 그 수들의 "최대값", "최소값", "합계와 평균"을 구해보자.
class ConditionalStatement_parc_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 세 개의 정수 입력 받기
        System.out.println("3개의 정수를 한칸씩 띄워서 한 줄에 입력하세요 -> ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max = num1;
        int min = num1;

        if (num2 > max) max = num2;
        if (num3 > max) max = num3;

        if (num2 < min) min = num2;
        if (num3 < min) min = num3;

        int sum = num1 + num2 + num3;
        double average = sum / 3.00;


        // int max = Math.max(num1, Math.max(num2, num3));
        // int min = Math.min(num1, Math.min(num2, num3));
        // int sum = num1 + num2 + num3;
        // double average = sum / 3.00;

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
        System.out.printf("합계와 평균 : %d, %.2f", sum, average);
        sc.close();
    }
}