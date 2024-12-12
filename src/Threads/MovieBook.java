package Threads;


public class MovieBook extends Thread {
    static dataInconsistency b;
     int seats;

    public void run() {
        b.bookseat(seats);
    }

    public static void main(String[] args) {
        b = new dataInconsistency();

        MovieBook thread1 = new MovieBook();
        thread1.seats = 7;
        thread1.start();

        MovieBook thread2 = new MovieBook();
        thread2.seats = 6;
        thread2.start();
    }
}