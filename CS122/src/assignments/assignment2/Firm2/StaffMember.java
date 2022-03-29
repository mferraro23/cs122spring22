package assignments.assignment2.Firm2;//********************************************************************
//  StaffMember.java       Author: Lewis/Loftus
//
//  Represents a generic staff member.
//********************************************************************

abstract public class StaffMember implements Payable{
	protected String name;
	protected String address;
	protected String phone;
	protected int vacationDays;

	// -----------------------------------------------------------------
	// Constructor: Sets up this staff member using the specified
	// information.
	// -----------------------------------------------------------------
	public StaffMember(String eName, String eAddress, String ePhone) {
		name = eName;
		address = eAddress;
		phone = ePhone;
	}

	// -----------------------------------------------------------------
	// Returns a string including the basic employee information.
	// -----------------------------------------------------------------
	public String toString() {
		String result = "Name: " + name + "\n";

		result += "\nAddress: " + address;
		result += "\nPhone: " + phone;

		return result;
	}

	// -----------------------------------------------------------------
	// Derived classes must define the pay method for each type of
	// employee.
	// -----------------------------------------------------------------
	public abstract double pay();

	@Override
	public int vacationDays() {
		vacationDays = 14;
		return vacationDays;
	}
	
}
