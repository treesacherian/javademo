package garage;

public class Vehicle {
	private String colour;
	private int numberOfTyres;
	private int yearMade;

	public Vehicle() {
		super();
	}

	public Vehicle(String colour, int numberOfTyres, int yearMade) {
		super();
		setColour(colour);
		setNumberOfTyres(numberOfTyres);
		setYearMade(yearMade);
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setNumberOfTyres(int numberOfTyres) {
		this.numberOfTyres = numberOfTyres;
	}

	public void setYearMade(int yearMade) {
		this.yearMade = yearMade;
	}

	public void displayDetails() {
		System.out.println("Colour: " + colour);
		System.out.println("Number of Tyres: " + numberOfTyres);
		System.out.println("Year of Manufacture: " + yearMade);
//		System.out.println();
	}

}
