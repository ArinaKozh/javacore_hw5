import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        StudentList stList = new StudentList(Arrays.asList(

                new Student("Arina", Arrays.asList(4.5, 5.0, 4.0), "Информатика"),

                new Student("Irina", Arrays.asList(4.0, 4.5, 5.0), "Математика"),

                new Student("Max", Arrays.asList(5.0, 5.0, 5.0), "Информатика"),

                new Student("Ilya", Arrays.asList(4.0, 4.5, 4.5), "Информатика"),

                new Student("Igor", Arrays.asList(4.5, 4.5, 4.5), "Информатика"),

                new Student("Masha", Arrays.asList(4.5, 4.5, 4.5), "Информатика"),

                new Student("Pavel", Arrays.asList(5.0, 5.0, 4.5), "Информатика"),

                new Student("Roman", Arrays.asList(5.0, 4.5, 4.5), "Информатика")


        ));
        stList.showAllStudents();
        System.out.println();
        stList.showFiveBest();

    }
}
