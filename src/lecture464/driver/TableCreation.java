package lecture464.driver;
import lecture464.db.Database;

public class TableCreation {

	public static void main(String[] args) {
		
		Database db = new Database();
		
		db.connectMeIn();
		
		//db.createUsersTable();
		//db.createMoviesDBTable();
		
		//db.displayAllUsers();
		db.displaymoviesTable("Tangled");
		
		db.closeConnection();

	}
}
