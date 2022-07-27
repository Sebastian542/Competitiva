import java.util.Iterator;
import java.util.Scanner;

public class HigherMath {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int casos=sc.nextInt();
		
		if(casos<200) {
		for (int i=1;i<=casos;i++) {
			
			double a=sc.nextInt();
			a=Math.pow(a, 2);
			double b=sc.nextInt();
			b=Math.pow(b, 2);
			double c=sc.nextInt();
			c=Math.pow(c, 2);

			double comp=a+b;
		
			if(a<1 && b<1 && c<1  ) {
			
				System.out.println("Case "+ i +": no");
				
			}else if(a>40000 || b>40000 || c>40000) {
				
				System.out.println("Case "+ i +": no");

			}
			
			else {
			
		if(comp==c) {
				
				System.out.println("Case "+ i +": yes");
				
			}else {
				
				System.out.println("Case "+ i +": no");
			}
					
		
		}
	
		}
		}
	}
}
