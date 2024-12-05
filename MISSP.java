import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner read=new Scanner(System.in);
		int t=read.nextInt();
	    for(int k=0;k<t;k++){
		    int n=read.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=read.nextInt();
		        
		    }
		    int ans=0;
		    for(int i=0;i<n;i++){
		        ans ^=arr[i];
		    }
		    System.out.println(ans);
		       
		        
		    }
		    read.close();
		    
		    
		

	}
}
