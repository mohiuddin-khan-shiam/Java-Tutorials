// Advanced/Multithreading.java

// Extending Thread class
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

// Implementing Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        // Using Thread class
        MyThread thread1 = new MyThread();
        thread1.setName("Thread-1");

        MyThread thread2 = new MyThread();
        thread2.setName("Thread-2");

        // Using Runnable interface
        Thread runnableThread1 = new Thread(new MyRunnable(), "Runnable-1");
        Thread runnableThread2 = new Thread(new MyRunnable(), "Runnable-2");

        // Starting threads
        thread1.start();
        thread2.start();
        runnableThread1.start();
        runnableThread2.start();
    }
}
