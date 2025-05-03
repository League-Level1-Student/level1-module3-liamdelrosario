package _04_netflix;

public class MovieRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie= new Movie("Twilight", 3);
		NetflixQueue queue= new NetflixQueue();
		queue.addMovie(movie);
		System.out.println(movie);
		
	}

}
