package lecture464.model;

public class Movie {
	private String title;
	private String description;
	private String rating;
	private String ID;
	
	
	public Movie(String title, String description, String rating) {
		super();
		this.title = title;
		this.description = description;
		this.rating = rating;
	}
	
	public Movie(String ID, String title, String description, String rating) {
		super();
		this.ID = ID;
		this.title = title;
		this.description = description;
		this.rating = rating;
	}
	public Movie() {
		super();
	}
	
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}

	public String toTestString() {
		return "Hello";
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", description=" + description + ", rating=" + rating + ", ID=" + ID + "]";
	} 
	
	
}
