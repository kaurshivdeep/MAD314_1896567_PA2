import java.util.ArrayList;
import java.util.List;

public class StudentRepo {
    private static StudentRepo instance =null;
    private List<Student> students=new ArrayList<>();

    private StudentRepo(){
        Student student=new Student();
        student.stuId='1';
        student.name="dead";
        student.password="whocares";
        this.students.add(student);

        student.stuId='2';
        student.name="totally_dead";
        student.password="whocares";
        this.students.add(student);

        student.stuId='3';
        student.name="RIP";
        student.password="whocares";
        this.students.add(student);

        student.stuId='4';
        student.name="inHellNow";
        student.password="whocares";
        this.students.add(student);

    public static StudentRepo getinstance


    }

}
