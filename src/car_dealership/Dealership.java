package car_dealership;

import java.util.Scanner;

public class Dealership {

	public static void main(String[] args) {
		/*
		 * Write a program to simulate a car dealership sales process.We'll have employees, working selling vehicles to customers
		 * 
		 * Dealership
		 * Employees
		 * Vehicles
		 * Customers
		 * 
		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("What is your name? ");
		String Name = sc.nextLine();
		System.out.println("What is your address? ");
		String Address = sc.nextLine();
		System.out.println("What is the make of the car you are purchasing? ");
		String Make = sc.nextLine();
		System.out.println("What is the model of the car? ");
		String Model = sc.nextLine();
		System.out.println("How much cash do you have with you? ");
		double Cash = sc.nextDouble();
		System.out.println("Would you like to finance the car ?");
		boolean Finance = sc.nextBoolean();
		
		//char gender = sc.next().charAt(0); 
		//System.out.println(name); 
        // Numerical data input 
        // byte, short and float can be read 
        // using similar-named functions. 
        //int age = sc.nextInt(); 
        //long mobileNo = sc.nextLong(); 
        //double cgpa = sc.nextDouble(); 
  
        // Print the values to check if the input was correctly obtained. 
        /*System.out.println("Name: "+name); 
        System.out.println("Gender: "+gender); 
        System.out.println("Age: "+age); 
        System.out.println("Mobile Number: "+mobileNo); 
        System.out.println("CGPA: "+cgpa); */
		Customer cust1 = new Customer(Name,Address,Cash);
		/*
		cust1.setName(name);
		cust1.setAddress(address);
		cust1.setCashOnHand(Cash);*/
		Vehicle vehicle = new Vehicle(Make,Model,2020,15000);
		Vehicle vehicle2 = new Vehicle("BMW","M3",2020,15000);
		// Due to overriding .equals 
		boolean value = vehicle2.equals(vehicle);
		System.out.println(value);
		
		Employee emp = new Employee();

		cust1.purchaseCar(vehicle, emp, Finance);


	}

}
