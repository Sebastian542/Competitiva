import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CircleSquare {
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);

	 int casos=sc.nextInt();
		
	if(casos<=1000) {

			for(int i=1;i<=casos;i++) {
				double n1=sc.nextDouble();
				if(n1>0  && n1<=1000) {
					double ar=((Math.pow(n1+n1, 2))-(Math.PI*Math.pow(n1, 2)+Math.pow(10,-9)));
					
					BigDecimal mValue = new BigDecimal(ar);
					BigDecimal roundValue = mValue.setScale(2, RoundingMode.HALF_UP);
					System.out.println("Case "+i+": "+roundValue);
			}


		}
	}
	}

}