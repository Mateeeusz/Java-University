import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Univeristy uksw = newUniversity();

        System.out.println("STUDENTS:");
        for (Student student : uksw.getStudentList()) {
            System.out.println(student.toString());
        }
        System.out.println("\nTEACHERS:");
        for (Teacher teacher : uksw.getTeacherList()) {
            System.out.println(teacher.toString());
        }
        System.out.println("\nSUBJECTS:");
        for (Subject subject : uksw.getSubjectList()) {
            System.out.println(subject.toString());
        }






    }


    private static Univeristy newUniversity(){
        List<Teacher> teachers = List.of(
                new Teacher("Krzysztof", "Bąk", new Subject("ASD", Collections.emptyList()), "sala 10 piętro 3"),
                new Teacher("Jakub", "Fajny", new Subject("Programowanie", Collections.emptyList()), "sala 23 piętro 1"),
                new Teacher("Mateusz", "Szybki", new Subject("Grafika", Collections.emptyList()), "sala 15 piętro 2")
        );
        for(Teacher teacher : teachers){
            teacher.getSubject().setTeacherList(List.of(teacher));
        }
        List<Subject> subjects =  new ArrayList<>();
        for(Teacher teacher : teachers){
            subjects.add(teacher.getSubject());
        }
        List<Student> students = List.of(
                new Student("Mateusz", "Tężyński", 115968L, List.of(
                        new Student.subjectGrades(subjects.get(1), 3.0)
                ).toArray(Student.subjectGrades[]::new)),
                new Student("Paweł", "Zwinny", 114598L, List.of(
                        new Student.subjectGrades(subjects.get(0), 4.0)
                ).toArray(Student.subjectGrades[]::new)),
                new Student("Miłosz", "Duży", 124378L, List.of(
                        new Student.subjectGrades(subjects.get(0), 4.0)
                ).toArray(Student.subjectGrades[]::new))
        );
        return new Univeristy(students, teachers, subjects);
    }
}