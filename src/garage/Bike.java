package garage;

public class Bike extends Vehicle {
	private boolean silencer;

	public Bike(String colour, int numberOfTyres, int yearMade, boolean silencer) {
		setSelencer(silencer);
		setColour(colour);
		setNumberOfTyres(numberOfTyres);
		setYearMade(yearMade);
	}

	public Bike() {

	}

	public void setSelencer(boolean silencer) {
		this.silencer = silencer;
	}
}
