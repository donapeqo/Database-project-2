package lecture464.db;

import lecture464.model.Movie;

public class MoviesDB {

	public MoviesDB() {
		// TODO Auto-generated constructor stub
	}
	
    public boolean validateMovieByName(String aMovieName) {
	    boolean movieExists = false;
	Database db = new Database();
   	db.connectMeIn();
   	movieExists = db.findMovieByName(aMovieName);
   	db.closeConnection();
   	
   	return movieExists;
    
    }
    
    public Movie getMovie(String aMovieName) {   
    	Database db = new Database();
	   	db.connectMeIn();
	   	Movie aMovie = db.returnMovieByName(aMovieName);
	   	db.closeConnection();
	   	
	   	return aMovie;
    }
    
//    public MovieShowing getMovieShowing() {
//		MovieShowing m_s = new MovieShowing("Tangled", 4.95,5,"2018-02-26 11:00:00"," 2018-02-26 13:00:01 "); 
//    	return m_s;
//    	
//    }
    
}
