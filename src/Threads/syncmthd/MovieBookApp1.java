package Threads.syncmthd;

class MovieBookApp1 implements Runnable {
  private BookTickets_synchmthd b;
  private int seats;

  MovieBookApp1(BookTickets_synchmthd bookingSystem, int seats) {
    this.b = bookingSystem;
    this.seats = seats;
  }

  @Override
  public void run() {
    b.bookseat(seats);
  }

  public static void main(String[] args) {
    BookTickets_synchmthd b = new BookTickets_synchmthd();

    Thread thread1 = new Thread(new MovieBookApp1(b, 7), "Thread-1");
    Thread thread2 = new Thread(new MovieBookApp1(b, 6), "Thread-2");

    thread1.start();
    thread2.start();
  }
}
