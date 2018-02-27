package lecture464.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lecture464.model.*;

public class Database {
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement ps = null;
	
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	//static final String DB_URL = "jdbc:mysql://localhost/MVCApp"; 
	final String DB_URL = "jdbc:mysql://cse.unl.edu:3306/nabdulha";
	
	

	//  Database credentials
	static final String USER = "nabdulha"; // Replace with your CSE_LOGIN
	static final String PASS = "JaxUM6";   // Replace with your CSE MySQL_PASSWORD
	
	
	public void connectMeIn() {
		try{
			//Register the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");			
		}catch(ClassNotFoundException e){
			System.err.println(e);
			System.exit (-1);
		}
		try {
			 //Open a connection
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public void closeConnection(){
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	/** ***** USERS ***** **/
	public void createUsersTable() {
		  
		try {
		  stmt = conn.createStatement();
		
		  String sql;
		  sql = "DROP TABLE IF EXISTS Users";
		  stmt.executeUpdate(sql);

		  sql = "CREATE TABLE Users " +
		          "(ID INT NOT NULL AUTO_INCREMENT," +
		          " First_Name VARCHAR(255), " + 
		          " Last_Name VARCHAR(255), " + 
		          " User_Name VARCHAR(255), " + 
		          " Password VARCHAR(255)," +
		          "PRIMARY KEY(ID))"; 

		  stmt.executeUpdate(sql);

		  sql = "INSERT INTO Users (First_Name, Last_Name, User_Name, Password)" +
		          "VALUES ('Richard', 'Feynman', 'feynman', '1234')";
		  stmt.executeUpdate(sql);
		  
		  
		  } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
	}
	
	
	public void addSingleUser(Users aUser) {
		  
		try {
		  stmt = conn.createStatement();
		  String sql;
		  
		  String firstName = aUser.getFirstName();
		  String lastName = aUser.getLastName();
		  String userName = aUser.getUserName();
		  String password = aUser.getPassword();
		  

		  sql = "INSERT INTO Users (First_Name, Last_Name, User_Name, Password)" +
		          "VALUES ('" + firstName +
				  "', '" + lastName + 
				  "', '" + userName + 
				  "', '" + password + "')";
		  stmt.executeUpdate(sql);
		  
		  
		  } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
	}
	
	
	public boolean findUserByUsername(String aUserName) { //check for registration
		boolean userExists = false;
		String SQL = "SELECT * from Users";
	    Statement stat;
		try {
			stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(SQL);
			
			while (rs.next()){	
				if(aUserName.equals( rs.getString(4) )) {
					userExists = true;
				}    
		    }
			
		    stat.close();
		        
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return userExists;
	}
	
	public boolean findUserByPassword(String password) { //check login credentials
		boolean passwordMatches = false;
		String SQL = "SELECT * from Users";
	    Statement stat;
		try {
			stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(SQL);
			
			while (rs.next()){	
				if(password.equals( rs.getString(5) )) {
					passwordMatches = true;
				}    
		    }
			
		    stat.close();
		        
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return passwordMatches;
	}
	
	
	public Users returnUserByUsername(String aUserName) {
		String SQL = "SELECT * from Users";
	    Statement stat;
	   
	    Users aUser = new Users();
		try {
			stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(SQL);
			
			while (rs.next()){
				if(aUserName.equals( rs.getString(4) )) {
					aUser.setFirstName(rs.getString(2));
					aUser.setLastName(rs.getString(3));
					aUser.setUserName(rs.getString(4));
					aUser.setPassword(rs.getString(5));
				} 
		    }
			
		    stat.close();
		        
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return aUser;
	}

	
	public void displayAllUsers() {
		String SQL = "SELECT * from Users";
	    Statement stat;
		try {
			stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(SQL);
			
			while (rs.next()){
		        System.out.println(rs.getString(1) + " " + rs.getString(2) +  " " + rs.getString(3)
		        		+ " " + rs.getString(4) + " " + rs.getString(5));
		    }
			
		    stat.close();
		        
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/** ***** MOVIES ***** **/
	
	public boolean findMovieByName(String aMovieName) { //Worked. Checked
		boolean movieExists = false;
		String SQL = "SELECT * from Movies where Movie_Name = '"+ aMovieName +"';";
	    Statement stat;
		try {
			stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(SQL);
			
			while (rs.next()){	
				if(aMovieName.equals( rs.getString(2) )) {
					movieExists = true;
				}    
		    }
			
		    stat.close();
		        
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return movieExists;
	}
	
	public Movie returnMovieByName(String aMovieName) {
		String SQL = "SELECT * from Movies WHERE Movie_Name='"+aMovieName+"';";
	    Statement stat;
	   
	    Movie aMovie = new Movie();
		try {
			stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(SQL);
			
			while (rs.next()){
					aMovie.setTitle(rs.getString("Movie_Name"));
					aMovie.setDescription(rs.getString("Description"));
					aMovie.setRating(rs.getString("Rating"));
					aMovie.setID(rs.getString("ID"));
				 
		    }
			
		    stat.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aMovie;
		
		
	}
	
	public MovieShowing returnMovieShowingByMovieID(String movieID) {
		String SQL = "SELECT * from MovieShowing WHERE MovieID = '"+ movieID +"';";
		
	    Statement stat;
	    MovieShowing ms = new MovieShowing();
	    String theatreNum ="";
	    String showroom_num = "";
	    
	    try {
	    	stat = conn.createStatement();
	    	ResultSet rs = stat.executeQuery(SQL);
			
	    	while (rs.next()){
					ms.setPrice(rs.getString("Price"));
					ms.setStartDateTime(rs.getString("Start_Time"));
					ms.setShowroom(rs.getString("ShowroomID"));
					showroom_num= rs.getString("ShowroomID");
		    }
		    stat.close();
	    	
	    } catch (SQLException e) {
			e.printStackTrace();
		}
	    
	    try {
	    	stat = conn.createStatement();
	    	String SQL2 = "SELECT * FROM Showrooms WHERE ID = '"+ showroom_num +"';";
	    	ResultSet rs = stat.executeQuery(SQL2);
	    	
	    	while (rs.next()){
	    			ms.setAvailableSeats(rs.getString("Available_Seats"));
					theatreNum = rs.getString("TheatreID");
		    }

	    	
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
	    
	    try {
	    	stat = conn.createStatement();
	    	String SQL3 = "SELECT * FROM Theatres WHERE ID = '"+theatreNum+"'";
	    	ResultSet rs = stat.executeQuery(SQL3);
	    	
	    	while (rs.next()){
    			ms.setTheatreName(rs.getString("Theatre_Name"));	
	    	}
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
		
		return ms;
	}
	
	public void displayAllMovies() {
		String SQL = "SELECT * from Movies";
	    Statement stat;
		try {
			stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(SQL);
			
			while (rs.next()){
		        System.out.println(rs.getString("ID") + " " + rs.getString(2) +  " " + rs.getString("Description")
		        		+ " " + rs.getString(4) + " " + rs.getString(5));
		    }
			
		    stat.close();
		        
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void displayAllMovieShowings() {
		String SQL = "SELECT * from MovieShowing";
	    Statement stat;
		try {
			stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(SQL);
			
			while (rs.next()){
		        System.out.println(rs.getString("ID") + " " + rs.getString(2) +  " " + rs.getString("Number_Purchased")
		        		+ " " + rs.getString(4) + " " + rs.getString(5)+ " " + rs.getString(6)+ " " + rs.getString(7));
		    }
			
		    stat.close();
		        
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	/** ***** THEATRES ***** **/
	
	public Theatres returnTheatreByName(String tName) {
		String SQL = "SELECT * from Theatres";
	    Statement stat;
	   
	    Theatres aTheatre = new Theatres();
		try {
			stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(SQL);
			
			while (rs.next()){
				if(tName.equals( rs.getString(2) )) {
					aTheatre.setName(rs.getString(2));
					aTheatre.setLocation(rs.getString(3));
				} 
		    }
			
		    stat.close();
		        
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return aTheatre;
	}
	
	/** ORDERS **/
	public void addMovieToOrder(MovieShowing mv) {
		  
		try {
		  stmt = conn.createStatement();
		  String sql;
		  
		  String firstName = aUser.getFirstName();
		  String lastName = aUser.getLastName();
		  String userName = aUser.getUserName();
		  String password = aUser.getPassword();
		  

		  sql = "INSERT INTO Users (First_Name, Last_Name, User_Name, Password)" +
		          "VALUES ('" + firstName +
				  "', '" + lastName + 
				  "', '" + userName + 
				  "', '" + password + "')";
		  stmt.executeUpdate(sql);
		  
		  
		  } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
	}
	


}
