package classSamples.collections.MagazineRack;
//*******************************************************************
//  MagazineList.java       Author: Lewis/Loftus
//
//  Represents a collection of magazines.
//*******************************************************************

public class MagazineList {
	private MagazineNode list;

	// ----------------------------------------------------------------
	// Sets up an initially empty list of magazines.
	// ----------------------------------------------------------------
	public MagazineList() {
		list = null;
	}

	// ----------------------------------------------------------------
	// Creates a new MagazineNode object and adds it to the end of
	// the linked list.
	// ----------------------------------------------------------------
	public void add(Magazine mag) {
		MagazineNode node = new MagazineNode(mag);
		MagazineNode current;

		if (list == null)
			list = node;
		else {
			current = list;
			while (current.next != null)
				current = current.next;
			current.next = node;
		}
	}

	// ----------------------------------------------------------------
	// Returns this list of magazines as a string.
	// ----------------------------------------------------------------
	public String toString() {
		StringBuilder result = new StringBuilder();

		MagazineNode current = list;

		while (current != null) {
			result.append(current.magazine).append("\n");
			current = current.next;
		}

		return result.toString();
	}

	// *****************************************************************
	// An inner class that represents a node in the magazine list.
	// The public variables are accessed by the MagazineList class.
	// *****************************************************************
	private static class MagazineNode {
		public Magazine magazine;
		public MagazineNode next;

		// --------------------------------------------------------------
		// Sets up the node
		// --------------------------------------------------------------
		public MagazineNode(Magazine mag) {
			magazine = mag;
			next = null;
		}
	}
}
