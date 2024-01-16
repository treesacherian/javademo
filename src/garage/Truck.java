package garage;

public class Truck extends Vehicle {
	private int length;

	public Truck(String colour, int numberOfTyres, int yearMade, int length) {
		setLength(length);
		setColour(colour);
		setNumberOfTyres(numberOfTyres);
		setYearMade(yearMade);
	}

	public Truck() {

	}

	public void setLength(int length) {
		this.length = length;
	}
}
