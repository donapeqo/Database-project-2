package lecture464.db;
import lecture464.model.*;

public class UsersDB {
	   public void registerUser(Users aUser) {
	       	Database db = new Database();
	       	db.connectMeIn();
	       	db.addSingleUser(aUser);
	       	db.closeConnection();
	    }
	    
	    public boolean validateUserByUsername(String aUserName) {
	    	    boolean userExists = false;
	    	Database db = new Database();
	       	db.connectMeIn();
	       	userExists = db.findUserByUsername(aUserName);
	       	db.closeConnection();
	       	
	       	return userExists;
	    }
	    
	    public boolean validateUserByPassword(String password) {
		    boolean passwordMatches = false;
		    Database db = new Database();
	   	    db.connectMeIn();
	   	    passwordMatches = db.findUserByPassword(password);
	   	    db.closeConnection();
	   	
	   	    return passwordMatches;
	    }
	    
	    
	    public Users getUser(String aUserName) {   
	    	Database db = new Database();
		   	db.connectMeIn();
		   	Users aUser = db.returnUserByUsername(aUserName);
		   	db.closeConnection();
		   	
		   	return aUser;
	    }

}
