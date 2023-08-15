package week1.day2;

import java.util.ArrayList;
import java.util.List;

class Counter {
    private int count;

    public Counter() {
        count = 0;
    }

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

class WorkerThread extends Thread {
    private Counter counter;

    public WorkerThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                counter.increment();
                System.out.println("Thread " + Thread.currentThread().getId() + ": Counter = " + counter.getCount());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        Counter counter = new Counter();
        List<WorkerThread> threads = new ArrayList<WorkerThread>();

        for (int i = 0; i < 3; i++) {
            WorkerThread thread = new WorkerThread(counter);
            thread.start();
            threads.add(thread);
        }

        try {
            for (WorkerThread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Final count: " + counter.getCount());
    }
}