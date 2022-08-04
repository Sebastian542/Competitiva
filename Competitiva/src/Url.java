
import java.util.Scanner;

public class Url {
	
	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner (System.in);
		
		int casos=sc.nextInt();
		if(casos<=20) {
		for(int i=1;i<=casos;i++) {
		
		String def="";
		String url=sc.next();
		String[] parts = url.split(":");  
		String compl=parts[1];
		System.out.println("Case "+i+": "+"https:"+compl);

		}
		}
	}

}
