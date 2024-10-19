package old.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapStudentExample {

    public static void populateHashMap(HashMap<Integer, Student> listOfAllStudents){
        Student s = new Student(1, "Qazim", "Mulleti", "Shkenca Komunikimi", 25, 'M', 2022, 3);
        listOfAllStudents.put(s.getId(), s);
        s = new Student(2, "Alban", "Hoxha", "Sporte", 24, 'M', 2021, 3);
        listOfAllStudents.put(s.getId(), s);
        s = new Student(3, "Albana", "Gorishti", "Informatike", 22, 'F', 2020, 4);
        listOfAllStudents.put(s.getId(), s);
        s = new Student(4, "Enxhia", "Sala", "Informatike Ekonomike", 24, 'F', 2021, 3);
        listOfAllStudents.put(s.getId(), s);
        s = new Student(5, "John", "Doe", "old.exercises.Computer Science", 23, 'M', 2021, 4);
        listOfAllStudents.put(s.getId(), s);
        s = new Student(6, "Jane", "Smith", "Psychology", 22, 'F', 2020, 3);
        listOfAllStudents.put(s.getId(), s);
        s = new Student(7, "Michael", "Jordan", "Basketball", 58, 'M', 1979, 10);
        listOfAllStudents.put(s.getId(), s);
        s = new Student(8, "Serena", "Williams", "Tennis", 40, 'F', 1998, 8);
        listOfAllStudents.put(s.getId(), s);
        s = new Student(9, "Elon", "Musk", "Space Exploration", 50, 'M', 1995, 7);
        listOfAllStudents.put(s.getId(), s);
        s = new Student(10, "Ada", "Lovelace", "old.exercises.Computer Science", 36, 'F', 1832, 1);
        listOfAllStudents.put(s.getId(), s);
        s = new Student(11, "Nikola", "Tesla", "Electrical Engineering", 86, 'M', 1884, 1);
        listOfAllStudents.put(s.getId(), s);
        s = new Student(12, "Marie", "Curie", "Physics", 66, 'F', 1893, 1);
        listOfAllStudents.put(s.getId(), s);
        s = new Student(13, "Alan", "Turing", "old.exercises.Computer Science", 41, 'M', 1936, 1);
        listOfAllStudents.put(s.getId(), s);
        s = new Student(14, "Rosalind", "Franklin", "Chemistry", 37, 'F', 1942, 1);
        listOfAllStudents.put(s.getId(), s);
        s = new Student(15, "Martin", "Luther King Jr.", "Social Justice", 39, 'M', 1955, 1);
        listOfAllStudents.put(s.getId(), s);
        s = new Student(16, "Malala", "Yousafzai", "Education Activism", 24, 'F', 2012, 1);
        listOfAllStudents.put(s.getId(), s);
        s = new Student(17, "Steve", "Jobs", "Entrepreneurship", 56, 'M', 1976, 1);
        listOfAllStudents.put(s.getId(), s);
        s = new Student(18, "Oprah", "Winfrey", "Media and Entertainment", 68, 'F', 1983, 1);
        listOfAllStudents.put(s.getId(), s);
        s = new Student(19, "Stephen", "Hawking", "Theoretical Physics", 76, 'M', 1962, 1);
        listOfAllStudents.put(s.getId(), s);
        s = new Student(20, "Greta", "Thunberg", "Environmental Activism", 19, 'F', 2018, 1);
        listOfAllStudents.put(s.getId(), s);
    }
    public static void print(HashMap<Integer, Student> map){
        System.out.println("///////////////");
        for (Map.Entry<Integer, Student> pair : map.entrySet()){
            System.out.println(pair.getValue());
        }
    }

    public static void printBasic(HashMap<Integer, Student> map){
        System.out.println("///////////////");
        for (Map.Entry<Integer, Student> pair : map.entrySet()){
            System.out.println(pair.getKey() + "\t" + pair.getValue().getName() + "\t" + pair.getValue().getSurname());
        }
    }

    public static void main(String[] args){
        HashMap<Integer, Student> listOfAllStudents = new HashMap<>();
        populateHashMap(listOfAllStudents);
        //print(listOfAllStudents);
        printBasic(listOfAllStudents);
        System.out.println("Map Size: " + listOfAllStudents.size());

        // clone map
        //HashMap<Integer, old.exercises.Student> clonedMap = new HashMap<>(listOfAllStudents);
        HashMap<Integer, Student> clonedMap = new HashMap<>();
        clonedMap = (HashMap<Integer, Student>) listOfAllStudents.clone();
        printBasic(clonedMap);

        // empty map
        clonedMap.clear();
        printBasic(clonedMap);
        System.out.println("Is map empty? " + clonedMap.isEmpty());

        // search for key
        int key = 55;
        Student s = listOfAllStudents.get(key);

        s = listOfAllStudents.getOrDefault(key, new Student());
        if (s.getId() == 0){
            System.out.println("There is no student with key = " + key);
        }
        else{
            s.printStudent();
        }
//        if (s != null){
//            s.printStudent();
//        }
//        if (listOfAllStudents.containsKey(key)){
//            //System.out.println("Contains key: " + listOfAllStudents.containsKey(key));
//            listOfAllStudents.get(key).printStudent();
//        }
//        else {
//            System.out.println("There is no student with key = " + key);
//        }

        // search for value
        Student std = new Student(2, "Alban", "Hoxha", "Sporte", 24, 'M', 2021, 3);
        listOfAllStudents.getOrDefault(std.getId(), new Student()).printStudent();

        Set<Map.Entry<Integer, Student>> set = listOfAllStudents.entrySet();
        for (Map.Entry<Integer, Student> e : set){
            e.getValue().printStudent();
        }

        Set<Integer> allKeys = listOfAllStudents.keySet();
        for (Integer i : allKeys) {
            System.out.print(i + ", ");
        }


    }
}
