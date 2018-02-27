package lecture464.db;

import lecture464.model.Users;

public class OrdersDB {

	public OrdersDB() {
		// TODO Auto-generated constructor stub
	}

	public void registerUser(Users aUser) {
	   	Database db = new Database();
	   	db.connectMeIn();
	    db.addSingleUser(aUser);
	    db.closeConnection();
	    }
	
    public Users getUser(String aUserName) {   
    	Database db = new Database();
	   	db.connectMeIn();
	   	Users aUser = db.returnUserByUsername(aUserName);
	   	db.closeConnection();
	   	
	   	return aUser;
    }
}
