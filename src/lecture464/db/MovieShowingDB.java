package lecture464.db;

import lecture464.model.MovieShowing;

public class MovieShowingDB {

	public MovieShowingDB() {
		// TODO Auto-generated constructor stub
	}

    public MovieShowing getMovieShowing(String string) {   
    	Database db = new Database();
	   	db.connectMeIn();
	   	MovieShowing aMS = db.returnMovieShowingByMovieID(string);
	   	db.closeConnection();
	   	
	   	return aMS;
    }
    
}
