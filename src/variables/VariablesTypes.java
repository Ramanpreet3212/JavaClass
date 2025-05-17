package variables;


//static
//instance
//local
public class VariablesTypes {

	String name= "Raman";
	static String day= "sunday";

	public void test() {
		
		String naam ="gurpreet";
		System.out.println(naam);
		
	}
	
	public void myTest() {
		
		System.out.println(name);
		
	}
	
	
	
	public static void main(String[] args) {
		
		VariablesTypes vt = new VariablesTypes();
		System.out.println(day);
		System.out.println(vt.name);
		vt.test();
		vt.myTest();
	}
	
}
