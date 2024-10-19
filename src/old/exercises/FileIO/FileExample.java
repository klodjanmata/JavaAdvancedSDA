package old.exercises.FileIO;

import old.exercises.Generics.Student;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class FileExample {

    public static void populateStudentList(List<Student> std){
        Student s = new Student(1, "Qazim", "Mulleti", "Shkenca Komunikimi", 25, 'M', 2022, 3);
        std.add(s);
        s = new Student(2, "Alban", "Hoxha", "Sporte", 24, 'M', 2021, 3);
        std.add(s);
        s = new Student(3, "Albana", "Gorishti", "Informatike", 22, 'F', 2020, 4);
        std.add(s);
        s = new Student(4, "Enxhia", "Sala", "Informatike Ekonomike", 24, 'F', 2021, 3);
        std.add(s);
        s = new Student(5, "John", "Doe", "old.exercises.Computer Science", 23, 'M', 2021, 4);
        std.add(s);
        s = new Student(6, "Jane", "Smith", "Psychology", 22, 'F', 2020, 3);
        std.add(s);
        s = new Student(7, "Michael", "Jordan", "Basketball", 58, 'M', 1979, 10);
        std.add(s);
        s = new Student(8, "Serena", "Williams", "Tennis", 40, 'F', 1998, 8);
        std.add(s);
        s = new Student(9, "Elon", "Musk", "Space Exploration", 50, 'M', 1995, 7);
        std.add(s);
        s = new Student(10, "Ada", "Lovelace", "old.exercises.Computer Science", 36, 'F', 1832, 1);
        std.add(s);
        s = new Student(11, "Nikola", "Tesla", "Electrical Engineering", 86, 'M', 1884, 1);
        std.add(s);
        s = new Student(12, "Marie", "Curie", "Physics", 66, 'F', 1893, 1);
        std.add(s);
        s = new Student(13, "Alan", "Turing", "old.exercises.Computer Science", 41, 'M', 1936, 1);
        std.add(s);
        s = new Student(14, "Rosalind", "Franklin", "Chemistry", 37, 'F', 1942, 1);
        std.add(s);
        s = new Student(15, "Martin", "Luther King Jr.", "Social Justice", 39, 'M', 1955, 1);
        std.add(s);
        s = new Student(16, "Malala", "Yousafzai", "Education Activism", 24, 'F', 2012, 1);
        std.add(s);
        s = new Student(17, "Steve", "Jobs", "Entrepreneurship", 56, 'M', 1976, 1);
        std.add(s);
        s = new Student(18, "Oprah", "Winfrey", "Media and Entertainment", 68, 'F', 1983, 1);
        std.add(s);
        s = new Student(19, "Stephen", "Hawking", "Theoretical Physics", 76, 'M', 1962, 1);
        std.add(s);
        s = new Student(20, "Greta", "Thunberg", "Environmental Activism", 19, 'F', 2018, 1);
        std.add(s);
    }

    public static void writeToCsv(String path, List<Student> studentList){

    }
    
    public static void main(String[] args) throws IOException {
        List<Student> studentsList = new ArrayList<>();

        populateStudentList(studentsList);
        //studentsList.forEach(std -> System.out.println(std.toString()));
        Path path = Paths.get("data/student.txt");




//        try{
//            Files.delete(path);
//        }catch (old.exercises.Exception e){
//            System.out.println("File Does NOT exist!");
//        }
        //Files.createFile(path);
//        Files.write(path, "".getBytes(), StandardOpenOption.WRITE);
//        studentsList.forEach(student -> {
//            try {
//                Files.write(path, student.toString().getBytes(), StandardOpenOption.APPEND);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        });

//        for (String line : Files.readAllLines(path)) {
//            System.out.println(line);
//        }
//        Path path = Paths.get("data/data.txt");
//        Files.createFile(path);
//        Files.write(path, "A long time ago in a galaxy far, far away....".getBytes(), StandardOpenOption.WRITE);
//        Files.write(path, "in a galaxy far, ".getBytes(), StandardOpenOption.APPEND);
//        Files.write(path, "far away....\n".getBytes(), StandardOpenOption.APPEND);
//        for (String line : Files.readAllLines(path)) {
//            System.out.println(line);
//        }
//        Files.delete(path);
//        CharBuffer buffer = CharBuffer.allocate(8);
//        String text = "sda";
//        System.out.println("Input text: " + text);
//
//        for (int i = 0; i < text.length(); i++) {
//            char c = text.charAt(i);
//            buffer.put(c);
//        }
//        System.out.println("Position after data is written into buffer: " + Arrays.toString(buffer.array()));
    }
}
