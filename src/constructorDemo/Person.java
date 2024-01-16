package constructorDemo;

public class Person {
	private String name;
	public String occupation;
	private int age;
	public String nationality;

//constructor that takes all values as parameters
	public Person(String name, String occupation, int age, String nationality) {
		setName(name);
		this.occupation = occupation;
		setAge(age);
		this.nationality = nationality;
	}

//constructor that takes no parameters. Values are assigned explicitly in the main method
	public Person() {
	}

	public void displayDetails() {
//			
		System.out.println("Hello I am " + name + " I am " + nationality + " and " + occupation + " and I am " + age
				+ " years old. ");
		System.out.println("I will be " + (getAge() + 1) + " next year");
		System.out.println("_______________________________________");
	}

	public void setName(String name) {
		this.name = name;
//		return (this.name);
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
