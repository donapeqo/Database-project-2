package lecture464.model;

public class Orders {
	private Users customer;
	private double totalCost;
	private String date;
	private String address;
	private String creditCardNumber;

	public Orders() {
		super();
	}
	
	public Orders(Users customer, double totalCost, String date) {
		super();
		this.customer = customer;
		this.totalCost = totalCost;
		this.date = date;
	}

	public Users getCustomer() {
		return customer;
	}
	public void setCustomer(Users customer) {
		this.customer = customer;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double cost) {
		this.totalCost = cost;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
