package garage;

public class Bike extends Vehicle {
	private boolean silencer;

	public Bike(String colour, int numberOfTyres, int yearMade, boolean silencer) {
		super(colour, numberOfTyres, yearMade);
		setSilencer(silencer);
		setColour(colour);
		setNumberOfTyres(numberOfTyres);
		setYearMade(yearMade);
	}

	public Bike() {
		super();

	}

	public void setSilencer(boolean silencer) {
		this.silencer = silencer;
	}

//	@Override
//	public void displayDetails() {
//		// TODO Auto-generated method stub
//		System.out.println("Bike");
//		super.displayDetails();
//		System.out.println("Has Silencer: " + this.silencer);
//		System.out.println();
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bike other = (Bike) obj;
		return silencer == other.silencer;
	}

	@Override
	public String toString() {
		return "Bike [silencer=" + silencer + ", Colour=" + getColour() + ", NumberOfTyres=" + getNumberOfTyres()
				+ ", Year of registration=" + getYearMade() + "]" + "\n";
	}

	@Override
	public int calcBill() {
		return 100;
	}
}
