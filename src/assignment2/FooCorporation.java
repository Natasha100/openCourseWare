package assignment2;

public class FooCorporation{
	
	private static final int maxHours = 60;
	private static final double minimumWage = 8.00;
	
	/* @return amount to pay employee
	 * employee gets paid (hours worked) x (base pay) for each hour up to 40 hours
	 * for every hour over 40, they get overtime = (base pay) x 1.5
	 * base pay must not be less than the minimum 8.00, otherwise print error
	 * if the number of hours is greater than 60, print error
	 */
	public double payEmployee(){
		Employee currentEmployee = (Employee) this; //is the structure I have incorrect/is there a better way to structure it?
		
		if (currentEmployee.getBasePay() < minimumWage){
			throw new RuntimeException("You aren't paying your employee minimum wage");
		} else if (currentEmployee.getHoursWorked() > maxHours){
			throw new RuntimeException("Your employee is working more the the maximum hours allowed");
		} else {
			if (currentEmployee.getHoursWorked() <= 40){
				return currentEmployee.getHoursWorked() * currentEmployee.getBasePay();
			}
			else {
				double amount = 40 * currentEmployee.getBasePay();
				amount += (currentEmployee.getHoursWorked() - 40) * (currentEmployee.getBasePay() * 1.5);
				return amount;
			}
		}
	}
	
	public FooCorporation(){}
	
	public static void main(String[] args){
		
		FooCorporation employee1 = new Employee(7.50, 35);
		FooCorporation employee2 = new Employee(8.20, 47);
		FooCorporation employee3 = new Employee(10.00, 73);
		
		//System.out.println(employee1.payEmployee());
		System.out.println(employee2.payEmployee());
		//System.out.println(employee3.payEmployee());
		
	}
	
}