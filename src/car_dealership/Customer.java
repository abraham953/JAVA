package car_dealership;

public class Customer {
	
	private String name;
	private String address;
	private double cashOnHand;
	private int creditlength;
	private double loanAmount;
	
	
	
	
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getCreditlength() {
		return creditlength;
	}
	public void setCreditlength(int creditlength) {
		this.creditlength = creditlength;
	}


	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getCashOnHand() {
		return cashOnHand;
	}
	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}

	public void purchaseCar(Vehicle vehicle,Employee emp, boolean finance) {
		
		emp.handleCustomer(this, finance, vehicle);
		
	}
}
