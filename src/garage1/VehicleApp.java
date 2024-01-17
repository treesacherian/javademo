package garage1;

import java.util.ArrayList;

import garage.Bike;
import garage.Cars;
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

		Vehicle bike = new Bike("Red", 2, 2000, false);
		vehicles.add(bike);

		System.out.println("Size of the arrayList: " + vehicles.size());
//		removing specific item from the list
		vehicles.remove(bike);
		for (Vehicle vehicle : vehicles) {
			vehicle.displayDetails();
		}

//		Vehicle v = vehicles.get(vehicles.size() - 1);
		System.out.println("Using get method to get list item");
		vehicles.get(vehicles.size() - 1).displayDetails();

		Garage myGarage = new Garage("Cypress Glade");
//		Instead of the above line we can use the below two lines
//		Garage myGarage = new Garage();
//		myGarage.setName("Cypress Glade");

//		Vehicles can be added to myGarage using the 4 lines of code below
		Vehicle v1 = new Cars("Blue", 4, 2020, true);
		Vehicle v2 = new Truck("Yellow", 8, 2015, 15);
		myGarage.parkVehicle(v1);
		myGarage.parkVehicle(v2);
//		Vehicles can be added to myGarage using the   code below as well
		myGarage.parkVehicle(new Bike("Black", 2, 2020, true));

		System.out.println("Vehicles in garage");
		myGarage.displayDetails();

		myGarage.collectVehicle(v1);

		System.out.println("Vehicles remaining in garage after collection");
		myGarage.displayDetails();
		System.out.println("Garage Name is " + myGarage.getName());

	}
}
