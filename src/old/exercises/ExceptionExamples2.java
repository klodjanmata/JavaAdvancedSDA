package old.exercises;

import old.exercises.Exception.NegativeNumberException;
import old.exercises.Exception.NumberZeroExeption;
import old.exercises.Exception.DublicateNumberException;

public class ExceptionExamples2 {

    public static int totalProduction(int[] array) throws NegativeNumberException, NumberZeroExeption {
        int total = 1;
        for (int i = 0; i < array.length; i++){
            if (array[i] < 0){
                throw new NegativeNumberException();
            }
            if (array[i] == 0){
                throw new NumberZeroExeption();
            }
            total *= array[i];
        }
        return total;
    }

    public static boolean checkDuplicate(int [] array) throws DublicateNumberException{
        for (int i = 0; i < array.length -1; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]){
                    throw new DublicateNumberException();
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 25, 84, 68, 95, 8, 15, 0};
        System.out.print("Does the array have duplicates? ");
        try {
            System.out.println(checkDuplicate(numbers));
        }
        catch (DublicateNumberException dne){
            System.out.println("\nThere are duplicate numbers!");
        }

        System.out.println("///////////////////////");
        try {
            System.out.println(totalProduction(numbers));
        }
        catch (NegativeNumberException nne) {
            System.out.println("A negative number in array, cannot calculate production!");
        }
        catch (NumberZeroExeption nze){
            System.out.println("Number 0 in array. Cannot calculate production!");
        }
        System.out.println("Program is still running!");
    }
}
