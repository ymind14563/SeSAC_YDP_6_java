package _09_dependency_injection._before;

// 게시판 목록을 관리하는 기능 제공
public class BoardService {
    // 의존성 주입을 적용하지 않았을 때
    // file 에서 db 로 변경되는 상황 발생 시
    // FileBoardPersistence 를 DbBoardPersistence 로 변경해야함
//    private final FileBoardPersistence persistence;
    private final DbBoardPersistence persistence;

    public BoardService() {
//        this.persistence = new FileBoardPersistence();
        this.persistence = new DbBoardPersistence();
    }

    public void save() {
        persistence.save();
    }

    public void delete() {
        persistence.delete();
    }
}
