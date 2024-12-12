package Threads;

class dataInconsistency {

    int totalSeats = 10;

    void bookseat(int seats) {
        if (totalSeats >= seats) {

            System.out.println(seats + "seats booked Successfully");
            totalSeats = totalSeats - seats;
            System.out.println("seats left: " + totalSeats);
//            System.out.println(Thread.currentThread().getName());
        } else {
            System.out.println("Sorry seats cannot be booked...!!!");
            System.out.println("seats left: " + totalSeats);
        }
    }
}

