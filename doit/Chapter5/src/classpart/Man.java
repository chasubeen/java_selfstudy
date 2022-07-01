package classpart;

public class Man {
	int age;
	String name;
	boolean isMarried;
	int family;
	
	public static void main(String[] args) {
		Man per1 = new Man();
		per1.age = 40;
		per1.name = "James";
		per1.isMarried = true;
		per1.family = 3;
		
		System.out.println(per1.age);
		System.out.println(per1.name);
		System.out.println(per1.isMarried);
		System.out.println(per1.family);
		
	}

}
