package classDemo;

public class Person {
	public String name;
	public String occupation;
	private int age;
	public String nationality;

	public void displayDetails() {
//		System.out.println("Name: " + name);
//		System.out.println("Occupation: " + occupation);
//		System.out.println("AGE: " + age);
//		System.out.println("Nationality: " + nationality);

		System.out.println("Hello I am " + name + " I am " + nationality + " and " + occupation + " and I am " + age
				+ " years old. ");
		System.out.println("I will be " + (getAge() + 1) + " next year");
		System.out.println("_______________________________________");
	}

	public void setAge(int age) {
		if (age >= 0 && age < 100) {
			this.age = age;

		} else {
			System.out.println("please enter a valid age");

		}
	}

	public int getAge() {
		return this.age;
	}
}
