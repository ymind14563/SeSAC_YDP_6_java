package _08_collection._map._map_prac;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPracEx {
    public static void main(String[] args) {
        Map<String, Integer> human = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        System.out.println("이름과 나이를 입력하세요. 종료를 입력하면 종료됩니다.");
        while (true) {
            System.out.print("이름 입력: ");
            name = sc.nextLine();

            if (name.equals("종료")) {
                System.out.println();
                break;
            }

            System.out.print("나이 입력: ");
            age = sc.nextInt();
            sc.nextLine(); // nextInt 에서 버려진 버퍼 처리 (nextLine 은 해당없음 - nextLine 은 한줄 전체 처리하기 때문에)

            human.put(name, age);
        }

        System.out.println("== 입력 받은 이름과 나이 목록 ==");
        for (Map.Entry<String, Integer> entry : human.entrySet()) {
            System.out.println("이름: " + entry.getKey() + ", 나이: " + entry.getValue());
        }
    }
}
