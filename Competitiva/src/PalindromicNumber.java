import java.util.Scanner;

public class PalindromicNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int casos=sc.nextInt();
		if(casos<=20000) {
		for(int i=1;i<=casos;i++) {
			String num=sc.next();
			StringBuilder Inv = new StringBuilder(num);
			String invertida = Inv.reverse().toString();
			
		if(num.equals(invertida)) {
			
			System.out.println("Case "+i+": "+"Yes");

		}else {
			
			System.out.println("Case "+i+": "+"No");

		}
		}
		}		
		
	}

}
