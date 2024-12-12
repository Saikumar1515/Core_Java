package Threads.syncmthd;

class BookTickets_synchmthd {
  private int totalSeats = 10;

  synchronized void bookseat(int seats) {
    if (seats <= 0) {
      System.out.println(Thread.currentThread().getName() + ": Invalid number of seats.");
      return;
    }
    if (totalSeats >= seats) {
      System.out.println(Thread.currentThread().getName() + ": " + seats + " seats booked successfully.");
      totalSeats -= seats;
      System.out.println("Seats left: " + totalSeats);
    } else {
      System.out.println(Thread.currentThread().getName() + ": Sorry, seats cannot be booked.");
      System.out.println("Seats left: " + totalSeats);
    }
  }
}

