import java.util.Scanner;

public class ParenthesesBalance {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		int casos=sc.nextInt();
		
		
		for(int i=0;i<casos;i++) {
			
		String secuencia=sc.next();
		secuencia.isEmpty();
		int op=secuencia.length() ;
		
		if(op==0) {
			System.out.println("Yes");
			
		}
		if(op %2==0) {
			
			System.out.println("Yes");
			
		}else {
			
			System.out.println("No");
			
		}
		
		}
	}

}
