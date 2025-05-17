package acess;

public class ClassB {

	public static void main(String[] args) {
		
		ClassA.getDay();//calling static method of class a 
		
		ClassA cls= new ClassA();//calling non statics method of class a by creating obj
		cls.getCity();
		
		
		//calling variables
		
		String var= ClassA.day;
		System.out.println(ClassA.day);
	
		//calling non static variable
		
		
		
		System.out.println(cls.name);
		
		
	}
	
	
}
