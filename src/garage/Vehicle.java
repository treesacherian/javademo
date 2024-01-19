package garage;

import java.util.Objects;

public abstract class Vehicle {
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

	public abstract int calcBill();

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setNumberOfTyres(int numberOfTyres) {
		this.numberOfTyres = numberOfTyres;
	}

	public void setYearMade(int yearMade) {
		this.yearMade = yearMade;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (obj == null) {
//			return false;
//		}
//		if (getClass() != obj.getClass()) {
//			return false;
//		}
//		Vehicle other=(Vehicle)obj;
//		return Objects.equals(colour, other.colour) && numberOfTyres==other.numberOfTyres && yearMade==other.yearMade;
//		
//	}
//	

//	public void displayDetails() {
//		System.out.println("Colour: " + colour);
//		System.out.println("Number of Tyres: " + numberOfTyres);
//		System.out.println("Year of Manufacture: " + yearMade);
//		System.out.println();
//	}

	public String getColour() {
		return colour;
	}

	public int getNumberOfTyres() {
		return numberOfTyres;
	}

	public int getYearMade() {
		return yearMade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(colour, numberOfTyres, yearMade);
	}

	@Override
	public String toString() {
		return "colour=" + colour + ", numberOfTyres=" + numberOfTyres + ", yearMade=" + yearMade;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(colour, other.colour) && numberOfTyres == other.numberOfTyres
				&& yearMade == other.yearMade;
	}

}
