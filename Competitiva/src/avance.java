import java.util.Scanner;

public class avance {
	

		int a, b, c, d, e,f;
	
	public static void main(String[] args) {
	
		
		avance fn = new avance();

			Scanner sc=new Scanner(System.in);
		 int n, cases;
		    cases=sc.nextInt();
		    for (int caseno = 1; caseno <= cases; ++caseno) {
		    	
		    	int a=sc.nextInt();
		    	int b=sc.nextInt();
		    	int c=sc.nextInt();
		    	int d=sc.nextInt();
		    	int e=sc.nextInt();
		    	int f=sc.nextInt();
		    	
		    	System.out.println("traje de fn"+fn%10000007);
		  //  	int op=fn(n)%10000007;
	//	 System.out.println("Case "+fn%10000007);
		//        printf("Case %d: %d\n", caseno+7);
		    }
	}

public int fn(int n ) {
	   if (n == 0) return a;
	    if (n == 1) return b;
	    if (n == 2) return c;
	    if (n == 3) return d;
	    if (n == 4) return e;
	    if (n == 5) return f;
	    return fn(n-1) + fn(n-2) + fn(n-3) + fn(n-4) + fn(n-5) + fn(n-6);
		
	}
}
