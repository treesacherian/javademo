package encapsulation;

import classDemo.Person;

public class Encaps {
	public static void main(String[] args) {

		Person family1 = new Person();
		Person family2 = new Person();
		Person family3 = new Person();

		family1.name = "Jacob";
		family1.occupation = "employed ";
		family1.setAge(55);
		family1.nationality = "British";

		family2.name = "Samuel";
		family2.occupation = "Student ";
		family2.setAge(22);
		family2.nationality = "British ";

		family3.name = "Joshua";
		family3.occupation = "Student ";
		family3.setAge(17);
		family3.nationality = "British";

		Person[] familyMembers = { family1, family2, family3 };
		for (Person member : familyMembers) {
			member.displayDetails();
//			System.out.println("I will be " + member.setAge(member.getAge() + 1) + " next year");

		}
	}

}
