package Threads;

public class Thred_Thr_Run_lambda {
    
    public static void main(String[] args) {
        
        // Created thread using Thread class
        Thread myThread = new MyThread();
        myThread.start();
        
        // Created thread using Runnable interface
        Runnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        
        // Created thread using lambda expression
        Thread lambdaThread = new Thread(() -> {
            for (int i = 11; i <= 20; i++) {
                System.out.println("Lambda Numbers: " + i);
            }
        });
        lambdaThread.start();
    }
}

// Custom thread extending Thread class
class MyThread extends Thread {
    public void run() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println("Character: " + i);
        }
    }
}

// Custom Runnable implementation
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Numbers: " + i);
        }
    }
}
