package acessmodifiers;

public class Cat {
	
	/*public void test() {
		System.out.println("testing if private method or variable accessible for non subclass");
	}

	
	public static void main(String[] args) {
		Animal ani=new Animal();
		ani.eat();
/*		ani.jump();       private  non accessible within subclass
		int age2 = ani.age;
		System.out.println(age2);
		String st= ani.colour;
		System.out.println(st); */
		
	//PROTECTED ACEESS MODIFIER
	public void test() {
		System.out.println("testing if protected method or variable accessible for non subclass within same package");
	}

	
	public static void main(String[] args) {
		Animal ani=new Animal();
		ani.eat();
		ani.jump();// protected   accessible within non subclass, in different package
		ani.test();
		int age2 = ani.age;
		System.out.println(age2);
		String st= ani.colour;
		System.out.println(st);
		}
	
}
