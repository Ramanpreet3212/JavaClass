package methodtypes;
//parameterised and non parameterised methods 
public class MethodTypes {

	public void add()
{
System.out.println(20+30);
}

public int addTwoNumbers(int a, int b) {
	int c= a+b;
	System.out.println(c);
	return c;
	
}

public String getCity() {
	
	return "Patiala";
		
}
public static void main(String[] args) {
	
	MethodTypes mt= new MethodTypes();
	mt.add();
	mt.addTwoNumbers(10,30);
	int number= mt.addTwoNumbers(20, 30);
	System.out.println(number);
	mt.getCity();
	String abc= mt.getCity();
	System.out.println(abc);
}



}
