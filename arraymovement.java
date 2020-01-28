import java.util.*;
public class arraymovement {

	public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       int d=0;
       int count=0;
       int rows=sc.nextInt();
       int col=sc.nextInt();
       int b=rows*col;
       int c[]=new int[b];
       int a[][]=new int[rows][col];
       for(int i=0;i<rows;i++)
       {
    	   for(int j=0;j<col;j++)
    	   {
    		   a[i][j]=sc.nextInt();
    	   }
       }
      
    	   for(int i=0;i<rows;i++)
    	   {
    		   for(int j=0;j<col;j++)
    		   {
    				   c[d]=a[i][j]*a[i][j];
                       d++;   			   
    		   }
    	   }
    	   for(int i=0;i<c.length-1;i++)
    	   {
    		   if(c[i]<c[i+1])
    		   {
    			   count++;
    		   }
    	   }
    	   System.out.print(count);
    		 
       
	}

}
