class Person {
	//Unlike int, String is not a datatype in Java. Instead it is often infered as a class
	String name;
	int age;

	int getAge() {
		return age;
	}

	String getName() {
		return name;
	}
}

// IMP: There could be as many as public classes as we want, but there could be only one private class.
// the curly bracelets creates a new instance of that class
public class DemoClass {
	public static void main(String[] args) {
		Person p1 = new Person();

		p1.name = "Krishna";
		p1.age = 19;

		Person p2 = new Person();

		p2.name = "Bobs";
		p2.age = 5;

		System.out.println("Hello, I am " + p1.getName() + " and my age is " + p1.getAge());
		System.out.println("Hello, I am " + p2.getName() + " and my age is " + p2.getAge());
	}
}
