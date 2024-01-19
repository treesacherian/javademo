package garage1;

import java.util.ArrayList;

import garage.Bike;
import garage.Cars;
import garage.Garage;
import garage.Truck;
import garage.Vehicle;

public class VehicleApp {

	public static void main(String[] args) {

		ArrayList<Vehicle> vehicles = new ArrayList<>();

		vehicles.add(new Cars("Blue", 4, 2020, true));
		vehicles.add(new Truck("Yellow", 8, 2015, 15));
		vehicles.add(new Bike("Black", 2, 2020, true));
		vehicles.add(new Truck("Brown", 8, 2019, 25));
//		vehicles.add(new Bike("Red", 2, 2000, false));
// Vehicles can be added to array list using the below method as well
		Vehicle bike = new Bike("Red", 2, 2000, false);
		vehicles.add(bike);

		System.out.println("Size of the arrayList: " + vehicles.size());
//		removing specific item from the list

		for (Vehicle vehicle : vehicles) {
//			vehicle.displayDetails(); This method is longer needed as the toString() method is used
			System.out.println(vehicle);
		}

		System.out.println();
		System.out.println("COST of INDIVIDUAL VEHICLES");
		for (Vehicle vehicle : vehicles) {
			System.out.println("BILL for " + vehicle.getClass() + ": " + vehicle.calcBill());

		}
		vehicles.remove(bike);

		System.out.println();
		System.out.println("Vehicles in vehicle list after removing bike");
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
		System.out.println();
//		Vehicle v = vehicles.get(vehicles.size() - 1);
//		System.out.println("Using get method to get list item");
//		vehicles.get(vehicles.size() - 1).displayDetails();
//		displayDetails() is no longer needed as the toString() method is used

		Garage myGarage = new Garage("Cypress Glade");
		// Instead of the above line we can use the below two lines
//		Garage myGarage = new Garage();
//		myGarage.setName("Cypress Glade");

//		Vehicles can be added to myGarage using the 4 lines of code below
		Vehicle v1 = new Cars("Blue", 4, 2020, true);
		Vehicle v2 = new Truck("Yellow", 8, 2015, 15);
		myGarage.parkVehicle(v1);
		myGarage.parkVehicle(v2);
//		Vehicles can be added to myGarage using the   code below as well
		myGarage.parkVehicle(new Bike("Black", 2, 2020, true));

		Vehicle v3 = new Cars("Blue", 4, 2020, true);
		Vehicle v4 = new Truck("Yellow", 8, 2015, 15);
		myGarage.parkVehicle(v3);
		myGarage.parkVehicle(v4);

		System.out.println(" Vehicles in garage: " + myGarage.count());
//		myGarage.print(); 
//		print() method is replaced by the toString() method
		System.out.println(myGarage);
		System.out.println();
		myGarage.fix();
		System.out.println();

		myGarage.collectVehicle(new Bike("Black", 2, 2020, true));

		System.out.println("Vehicles remaining in garage after collection: " + myGarage.count());
//		myGarage.print();
		System.out.println(myGarage);
		System.out.println("Garage Name is " + myGarage.getName() + "\n");
		System.out.println("v2==v4:" + (v2 == v4));
		System.out.println("v1==v3:" + (v2 == v4));

		System.out.println("v1.equals(v3):" + v1.equals(v3));
		System.out.println("v2.equals(v4):" + v2.equals(v4) + "\n");

		if (v1.equals(v3))
			myGarage.collectVehicle(v3);
		if (v2.equals(v4))
			myGarage.collectVehicle(v4);
		System.out.println();

		System.out.println("Vehicles remaining in garage after collection: " + myGarage.count());
//		myGarage.print();
		System.out.println(myGarage + "\n");

		System.out.println();
		myGarage.fix();
	}
}
