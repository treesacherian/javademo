
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

	@Override
	public String toString() {
		return "Garage [name=" + name + "\n" + " vehicles=" + vehicles + "]";
	}

	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(ArrayList<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public void fix() {
		int sum = 0;
		for (Vehicle vehicle : vehicles) {
			System.out.println("GARAGE BILL for " + vehicle.getClass() + ": " + vehicle.calcBill());
			sum += vehicle.calcBill();

		}
		System.out.println("Total Bill:" + sum);
	}

	public int count() {
		return this.vehicles.size();
	}
//	public void print() {
//		for (Vehicle vehicle : vehicles) {
//			vehicle.displayDetails();
//		}

//		}

}
