package old.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentListExample {

    public static void printStudentList(List<Student> list){
        System.out.println("///////////");
        for (Student s : list){
            s.printStudent();
        }
    }

    public static Student findStudent(List<Student> list, int id){
        for (Student s : list){
            if (s.getId() == id){
                return s;
            }
        }
        return null;
    }

    public static void main(String[] args){
        ArrayList<Student> allStudents = new ArrayList<>();

        Student s = new Student(0001, "Qazim", "Mulleti", "Shkenca Komunikimi", 25, 'M', 2022, 3);
        allStudents.add(s);
        s = new Student(0002, "Alban", "Hoxha", "Sporte", 24, 'M', 2021, 3);
        allStudents.add(s);
        s = new Student(0003, "Albana", "Gorishti", "Informatike", 22, 'F', 2020, 4);
        allStudents.add(s);
        s = new Student(0004, "Enxhia", "Sala", "Informatike Ekonomike", 24, 'F', 2021, 3);
        allStudents.add(s);
        s = new Student();
        s.setId(0005);
        allStudents.add(s);

        printStudentList(allStudents);

        Map<Integer, Integer> gradesInInformatics = new HashMap<>();
        gradesInInformatics.put(0001, 5);
        gradesInInformatics.put(0002, 7);
        gradesInInformatics.put(0003, 8);
        gradesInInformatics.put(0004, 10);
        gradesInInformatics.put(0005, 6);
        gradesInInformatics.put(0006, 6);

        System.out.println("///////////");
        for (int key : gradesInInformatics.keySet()){
            Student a = findStudent(allStudents, key);
            if (a == null){
                System.out.println("There is no student with id = " + key);
                continue;
            }
            System.out.println(key + " " + a.getName() + " " +
                                            a.getSurname() + " " +
                                            gradesInInformatics.get(key));
        }



    }
}
