package acessmodifiers2;


public class Dog1 {

	/*public void test() {
		System.out.println("testing if private method or variable accessible for  no same package &  non subclass");
	}

	
	public static void main(String[] args) {
		Dog1 ani=new Dog1();
		//ani.eat();
		ani.test();
		//ani.jump();       
		/*int age2 = ani.age;
		System.out.println(age2);
		String st= ani.colour;
		System.out.println(st);  */
	



//PROTECTED ACCESS MODIFIERS
/*	public void test() {
	System.out.println("testing if protected method or variable accessible for  no same package &  non subclass");
}


public static void main(String[] args) {
	Dog1 ani=new Dog1();
	/*ani.eat();
				protected not accessible in diff package non subclass
	ani.jump();       
	int age2 = ani.age;
	System.out.println(age2);
	String st= ani.colour;
	System.out.println(st);  */
	//ani.test();	

	
	
	//DEFAULT ACCESS MODIFIERS
		public void test() {
		System.out.println("testing if DEFAULT method or variable accessible for  no same package &  non subclass");
	}


	public static void main(String[] args) {
		Dog1 ani=new Dog1();
		ani.eat();
					//DEFAULT not accessible in diff package non subclass
		ani.jump();       
		int age2 = ani.age;
		System.out.println(age2);
		String st= ani.colour;
		System.out.println(st);  
		ani.test();	
}
