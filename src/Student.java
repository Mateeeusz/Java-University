import java.util.Arrays;

public class Student extends Person{

    private Long indexNumber;

    private subjectGrades[] subjectGrades;

    public Student.subjectGrades[] getSubjectGrades() {
        return subjectGrades;
    }

    public void setSubjectGrades(Student.subjectGrades[] subjectGrades) {
        this.subjectGrades = subjectGrades;
    }

    public Student(Long indexNumber) {
        this.indexNumber = indexNumber;
    }

    public Student(Long indexNumber, Student.subjectGrades[] subjectGrades) {
        this.indexNumber = indexNumber;
        this.subjectGrades = subjectGrades;
    }

    public Student(String name, String surrname, Long indexNumber, Student.subjectGrades[] subjectGrades) {
        super(name, surrname);
        this.indexNumber = indexNumber;
        this.subjectGrades = subjectGrades;
    }

    public Student(String name, String surrname, Long indexNumber) {
        super(name, surrname);
        this.indexNumber = indexNumber;
    }

    public String toString() {
        return "Student{" +
                "numer indexu=" + indexNumber +
                ", Przedmiot z ocena=" + Arrays.toString(subjectGrades) +
                "} " + super.toString();
    }


    public static class subjectGrades{
        public subjectGrades(Subject subject, Double grade) {
            this.subject = subject;
            this.grade = grade;
        }

        private Subject subject;
        private Double grade;

        public Subject getSubject() {
            return subject;
        }

        public Double getGrade() {
            return grade;
        }

        public void setSubject(Subject subject) {
            this.subject = subject;
        }

        public void setGrade(Double grade) {
            this.grade = grade;
        }

        public String toString() {
            return "Przedmiot z ocena{" +
                    "przedmiot=" + subject.getSubjectName() +
                    ", ocena=" + grade +
                    '}';
        }

    }
}
