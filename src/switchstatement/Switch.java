package switchstatement;

public class Switch {
	
	public static void main(String[] args) {
		
		Switch sw=new Switch();
		sw.dayOfTheWeek("Thursday");
		
	}
	
	public void dayOfTheWeek(String dayOfTheWeek) {
		
		
		//String day="Sunday";
		
		if(dayOfTheWeek.equals("Monday")) {
			System.out.println("it's Monday");
		}
		
		if(dayOfTheWeek.equals("Tuesday")) {
			System.out.println("it's Tuesday");
		}
		
		if(dayOfTheWeek.equals("Wednesday")) {
			System.out.println("it's wednesday");
		}
		if(dayOfTheWeek.equals("Thursday")) {
			System.out.println("it's Thursday");
		}
		if(dayOfTheWeek.equals("Friday")) {
			System.out.println("it's Friday");
		}
		if(dayOfTheWeek.equals("Staurday")) {
			System.out.println("it's Saturday");
		}
		if(dayOfTheWeek.equals("Sunday")) {
			System.out.println("it's Sunday");
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
