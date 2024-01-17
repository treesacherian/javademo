package garage;

public class Bike extends Vehicle {
	private boolean silencer;

	public Bike(String colour, int numberOfTyres, int yearMade, boolean silencer) {
		super(colour, numberOfTyres, yearMade);
		setSelencer(silencer);
		setColour(colour);
		setNumberOfTyres(numberOfTyres);
		setYearMade(yearMade);
	}

	public Bike() {
		super();

	}

	public void setSelencer(boolean silencer) {
		this.silencer = silencer;
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Bike");
		super.displayDetails();
		System.out.println("Has Silencer: " + this.silencer);
		System.out.println();
	}
}
