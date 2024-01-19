package garage;

import java.util.Objects;

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

//	@Override
//	public void displayDetails() {
//		System.out.println("Cars");
//		super.displayDetails();
//		System.out.println("Airbag :" + airBag);
//		System.out.println();
//	}

	@Override
	public int hashCode() {
		return Objects.hash(airBag);
	}

	@Override
	public String toString() {
		return "Cars [airBag=" + airBag + ", Colour=" + getColour() + ", NumberOfTyres=" + getNumberOfTyres()
				+ ", Year of registration=" + getYearMade() + "]" + "\n";
	}

	public boolean isAirBag() {
		return airBag;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cars other = (Cars) obj;
		return airBag == other.airBag;
	}

	@Override
	public int calcBill() {
		return 1000;
	}

}
