package old.exercises.MultiThreading;

public class IncrementClass extends Thread{
    private Counter counter;
    private int incrementPerThread;

    private int id;

    public IncrementClass(Counter c, int increment, int id){
        this.counter = c;
        this.incrementPerThread = increment;
        this.id = id;
    }

    @Override
    public void run(){
        for (int i = 0; i < incrementPerThread; i++){
            System.out.println("Incrementing.... thread with id = " + id);
            try {
                counter.increment();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Counter getCounter() {
        return counter;
    }

    public int getIncrementPerThread() {
        return incrementPerThread;
    }
}
