package assignments.assignment2.Firm2;//********************************************************************
//  Volunteer.java       Author: Lewis/Loftus
//
//  Represents a staff member that works as a volunteer.
//********************************************************************

public class Volunteer extends StaffMember {
	// -----------------------------------------------------------------
	// Constructor: Sets up this volunteer using the specified
	// information.
	// -----------------------------------------------------------------
	public Volunteer(String eName, String eAddress, String ePhone) {
		super(eName, eAddress, ePhone);
	}

	public String toString() {
		String result = super.toString();
		result += "\nVacation Days: " + vacationDays();
		return result;
	}

	// -----------------------------------------------------------------
	// Returns a zero pay value for this volunteer.
	// -----------------------------------------------------------------
	public double pay() {
		return 0.0;
	}
	
	public int vacationDays() {
		vacationDays = 0;
		return vacationDays;
	}
}
