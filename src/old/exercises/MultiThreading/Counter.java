package old.exercises.MultiThreading;

public class Counter {
    private int counter = 0;
    public synchronized void increment() throws InterruptedException {
        wait(1000);
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
