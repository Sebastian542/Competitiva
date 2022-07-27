import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class DireccionIP {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int casos=sc.nextInt();
		
		if(casos<=100) {
			for (int i=1;i<=casos;i++) {
				
				ArrayList<String> n1almc = new ArrayList<String>();
				ArrayList<String> n2almc = new ArrayList<String>();

				String n1=sc.next();
				
				String[] partN1 = n1.split("[.]"); 
				
				String n2=sc.next();
				
				String[] partN2 = n2.split("[.]"); 

				for (int j=0;j<=3;j++) {
		
					int n=Integer.parseInt(partN1[j]);
					String binaryn = Integer.toBinaryString( n);
					n1almc.add(binaryn);
				}
				
				for (int j=0;j<=3;j++) {
				
					int foo = Integer.parseInt(partN2[j], 2);
					String binaryn2 = Integer.toBinaryString(foo);
					n2almc.add(binaryn2);
				}
				
		
				if(n1almc.equals(n2almc)) {

					System.out.println("Case "+i+ ":"+" Yes");
				
			}else {
				
				System.out.println("Case "+i+ ":"+" No");

			}
			
			
		}	
		}
	}
			
}
			
			
	
