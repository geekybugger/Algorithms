// Topic: Static and Final
/*
 * Static
 * Variables and Methods
 * Unlike normal variables, static doesen't get multiple copies. It can have only one copy
 * Can be accessed using only class name.. static variables are also known as class variables.
 * Static methods can't output instance methods but instance methods can.
 */

class Thing{
	public final static int LUCKY_NUMBER = 9;
	public String name;
	public static String description;
	
	public static int count = 0;
	
	public Thing() {
		count++;
	}
	
	public void showName() {
		System.out.println(name);
		System.out.println(description); // Instance can access static var
	}
	
	public static void showInfo() {
		System.out.println("Hello");
		//System.out.println(name);  --> This will throw an error
	}
}

public class Demo4Project {
	public static void main(String[] args) {
		
		Thing.description = "I am a static man.. lol";
		System.out.println(Thing.description);
		
		Thing.showInfo();
		
		System.out.println("Count before  :" +Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Bobs";
		thing2.name = "Pops";
		
		thing1.showName();
		thing2.showName();
		
		System.out.println("Count After  :" +Thing.count);
		
		System.out.println(Math.PI);
		// Math.PI = 4; --> Throws error  (Use case of Final Static) :)
		
		System.out.println(Thing.LUCKY_NUMBER);
		
	}
}
