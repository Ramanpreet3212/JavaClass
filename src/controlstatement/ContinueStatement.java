package controlstatement;

public class ContinueStatement {
	public static void main(String[] args) {
		
		for(int i=1; i<=5;i++) {
			if(i==3) {
				continue;
				}
			System.out.println(i);
		}
		
		System.out.println("----");
		
		
		int j=0;
		while(j<5) {
			j++;
			if(j==2) {
				continue;
			}
			System.out.println(j);
			
		}
		System.out.println("-------");
		
		
		int k=0;
		do {
			k++;
			if(k==4) {
				continue;
			}
			System.out.println(k);
		}while(k<=5);
		
		
		System.out.println("-----");
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
	
	
	

	
	
	


