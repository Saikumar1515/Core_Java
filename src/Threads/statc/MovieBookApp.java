package Threads.statc;

class MovieBookApp extends Thread {
    int seats;

    public void run() {
        BookTickets_StaticSync.bookseat(seats); // Call static method
    }

    public static void main(String[] args) {
        MovieBookApp thread1 = new MovieBookApp();
        thread1.seats = 7;
        thread1.setName("Thread-1");
        thread1.start();

        MovieBookApp thread2 = new MovieBookApp();
        thread2.seats = 6;
        thread2.setName("Thread-2");
        thread2.start();
    }
}