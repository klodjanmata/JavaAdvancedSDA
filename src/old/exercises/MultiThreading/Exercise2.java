package old.exercises.MultiThreading;

public class Exercise2 {
    //find even numbers from 1000 - 2000 and from 10000 - 20000.
    public static void main(String[] args){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                int counter = 0;
                for (int i = 100; i <= 200; i++){
                    if (i % 2 == 0){
                        counter++;
                        try {
                            wait(10);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Thread 1: " + i);
                    }
                }
                System.out.println("Thread1 found " + counter + " even numbers");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                int counter = 0;
                for (int i = 1000; i <= 2000; i++){
                    if (i % 2 == 0){
                        counter++;
                        try {
                            wait(10);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Thread 2: " + i);
                    }
                }
                System.out.println("Thread1 found " + counter + " even numbers");
            }
        });
        thread1.start();
        thread2.start();
    }
}
