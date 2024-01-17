package garage;

public class Cars extends Vehicle {

	private boolean airBag;

	public Cars() {
		super();
	}

	public Cars(String colour, int numberOfTyres, int yearMade, boolean airBag) {
		super(colour, numberOfTyres, yearMade);
		setAirBag(airBag);
		setColour(colour);
		setNumberOfTyres(numberOfTyres);
		setYearMade(yearMade);

	}

	public void setAirBag(boolean airBag) {
		this.airBag = airBag;
	}

	@Override
	public void displayDetails() {
		System.out.println("Cars");
		super.displayDetails();
		System.out.println("Airbag :" + airBag);
		System.out.println();
	}

}
