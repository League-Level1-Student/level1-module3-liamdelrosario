package _04_netflix;

public class MovieRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie= new Movie("Twilight", 2);
		Movie movie1= new Movie("Angry birds", 5);
		NetflixQueue queue= new NetflixQueue();
		NetflixQueue queue1= new NetflixQueue();
		queue.addMovie(movie1);
		queue.addMovie(movie);
		System.out.println(movie);
		System.out.println(movie1);
		System.out.println(queue);
		System.out.println(movie.getTicketPrice());
		System.out.println(movie1.getTicketPrice());
		queue.sortMoviesByRating();
		
	}

}
