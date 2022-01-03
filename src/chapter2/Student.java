package chapter2;

public class Student {

    int studentID; // 학번
    String studentName; // 이름
    int grade; // 학년
    String address; // 주소

    public void showStudentInfor() {
        System.out.println("학번 : " + studentID +
                "\n이름 : " + studentName +
                "\n학년 : " + grade +
                "\n주소 : " + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

/*    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "김정택";
        studentLee.studentID = 20191479;
        studentLee.address = "서울특별시 서초구 서초동";
        studentLee.grade = 2;

        studentLee.showStudentInfor();
    } */
}
