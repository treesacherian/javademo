package constructorDemo;

public class ConstructorApp {
	public static void main(String[] args) {
		Person family1 = new Person("Jacob", "employed ", 55, "British");
		Person family2 = new Person();
		Person family3 = new Person();
// for the fields that are private, values need to be assigned using setters
		family2.setName("Samuel");
		family2.occupation = "Student ";
		family2.setAge(22);
		family2.nationality = "British ";

		family3.setName("Joshua");
		family3.occupation = "Student ";
		family3.setAge(17);
		family3.nationality = "British";

		Person[] familyMembers = { family1, family2, family3 };
		for (Person member : familyMembers) {
			member.displayDetails();

		}
	}
}
