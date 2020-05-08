// This class will now hide the variable name .. the public class cannot access directly the variable name

class Robot{
	private int age;
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
public class Demo2Class {
public static void main(String[] args) {
	Robot r1 = new Robot();
	r1.setName("Bumchick");
	r1.setAge(1);
	
	System.out.println(r1.getName());
	System.out.println(r1.getAge());
}
}
