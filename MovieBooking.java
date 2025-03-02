import java.util.Scanner;
public class MovieBooking {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome to the movie booking system...");

        // create array of movies
        String[] movies={"1. Spider-Man: No Way Home", "2. Avatar: The Way of Water", "3. John Wick 4"};

        //list all available movies

        System.out.println("Available movies: ");
        for (String movie: movies){
            System.out.println(movie);
        }
        System.out.print("enter a movie: (choose: 1, 2, 3) ");
        int choice= scanner.nextInt();

        if (choice<1 || choice > movies.length) {
            System.out.println("invalid choice , please restart the program");
        }else{
            System.out.println("you selected: "+ movies[choice-1]);

        }
        scanner.close();
    }
}
