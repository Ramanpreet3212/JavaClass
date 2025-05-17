package acess;

public class ClassA {

	String name= "Chandan";
	static String day= "monday";
	
	public void getCity() {
		
		System.out.println("i live in mississauga");
		
	}
	
	public static void getDay() {
		
		System.out.println("it is sunday");
		
	}
	
	public static void main(String[] args) {
		
		ClassA cls= new ClassA();
		
		cls.getCity();
		getDay();
		
		
		System.out.println(day);
		System.out.println(cls.name);
	}
	
}
