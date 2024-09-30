package _05_class._abstract._abstract_prac;

public class StudentEx {
    public static void main(String[] args) {
        Kim kim = new Kim("김철수", 17, "ABC","20220001");
        Baek baek = new Baek("백영희",20, "XYZ", "20220002");

        studentInfos(kim);
        studentInfos(baek);
    }

    public static void studentInfos(Student student) {
        student.infos();
        student.todo();
    }
}
