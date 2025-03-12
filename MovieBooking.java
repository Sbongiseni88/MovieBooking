import java.util.*;

public class MovieBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🎬 Welcome to the Movie Booking System!");

        String[] movies = {"1. Se7en ", "2. Pulp fiction", "3. The Matrix"};

        // Available seats
        String[] seats = {"A1", "A2", "A3", "A4", "A5"};
        boolean[] bookedSeats = {false, false, false, false, false};

        System.out.println("Available Movies:");
        for (String movie : movies) {
            System.out.println(movie);
        }

        System.out.print("Select a movie (Enter 1, 2, or 3): ");
        int movieChoice = scanner.nextInt();

        if (movieChoice < 1 || movieChoice > movies.length) {
            System.out.println("❌ Invalid choice. Please restart the program.");
            return;
        }

        System.out.println("🎟️ You selected: " + movies[movieChoice - 1]);

        // Booking loop
        while (true) {
            System.out.println("Available Seats:");
            boolean allBooked = true;
            for (int i = 0; i < seats.length; i++) {
                if (!bookedSeats[i]) {
                    System.out.print(seats[i] + " ");
                    allBooked = false;
                }
            }

            if (allBooked) {
                System.out.println("❌ All seats are booked! Thank you for using our service.");
                break;
            }

            System.out.println("Enter seat number (e.g., A1, A2, A3) or type 'exit' to finish: ");
            String seatChoice = scanner.next();

            if (seatChoice.equalsIgnoreCase("exit")) {
                System.out.println("✅ Booking complete! Thank you.");
                break;
            }

            boolean seatFound = false;
            for (int i = 0; i < seats.length; i++) {
                if (seats[i].equalsIgnoreCase(seatChoice)) {
                    if (bookedSeats[i]) {
                        System.out.println("❌ Seat already booked! Please choose another seat.");
                    } else {
                        bookedSeats[i] = true;
                        seatFound = true;
                        System.out.println("✅ Booking confirmed! You booked " + seats[i] + " for " + movies[movieChoice - 1]);
                    }
                    break;
                }
            }

            if (!seatFound) {
                System.out.println("❌ Invalid seat selection. Please choose from available seats.");
            }
        }
        scanner.close();


    }
}
