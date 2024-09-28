package _05_class._inheritance;

public class Student extends Person {
    // case1. public 필드
    public String campus;

    // 생성자
    public Student(String name, int age) {
        System.out.println("자식 클래스 Student(String name, int age) 생성자 호출");

        // 부모로부터 상속받은 필드 값 할당
        this.name = name;
        this.age = age;
    }

    // 메서드
    public void setCampus(String campus) {
        this.campus = campus;
        System.out.println(campus + "캠퍼스에서 공부중!");
    }

}