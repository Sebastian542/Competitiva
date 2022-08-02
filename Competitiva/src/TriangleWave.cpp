
#include <stdio.h>



int main() {
 
 int casos,n3,j,h,k,i;
scanf("%d",&casos);

		while(casos--) { 
			scanf("%d %d",&h,&n3);
		
		 for(i=0;i<n3;i++)
		  {
		 		for(j=0;j<h;j++) 
				 {
		 			for (k=0;k<=j;k++){
			           printf("%d",j+1);
			       }
			 		 printf("\n");
			   	 }
		 		for(j=h-2;j>=0;j--) {
		 			for (k=j;k>=0;k--)
					 {
		 				  printf("%d",j+1);
		 				}
		 				 printf("\n");
		 		}
		 		
		 		
		 		if(i<n3-1)
		 			printf("\n");	
			}
				 if(casos>0)
				 	printf("\n");
				 		   
	}
return 0;
	}
	
