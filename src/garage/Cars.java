package garage;

public class Cars extends Vehicle {

	private boolean airBag;

	public Cars() {
	}

	public Cars(String colour, int numberOfTyres, int yearMade, boolean airBag) {
		setAirBag(airBag);
		setColour(colour);
		setNumberOfTyres(numberOfTyres);
		setYearMade(yearMade);

	}

	public void setAirBag(boolean airBag) {
		this.airBag = airBag;
	}

//	public void printCar() {
//		System.out.println("Airbag :" + airBag);
//	}

}
