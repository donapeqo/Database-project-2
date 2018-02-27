package lecture464.model;

public class MovieShowing {
	private String movieName;
	private String price;
	private String numberPurchased;
	private String startDateTime;
	private String endDateTime;
	private String showroom;
	private String theatreName;
	private String availableSeats;
	
	public MovieShowing() {
		super();
	}
	
	public MovieShowing(String movieName, String price, String numberPurchased, String startDateTime, String endDateTime) {
		super();
		this.movieName = movieName;
		this.price = price;
		this.numberPurchased = numberPurchased;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
	}

	public MovieShowing(String movName, String price, String numberPurchased, String startDateTime, 
						String endDateTime, String showroom, String theatreName, String availableSeats) {
		super();
		this.movieName = movName;
		this.price = price;
		this.numberPurchased = numberPurchased;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.showroom= showroom;
		this.theatreName = theatreName;
		this.availableSeats = availableSeats;
	}
	
	public String getAvailableSeats() {
		return availableSeats;
	}

	
	public void setAvailableSeats(String availableSeats) {
		this.availableSeats = availableSeats;
	}



	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}



	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getShowroom() {
		return showroom;
	}

	public void setShowroom(String showroom) {
		this.showroom = showroom;
	}

	public String getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}

	public String getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(String endDateTime) {
		this.endDateTime = endDateTime;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getNumberPurchased() {
		return numberPurchased;
	}
	
	public void setNumberPurchased(String numberPurchased) {
		this.numberPurchased = numberPurchased;
	}

	@Override
	public String toString() {
		return "MovieShowing [movieName=" + movieName + ", price=" + price + ", numberPurchased=" + numberPurchased
				+ ", startDateTime=" + startDateTime + ", endDateTime=" + endDateTime + ", showroom=" + showroom
				+ ", theatreName=" + theatreName + ", availableSeats=" + availableSeats + "]";
	}
	
	
}
