package inheritance;

public class Dog extends Animal {
	
	public void bark() {
		System.out.println("dog bark");
	}
	
	public void play() {
		System.out.println("dog play");
	}
	
	public void eat() {
		System.out.println("dog eat");
	}
	
	public static void main(String[] args) {
	Dog dg=new Dog();
	dg.bark();
	dg.play();
	dg.eat();
	dg.jump();//child can access parent method by object
	dg.see();
	
	Animal ani=new Animal();
	ani.eat();
	ani.jump();
	
	//Dog d =new Animal();// child cannot hold parent obj
	
	
	Animal an = new Dog();// parent can hold child obj
	an.jump();
	an.eat();//method overridden //can access child method coz accessing through child obj
	an.see();
	/*an.play();//cannot access child method
	an.bar();*/
}
}
