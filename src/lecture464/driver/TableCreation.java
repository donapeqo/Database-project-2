package lecture464.driver;

import lecture464.db.Database;
import lecture464.db.MovieShowingDB;
import lecture464.db.MoviesDB;
import lecture464.model.Movie;
import lecture464.model.MovieShowing;

public class TableCreation {

	public static void main(String[] args) {
		
		Database db = new Database();
		db.connectMeIn();
		
		Movie m = new Movie();
		MoviesDB mdb = new MoviesDB();
		
		MovieShowing ms = new MovieShowing();
		MovieShowingDB msdb = new MovieShowingDB();
		
		

		//m = db.returnMovieByName("Tangled");
		//m = mdb.getMovie("a");
		//m.toString();
		
//		boolean hey;
//		hey = mdb.validateMovieByName("Tangld");
//		System.out.println(hey);
		
//		ms = msdb.getMovieShowing(1);
//		ms.toString();
		
		//db.createUsersTable();
		
		//db.displayAllUsers();
		//db.displayAllMovies();
		//db.displayAllTheatres();
		//db.displayAllMovieShowings();
		db.closeConnection();

	}
}
