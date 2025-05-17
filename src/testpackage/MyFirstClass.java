package testpackage;

public class MyFirstClass {
	
	public static void speak() {

		System.out.println("face speaks");
		MyFirstClass refvar= new MyFirstClass();// method can call another method.
		refvar.sleep();
		}

	public void sleep() {
		
		System.out.println("eyes sleep");
		speak(); //non static calling static you don't need obj.
	}
	
	
	public static void main(String[] args) {
		
		MyFirstClass refvar= new MyFirstClass();// obj created here to call non static method
		
		refvar.sleep();
		speak();
		
	}
	
	
	
	
}
