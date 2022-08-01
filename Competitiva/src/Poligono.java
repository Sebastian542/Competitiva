import java.util.Scanner;

public class Poligono {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int casos=sc.nextInt();
		
		if(casos<=1000) {
			for(int i=1;i<=casos;i++) {
				
				int x1=sc.nextInt();
				int y1=sc.nextInt();
				int x2=sc.nextInt();
				int y2=sc.nextInt();
				int x3=sc.nextInt();
				int y3=sc.nextInt();
				int opy=(y1+y3)-y2;
				int opx=(x1-x2)+x3;

				int oparea1=((x1*y2)+(x2*y3)+(x3*opy)+(opx*y1));
				int oparea2=((x2*y1)+(x3*y2)+(opx*y3)+(x1*opy));


				int oparea=(int) (Math.abs(oparea1-oparea2)*0.5);
				
				System.out.println("Case "+i+": "+opx+" "+opy+" "+oparea);
				
			}
		
			
		}
			
			
		}
		

}
