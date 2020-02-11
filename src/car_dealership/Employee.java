package car_dealership;

public class Employee {
	
	public void handleCustomer(Customer cust, boolean finance,Vehicle vehicle) {
		if(finance == true) {
			System.out.println("Finance value is " + finance);
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust,loanAmount);
		}
			
		else if(vehicle.getPrice() <= cust.getCashOnHand()) {
			System.out.println("Inside else if statment");
			processTransaction(cust,vehicle);
		}
			
		else {
			System.out.println("Please bring more money");
			
		}
			
	}
	
	public void runCreditHistory(Customer cust,double loanAmount) {
		System.out.println("Ran credit history for customer");
		//String name = cust.getName();
		System.out.println(cust.getName() + " is approved for a loan amount of " + loanAmount);
	}
	
	public void processTransaction(Customer cust,Vehicle vehicle) {
		System.out.println("Processing transaction since the customer has more cash in hand than the price of the car");
		System.out.println("Customer has purchased the vehicle " + vehicle + " for the price " + vehicle.getPrice());
	}
	

}
