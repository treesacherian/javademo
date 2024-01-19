
// This file is no longer correct. Correct main() is in garage1.VehicleApp
package garage;

public class VehicleApp {

	public static void main(String[] args) {

		Vehicle passengerVehicle = new Vehicle("red", 4, 2015);
		Vehicle logisticCarriers = new Vehicle("Gray", 8, 2020);
		Vehicle businessVehicles = new Vehicle();
		businessVehicles.setColour("Black");
		businessVehicles.setNumberOfTyres(6);
		businessVehicles.setYearMade(2022);

//		passengerVehicle.displayDetails();
//		logisticCarriers.displayDetails();
//		businessVehicles.displayDetails();

		Cars car1 = new Cars("Blue", 4, 2020, true);
		Cars car2 = new Cars("Green", 4, 2000, false);
		Cars car3 = new Cars("White", 4, 2024, true);
		Cars[] carsList = { car1, car2, car3 };
		for (Cars car : carsList) {
			car.displayDetails();
//			car.printCar();
		}

		Truck truck1 = new Truck("Yellow", 8, 2015, 15);
		Truck truck2 = new Truck("Brown", 8, 2019, 25);

		Truck[] truckList = { truck1, truck2 };
		for (Truck truck : truckList) {
			truck.displayDetails();
		}

		Bike bike1 = new Bike("Black", 2, 2020, true);
		Bike bike2 = new Bike("Red", 2, 2000, false);

		Bike[] bikeList = { bike1, bike2 };
		for (Bike bike : bikeList) {
			bike.displayDetails();
		}

		Vehicle v1[] = { new Cars("Black", 4, 2014, true), new Bike("Blue", 2, 2018, false),
				new Truck("Green", 8, 2022, 150) };

		for (Vehicle v : v1) {
			v.displayDetails();
		}
	}
}
