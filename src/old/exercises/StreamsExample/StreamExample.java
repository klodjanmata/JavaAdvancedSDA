package old.exercises.StreamsExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(1, 2, 3, 25, 84, 68, 95, 8, 1, 2, 3, 15);
        int numer;
        double average = nums.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Average: " + average);

        int evenSum = nums.stream()
                .filter(a-> a % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("EvenSum: " + evenSum);

        int oddSum = nums.stream()
                .filter(a -> a % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("OddSum: " + oddSum);

        List<Integer> nums2 = new ArrayList<>();
        nums2.addAll(nums.stream()
                .filter(a -> a % 2 == 0)
                .collect(Collectors.toList()));
        for (int a: nums2) {
            System.out.print( a + ", ");
        }

        System.out.println("//////////\nList before duplicate removal " + nums);
        List<Integer> distictNums = nums.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("List after duplicate removal: " + distictNums);

        Integer secondSmallest = nums.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("SecondSmallest : " + secondSmallest);


        Integer secondLargest = nums.stream()
                .distinct()
                .sorted((a, b) -> b.compareTo(a))
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("SecondSmallest : " + secondLargest);
        
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Green");
        colors.add("Light Blue");
        colors.add("Red");

        List<String> list = colors.stream()
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println(list);
        System.out.println("Alphabetic order: " + colors.stream()
                .sorted()
                .collect(Collectors.toList()));

        System.out.println("Alphabetic order: " + colors.stream()
                .sorted(Collections.reverseOrder())
                //.sorted((a, b) -> b.comparedTo(a))
                .collect(Collectors.toList()));
    }
}
