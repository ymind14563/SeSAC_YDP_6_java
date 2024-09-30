package _05_class._abstract._abstract_prac;

public class Kim extends Student {
    public Kim(String name, int age, String school, String studentNumber) {
        super(name, age, school, studentNumber);
    }

    @Override
    void todo() {
        System.out.println("점심은 김가네 김밥");
    }
}
