package old.exercises;

import java.util.ArrayList;
import java.util.List;
import old.exercises.Exception.OurException;

public class ExceptionExamples {

    public static String getElement(List<String> list, int index) throws OurException{
        String s = "";
        try{
            s = list.get(index);
        }catch (IndexOutOfBoundsException e){
            //e.printStackTrace();
            OurException ourException = new OurException();
            throw ourException;
        }
        return s;
    }

    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add("Alban");
        try {
            System.out.println(getElement(names, 5));
        }
        catch (OurException e){
            System.out.println("Owr old.exercises.Exception seems to work just fine!");
        }

//        try {
//            System.out.println(names.get(0));
//        }
//        catch (IndexOutOfBoundsException e){
//            System.out.println("old.exercises.Exception was thrown");
//        }
//        finally {
//            System.out.println("Finally we are here");
//        }
        System.out.println("I am at line 38");

    }
}
