class Machine{
	private String name;
	private int code;
	// When we initialize a function inside a class with identical name, then it is called as a constructor
	public Machine() {
		// this here calls the third constructor
		// It should be always written in the first line of the constructor
		this("Camdy",0);
		System.out.println("Hi there, I'm the constructor");
		name = "Annie";
				
	}
	// Function name is not limited to just once, we can create multiple function with identical name.
	// Here, the java would figure out the constructor using parameters just bycalling the consrtructor
	public Machine(String name) {
		System.out.println("Second Constructor is my identity");
		this.name = name;
	}
	// Here machine could understand that if we enter two parameters, we are calling the third constructor
	public Machine(String name, int code) {
		System.out.println("Third constructor... Well that's what peple call me");
		this.name = name;
		this.code = code;
	}
	
	
}
public class Demo3Project {
	public static void main(String[] args) {
		Machine m1 = new Machine();
		new Machine("becky");
	}
}
