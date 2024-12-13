package Thread_Locks;

public class DeadLocks1 {

    public static void main(String[] args) {

        final String resource1 = "bdbjbsa";
        final String resource2 = "gyuhecjsnk";

        // Thread 1
        Thread thread1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource 1");

                    try {
                        Thread.sleep(2000); // Correct usage
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (resource2) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };

        // Thread 2
        Thread thread2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource 2");

                    try {
                        Thread.sleep(2000); // Correct usage
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (resource1) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };

        // Start threads
        thread1.start();
        thread2.start();
    }
}
