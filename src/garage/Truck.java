package garage;

public class Truck extends Vehicle {
	private int length;

	public Truck(String colour, int numberOfTyres, int yearMade, int length) {
		super(colour, numberOfTyres, yearMade);
		setLength(length);
		setColour(colour);
		setNumberOfTyres(numberOfTyres);
		setYearMade(yearMade);
	}

	public Truck() {
		super();
	}

	public void setLength(int length) {
		this.length = length;
	}

//	@Override
//	public void displayDetails() {
//		System.out.println("Trucks");
//		super.displayDetails();
//		System.out.println("length: " + length);
//		System.out.println();
//	}

	public int getLength() {
		return length;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Truck other = (Truck) obj;
		return length == other.length;
	}

	@Override
	public int calcBill() {
		return this.length * 100;
	}

	@Override
	public String toString() {
		return "Truck [length=" + length + ",Colour=" + getColour() + ", NumberOfTyres=" + getNumberOfTyres()
				+ ", Year of first registration=" + getYearMade() + "]" + "\n";
	}

}
