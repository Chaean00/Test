package chapter2;

public class StudentTest {
    public static void main(String[] args) {
            Student studentLee = new Student();
            studentLee.studentName = "김정택";
            studentLee.studentID = 20191479;
            studentLee.address = "서울특별시 서초구 서초동";
            studentLee.grade = 2;

            studentLee.showStudentInfor();
        }
}
