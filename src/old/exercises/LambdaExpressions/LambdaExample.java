package old.exercises.LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class LambdaExample {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 25, 84, 68, 95, 8, 1, 2, 3, 15);
        AtomicInteger sum = new AtomicInteger();
        for (int n: nums) {
            sum.addAndGet(n);
        }
        sum.set(0);
        nums.forEach(n -> {
            sum.addAndGet(n);
        });
        System.out.println(sum.get());


    }
}
