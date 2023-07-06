import java.util.List;

public class Subject {

    private String subjectName;
    private List<Teacher> teacherList;
    public Subject() {
    }

    public Subject(String subjectName, List<Teacher> teacherList) {
        this.subjectName = subjectName;
        this.teacherList = teacherList;
    }


    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String toString() {
        return "Przedmiot{" +
                "nazwa='" + subjectName + '\'' +
                ", studenci=" + teacherList.stream().map(Teacher::getSurrname).toList() +
                '}';
    }

}
