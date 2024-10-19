package old.exercises.Generics;

import java.util.Objects;

public class GenericsExample {

    public static <T> boolean identicalArrays(T[] array1, T[] array2){
        if (array1.length != array2.length){
            return false;
        }
        for (int i = 0; i < array1.length; i++){
            if (!Objects.equals(array1[i], array2[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Integer[] num1 = {1, 2, 3, 25, 84, 68, 95, 8, 1, 2, 3, 15};
        Integer[] num2 = {1, 2, 3, 25, 84, 68, 95, 8, 1, 2, 3, 15};
        String[] s1 = {"als", "ert", "tyu", "uio"};
        String[] s2 = {"als", "ert", "tyu", "uio"};

        Student[] students1 = new Student[3];
        Student[] students2 = new Student[3];
        Student s = new Student(0004, "Enxhia", "Sala", "Informatike Ekonomike", 24, 'F', 2021, 3);
        students1[0] = s;
        students2[0] = s;
        s = new Student(0002, "Alban", "Hoxha", "Sporte", 24, 'M', 2021, 3);
        students1[1] = s;
        students2[1] = s;
        s = new Student(0003, "Albana", "Gorishti", "Informatike", 22, 'F', 2020, 4);
        students1[2] = s;
        Student std1 = new Student(0003, "Albana", "Gorishti", "Informatike", 22, 'F', 2020, 4);
        students2[2] = std1;

        System.out.println(identicalArrays(num1, num2));
        System.out.println(identicalArrays(s1, s2));
        System.out.println(identicalArrays(students1, students2));

    }

}
