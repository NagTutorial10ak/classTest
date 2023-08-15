import java.util.concurrent.locks.ReentrantLock;

class TicketBookingSystem {
    private int availableTickets = 10;
    private ReentrantLock lock = new ReentrantLock();

    public void bookTicket(String passengerName, int numTickets) {
        lock.lock();
        try {
            if (numTickets <= availableTickets) {
                System.out.println(passengerName + " is booking " + numTickets + " ticket(s).");

                // Simulating some processing time for booking
                Thread.sleep(2000);

                availableTickets -= numTickets;
                System.out.println(numTickets + " ticket(s) booked successfully for " + passengerName + ".");
                System.out.println("Available tickets: " + availableTickets);
            } else {
                System.out.println("Sorry, " + passengerName + ". Not enough tickets available.");
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        } finally {
            lock.unlock();
        }
    }
}

class PassengerThread extends Thread {
    private TicketBookingSystem ticketBookingSystem;
    private String passengerName;
    private int numTickets;

    public PassengerThread(TicketBookingSystem ticketBookingSystem, String passengerName, int numTickets) {
        this.ticketBookingSystem = ticketBookingSystem;
        this.passengerName = passengerName;
        this.numTickets = numTickets;
    }

    public void run() {
        ticketBookingSystem.bookTicket(passengerName, numTickets);
    }
}

public class Main {
    public static void main(String[] args) {
        TicketBookingSystem ticketBookingSystem = new TicketBookingSystem();

        PassengerThread passenger1 = new PassengerThread(ticketBookingSystem, "John", 3);
        PassengerThread passenger2 = new PassengerThread(ticketBookingSystem, "Emma", 5);
        PassengerThread passenger3 = new PassengerThread(ticketBookingSystem, "Mike", 4);

        passenger1.start();
        passenger2.start();
        passenger3.start();

        try {
            passenger1.join();
            passenger2.join();
            passenger3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("All passengers have completed their bookings.");
    }
}