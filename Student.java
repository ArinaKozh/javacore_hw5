import java.util.List;

public class Student{
        private String name;
        private List<Double> grades;
        private String specialty;

        public Student(String name, List<Double> grades, String specialty){
                this.name = name;
                this.grades = grades;
                this.specialty = specialty;
        }

        public double getAverageGrade() {
            return grades.stream().mapToDouble(i -> i).sum() / grades.size();
        }

        public String getSpecialty() {
                return specialty;
        }

        public String getName() {
                return name;
        }

        @Override
        public String toString() {
                return "Студент "+name+" со специальности "+ specialty+", средний балл = "+ this.getAverageGrade();
        }

}
