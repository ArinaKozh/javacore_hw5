import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentList {

    private List<Student> studList;

    public StudentList(List<Student> studList){
        this.studList = studList;
    }


    public List<Student> addStudent(Student student){
        studList.add(student);
        return  this.studList;
    }

    public boolean deleteStudent(Student student){
        if(studList.contains(student)){
            studList.remove(student);
            return true;
        }
        return false;
    }

    public Student getStudent(int i){
        return studList.get(i);
    }

    public void showAllStudents(){
        studList.forEach(System.out::println);
    }

    public void showFiveBest(){
        studList.stream()
                .filter(s->s.getSpecialty().equals("Информатика"))
                .filter(s->s.getAverageGrade()>=4.5)
                .sorted((s1,s2)->Double.compare(s2.getAverageGrade(),s1.getAverageGrade()))
                .limit(5)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
