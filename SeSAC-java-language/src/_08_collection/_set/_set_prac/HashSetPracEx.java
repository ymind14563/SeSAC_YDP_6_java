package _08_collection._set._set_prac;

import java.util.*;

public class HashSetPracEx {
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("정수를 입력하세요. -1 을 입력하면 종료됩니다.");
        while (true) {
            System.out.print("정수입력: ");
            input = sc.nextInt();

            if (input == -1) {
                break;
            }

            num.add(input);
        }

        List<Integer> sortNum = new ArrayList<>(num);
        Collections.sort(sortNum);

        System.out.print("중복 제거된 정수 목록: " + sortNum);
    }
}
