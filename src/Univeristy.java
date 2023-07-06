import java.util.ArrayList;
import java.util.List;

public class Univeristy {


    private List<Student> studentList;
    private List<Teacher> teacherList;
    private List<Subject> subjectList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public Univeristy() {
    }

    public Univeristy(List<Student> studentList, List<Teacher> teacherList, List<Subject> subjectList) {
        this.studentList = studentList;
        this.teacherList = teacherList;
        this.subjectList = subjectList;
    }

}
