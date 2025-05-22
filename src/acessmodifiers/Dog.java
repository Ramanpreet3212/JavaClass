package acessmodifiers;

public class Dog extends Animal {
	
	/*public void test() {
		System.out.println("tested");
	}
	
	public static void main(String[] args) {

		Animal ani=new Animal();
		ani.eat();
		ani.test();
		//ani.jump(); private method cannot be accessible outside class/ or child class
		
		Animal anii= new Dog();
		anii.test();//overridden method
		
	}*/

	//PROTECTED ACCESS MODIFIER
	
	public void test() {
		System.out.println("tested");
	}
	
	public static void main(String[] args) {

		Animal ani=new Animal();
		ani.eat();
		ani.test();
		ani.jump(); //PROTECTED method can be accessible outside class and child class
		
		Animal anii= new Dog();
		anii.test();//overridden method
}
}
