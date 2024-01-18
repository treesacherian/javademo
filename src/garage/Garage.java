
package garage;

import java.util.ArrayList;

public class Garage {
	private String name;
	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public Garage() {
		super();
	}

	public Garage(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void parkVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public void collectVehicle(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}

	public void print() {
		for (Vehicle vehicle : vehicles) {
			vehicle.displayDetails();
		}
	}

}
