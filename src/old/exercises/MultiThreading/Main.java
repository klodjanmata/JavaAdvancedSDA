package old.exercises.MultiThreading;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        int incrementsPerThread = 20;
        int numberOfThreads = 3;
        IncrementClass[] threads = new IncrementClass[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++){
            threads[i] = new IncrementClass(counter, incrementsPerThread, i+1);
            threads[i].start();
        }

        for (IncrementClass inc : threads){
            inc.join();
        }

        System.out.println("Counter value after multithreading: " + counter.getCounter());


    }
}
