package _05_class._abstract._abstract_prac;

public class Baek extends Student {
    public Baek(String name, int age, String school, String studentNumber) {
        super(name, age, school, studentNumber);
    }

    @Override
    void todo() {
        System.out.println("점심은 백종원 피자");
    }
}
