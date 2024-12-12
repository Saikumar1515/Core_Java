package Threads.syncblock;

import Threads.MovieBook;


public class MovieBook2 extends Thread {
	static BookTickets_syncblck b;
    int seats;

    public void run() {
        b.bookseat(seats);
    }

    public static void main(String[] args) {
        b = new BookTickets_syncblck();

        MovieBook2 thread1 = new MovieBook2();
        thread1.seats = 7;
        thread1.start();

        MovieBook2 thread2 = new MovieBook2();
        thread2.seats = 6;
        thread2.start();
    }
}