package lecture464.db;

import lecture464.model.Users;

public class MoviesDB {
	
	  public void registerUser(Users aUser) {
	       	Database db = new Database();
	       	db.connectMeIn();
	       	db.addSingleUser(aUser);
	       	db.closeConnection();
	    }
}
