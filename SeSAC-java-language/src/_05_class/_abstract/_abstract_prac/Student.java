package _05_class._abstract._abstract_prac;

public abstract class Student {
    String name;
    int age;
    String school;
    String studentNumber;


   public Student(String name, int age, String school, String studentNumber) {
       this.name = name;
       this.age = age;
       this.school = school;
       this.studentNumber = studentNumber;

  }

  abstract void todo();

   void infos() {
       System.out.println("======" + name + " 학생정보=======");
       System.out.println("학교: " + school);
       System.out.println("나이: " + age);
       System.out.println("이름: " + name);
       System.out.println("학번: " + studentNumber);
   }
}

