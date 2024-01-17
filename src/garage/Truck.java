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

	@Override
	public void displayDetails() {
		System.out.println("Trucks");
		super.displayDetails();
		System.out.println("length: " + length);
		System.out.println();
	}
}
