package lecture464.model;

public class Movie {
	private String title;
	private String description;
	private double rating;
	
	
	public Movie(String title, String description, double rating) {
		super();
		this.title = title;
		this.description = description;
		this.rating = rating;
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
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	} 
	
	
}
