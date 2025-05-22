package acessmodifiers2;

import acessmodifiers.Animal;

public class Animal1 extends Animal {
	

	/*public void test() {
		System.out.println("testing if private method or variable accessible for  no same package &  subclass");
	}

	
	public static void main(String[] args) {
		Animal ani=new Animal();
		ani.eat();
		ani.test();
	/*	ani.jump();       
		int age2 = ani.age;
		System.out.println(age2);
		String st= ani.colour;
		System.out.println(st);  */
		
		/*Animal1 ann=new Animal1();
		ann.test();
		
		Animal an=new Animal1();
		an.test();// overridden method working in different pckage 
		
	}*/
	
	
	//PROTECTED ACCESS MODIFIERS
	/*public void test() {
		System.out.println("testing if protected method or variable accessible for  no same package &  subclass");
	}

	
	public static void main(String[] args) {  
		
		Animal1 ann=new Animal1();
		ann.test();
		ann.eat();
		ann.jump();
		int age2 = ann.age;
		System.out.println(age2);
		String st= ann.colour;
		System.out.println(st);
		
		Animal an=new Animal1();
		an.test();// overridden method working in different pckage 
		
		
		
		//PROTECTED ACCESS MODIFIERS
	/*public void test() {
		System.out.println("testing if protected method or variable accessible for  no same package &  subclass");
	}

	
	public static void main(String[] args) {  
		
		Animal1 ann=new Animal1();
		ann.test();
		ann.eat();
		ann.jump();
		int age2 = ann.age;
		System.out.println(age2);
		String st= ann.colour;
		System.out.println(st);
		
		Animal an=new Animal1();
		an.test();// overridden method working in different pckage 
		
	}*/
	
	
	//DEFAULT ACCESS MODIFIERS
		public void test() {
			System.out.println("testing if DEFAULT method or variable accessible for  no same package &  subclass");
		}

		
		public static void main(String[] args) {  
			
			Animal1 ann=new Animal1();
			ann.test();
			ann.eat();//NOT ACCESSIBLE
			ann.jump();
			int age2 = ann.age;
			System.out.println(age2);
			String st= ann.colour;
			System.out.println(st);
			
			Animal an=new Animal1();
			an.test();// overridden method working in different pckage 
			
		}
	
	
	
	
	
}


