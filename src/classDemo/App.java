package classDemo;

public class App {

	public static void main(String[] args) {

		Person family1 = new Person();
		Person family2 = new Person();
		Person family3 = new Person();

		family1.name = "Jacob";
		family1.occupation = "employed ";
		family1.age = 55;
		family1.nationality = "British";

		family2.name = "Samuel";
		family2.occupation = "Student ";
		family2.age = 22;
		family2.nationality = "British ";

		family3.name = "Joshua";
		family3.occupation = "Student ";
		family3.age = 17;
		family3.nationality = "British";

		Person[] familyMembers = { family1, family2, family3 };
		for (Person member : familyMembers) {
			member.displayDetails();
		}
	}

}
