package lecture464.db;

import lecture464.model.Theatres;

public class TheatresDB {
	
    public Theatres getTheatre(String theatreName) {   
    	Database db = new Database();
	   	db.connectMeIn();
	   	Theatres aTheatre = db.returnTheatreByName(theatreName);
	   	db.closeConnection();
	   	
	   	return aTheatre;
    }
}
