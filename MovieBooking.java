import java.util.Scanner;

public class MovieBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🎬 Welcome to the Movie Booking System!");

        // List of movies
        String[] movies = {"1. Spider-Man: No Way Home", "2. Avatar: The Way of Water", "3. John Wick 4"};

        // Available seats
        String[] seats = {"A1", "A2", "A3", "A4", "A5"};
        boolean[] bookedSeats = {false, false, false, false, false};

        // Display movies
        System.out.println("\nAvailable Movies:");
        for (String movie : movies) {
            System.out.println(movie);
        }


        System.out.print("\nSelect a movie (Enter 1, 2, or 3): ");
        int movieChoice = scanner.nextInt();


        if (movieChoice < 1 || movieChoice > movies.length) {
            System.out.println("❌ Invalid choice. Please restart the program.");
            return;
        }

        System.out.println("\n🎟️ You selected: " + movies[movieChoice - 1]);


        System.out.println("\nAvailable Seats:");
        for (int i = 0; i < seats.length; i++) {
            if (!bookedSeats[i]) {
                System.out.print(seats[i] + " ");
            }
        }


        System.out.print("\n\nEnter seat number (e.g., A1, A2, A3): ");
        String seatChoice = scanner.next();

        // Check if seat is available
        boolean seatFound = false;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i].equalsIgnoreCase(seatChoice)) {
                if (bookedSeats[i]) {
                    System.out.println("❌ Seat already booked! Please restart and choose another seat.");
                    return;
                } else {
                    bookedSeats[i] = true;
                    seatFound = true;
                    System.out.println("\n✅ Booking confirmed! You booked " + seats[i] + " for " + movies[movieChoice - 1]);
                    break;
                }
            }
        }

        if (!seatFound) {
            System.out.println("❌ Invalid seat selection. Please restart the program.");
        }

        scanner.close();
    }
}
