package Threads.statc;

public class BookTickets_StaticSync {
    static int totalSeats = 10;

   synchronized static void bookseat(int seats) {
        if (seats <= 0) {
            System.out.println(Thread.currentThread().getName() + ": Invalid number of seats.");
            return;
        }

        synchronized (BookTickets_StaticSync.class) { // Static synchronization
            if (totalSeats >= seats) {
                System.out.println(Thread.currentThread().getName() + " : booked " + seats + " seats Successfully");
                totalSeats = totalSeats - seats;
                System.out.println("Seats left: " + totalSeats);
            } else {
                System.out.println(Thread.currentThread().getName() + ": Sorry, seats cannot be booked...!!!");
                System.out.println("Seats left: " + totalSeats);
            }
        }
    }
}