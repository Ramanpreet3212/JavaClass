package switchstatement;

public class switchTwo {
	
	public static void main(String[] args) {
		switchTwo st=new switchTwo();
		st.dayOfTheWeek("Monday");
		String sg= st.dayOfTheWeek("Monday");//string as a return statement
		System.out.println(sg);
	}

	public String dayOfTheWeek(String dayOfTheWeek) {
		
		String statement="null";// if using string as a return statement
		
		switch(dayOfTheWeek) {
		
		case"Monday":{
			System.out.println("today is Monday");
			statement="hurray i found the day";//using string as a return statement
			break;
		}
		case"Tuesday":{
			System.out.println("Tuesday");
			break;
		}
		case"wednesday":{
			System.out.println("Wednesday");
			break;
		}
		case"Thursday":{
			System.out.println("thursday");
			break;
		}
		case"Friday":{
			System.out.println("Friday");
			break;
		}
		case"Saturday":{
			System.out.println("Saturday");
			break;
		}
		case"Sunday":{
			System.out.println("Sunday");
			break;
		}
		default:
			System.out.println("which day?");
			break;
		
		}
		
		return statement;
		
		
	}
	
	
}
