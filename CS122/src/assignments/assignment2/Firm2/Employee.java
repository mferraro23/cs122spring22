package assignments.assignment2.Firm2;//********************************************************************
//  Employee.java       Author: Lewis/Loftus
//
//  Represents a general paid employee.
//********************************************************************

public class Employee extends StaffMember {
	protected String socialSecurityNumber;
	protected double payRate;
	//protected int vacationDays;

	// -----------------------------------------------------------------
	// Constructor: Sets up this employee with the specified
	// information.
	// -----------------------------------------------------------------
	public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		super(eName, eAddress, ePhone);

		socialSecurityNumber = socSecNumber;
		payRate = rate;
		//vacationDays = eVacationDays;
		
		
	}

	// -----------------------------------------------------------------
	// Returns information about an employee as a string.
	// -----------------------------------------------------------------
	public String toString() {
		String result = super.toString();

		result += "\nSocial Security Number: " + socialSecurityNumber;
		result += "\nVaction Days: " + vacationDays();

		return result;
	}

	// -----------------------------------------------------------------
	// Returns the pay rate for this employee.
	// -----------------------------------------------------------------
	public double pay() {
		return payRate;
	}

	public int vacationDays() {
		vacationDays = 14;
		return vacationDays;
	}
}
