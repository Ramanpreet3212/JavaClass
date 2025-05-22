package acessmodifiers;

public class Animal {

		/*private String colour="Brown";
		private int age=20;

	private void jump() {
		System.out.println("animal jump");
		
	}
	public void eat() {
		System.out.println("animal eat");
	}
	public void test() {
		
		jump();//private method accessible within class
		System.out.println(colour);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		Animal ani=new Animal();
		ani.jump();
		int age2 = ani.age;
		System.out.println(age2);
		String st= ani.colour;
		System.out.println(st);
		
		
	
	System.out.println("---------"); 
}
	*/
		
	
	//PROTECTED ACCESS MODIFIER
	protected String colour="red";
	protected int age=50;

protected void jump() {
	System.out.println("animal jump");
	
}
protected void eat() {
	System.out.println("animal eat");
}
public void test() {
	
	jump();//protected method accessible within class
	System.out.println(colour);
	System.out.println(age);
}

public static void main(String[] args) {
	Animal ani=new Animal();
	ani.jump();
	ani.test();
	ani.eat();
	int age2 = ani.age;
	System.out.println(age2);
	String st= ani.colour;
	System.out.println(st);
	
		
}	
		
}
