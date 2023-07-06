public class Teacher extends Person{
    private Subject subject;
    private String classNumber;
    public Teacher() {
    }

    public Teacher(Subject subject, String classNumber) {
        this.subject = subject;
        this.classNumber = classNumber;
    }

    public Teacher(String name, String surrname, Subject subject, String classNumber) {
        super(name, surrname);
        this.subject = subject;
        this.classNumber = classNumber;
    }


    public Subject getSubject() {
        return subject;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public String toString() {
        return "Nauczyciel{" +
                "przedmiot=" + subject +
                ", numer klasy='" + classNumber + '\'' +
                "} " + super.toString();
    }
}
