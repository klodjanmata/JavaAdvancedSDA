package old.exercises;

import java.util.*;

public class ListExample {

    public static void print(List<String> list){
        System.out.println("/////////");
        for (String element : list){
            System.out.println(element);
        }

    }
    public static void printBasedOnIndex(List<String> list){
        System.out.println("/////////");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    public static List<String> cloneList(List<String> list){
        ArrayList<String> clone = new ArrayList<>(list);
        return clone;
    }

    public static void example (ArrayList<String> example){

    }

    public static void main(String[] args){

        ArrayList<String> test = new ArrayList<>();
        example(test);

        ArrayList<String> colors = new ArrayList<>();
        // adding elements
        colors.add("Black");
        colors.add("White");
        colors.add("Red");
        colors.add("Blue");
        //print all elements
        for (String color : colors){
            System.out.println(color);
        }
        //add in a specific position
        colors.add(4, "Purple");
        print(colors);
        //get value from a specific position
        System.out.println("//////");
        System.out.println(colors.get(3));
        // remove from a specific index
        colors.remove(3);
        print(colors);
        // remove specific value
        colors.remove("Black");
        print(colors);
        colors.set(colors.indexOf("Purple"), "Pink");
        print(colors);

        List<String> otherColors = new ArrayList<>();
        otherColors.add("Yellow");
        otherColors.add("Orange");
        otherColors.add("Purple");
        otherColors.add("Green");
        otherColors.add("Light Blue");
        otherColors.add("Red");
//        for (String color : otherColors) {
//            colors.add(color);
//        }
        // add all elements from second list
//        colors.addAll(otherColors);
//        print(colors);
        for(String color : otherColors){
            if (! colors.contains(color)){
                colors.add(color);
            }
        }
        print(colors);

        // remove the element at position 3
        colors.remove(2);
        print(colors);

        // search for element
        System.out.println("/////////\n"+colors.contains("Blue"));

        // order a list
        colors.sort(Comparator.naturalOrder());
        print(colors);

        // swap 2 elements
        if(colors.contains("Red") && colors.contains("White")) {
            System.out.println("Swapping...");
            Collections.swap(colors, colors.indexOf("Red"), colors.indexOf("White"));
        }
        else {
            System.out.println("NOT SWAPPING :(");
        }
        print(colors);

        // cloning a list
        //List<String> clonedList = (List<String>) colors.clone();
        List<String> clonedList = cloneList(colors);
        print(clonedList);

        // empty a list
        //colors.removeAll(colors);
        print(colors);
        System.out.println(colors.isEmpty());

        colors.trimToSize();
        colors.add("Blue");
        System.out.println("Index printing");
        printBasedOnIndex(colors);
    }
}
