
import java.util.*;
public class Main {
public static void main(String[] args) {
	  
	Deque<String> deque  = new LinkedList<String>();

	Scanner sc=new Scanner (System.in);
	int casos=sc.nextInt();
	int tam=sc.nextInt();
	int comtotal=sc.nextInt();
	for(int i=1;i<=casos;i++) {
	
		System.out.println("Case "+i+":");
		
	for(int b=0;b<=comtotal+1;b++) {	
		
	String comando=sc.next();
	
	if(comando.equals("pushLeft")) {
		
		  
		String comnum=sc.next();
		if(deque.size()!=tam) {
			deque.addLast(comnum);
		   System.out.println("Pushed in left: " +comnum);
		   
			
	}else {
		
		   System.out.println("The queue is full");
			  
	}
		
		
	}	
	
	if(comando.equals("pushRight")) {
	
			  String comnum=sc.next();
			  
				if(deque.size()!=tam) {
					
			  deque.addFirst(comnum);
			   System.out.println("Pushed in right: "+comnum);   
	}else {
		
		   System.out.println("The queue is full");
			  
	}
		  }
	
	
	if(comando.equals("popLeft")) {	
		 if(deque.isEmpty()) {	   
			  System.out.println("The queue is empty ");
		   }else {
	   System.out.println("Popped from left: " +deque.getLast());
		deque.removeLast();
	}
	}
	
	if(comando.equals("popRight")) {	
		  if(deque.isEmpty()) {	   
			  System.out.println("The queue is empty ");
		   }else {
		  
		   System.out.println("Popped from right: " +deque.getFirst());
		   deque.removeFirst();

		   }
	}
	
	}
	}
}
}



        
    
    
    
    
