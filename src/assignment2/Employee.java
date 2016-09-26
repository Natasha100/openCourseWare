package assignment2;

public class Employee extends FooCorporation{
	
	private int hoursWorked;
	private double basePay;
	
	public int getHoursWorked(){
		return hoursWorked;
	}
	
	public double getBasePay(){
		return basePay;
	}

	public Employee(double basePay, int hoursWorked){
		this.basePay = basePay;
		this.hoursWorked = hoursWorked;
	}

	
}