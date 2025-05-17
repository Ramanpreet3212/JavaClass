package controlstatement;

public class BreakStatement {
	
	public static void main(String[] args) {
		
		for(int i=0; i<=5;i++) {
			if(i==3) {
				
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("-------");
		
		int j=0;
		while(j<=5) {
			
			if(j==3) {
				break;
			}
			System.out.println(j);
			j++;
		}
		System.out.println("-----");
		
		
		int k=0;
		
		do {
			if(k==3) {
				break;
			}
			System.out.println(k);
			k++;
		}while(k<=5);
		
		
		
	}

}
