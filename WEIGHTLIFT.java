import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int b1=sc.nextInt();
		int b2=sc.nextInt();
		int c1=sc.nextInt();
		int c2=sc.nextInt();
		if(a1>=a2){
		    if(b1>=b2){
		        if(c1>=c2){
		            System.out.print(a1+b1+c1);
		        }
		        else{
		            System.out.println(a1+b1+c2);
		        }
		    }
		    else{
		         if(c1>=c2){
		            System.out.print(a1+b2+c1);
		        }
		        else{
		            System.out.println(a1+b2+c2);
		        }
		        
		    }
		}
		else{
		    if(b1>=b2){
		        if(c1>=c2){
		            System.out.print(a2+b1+c1);
		        }
		        else{
		            System.out.println(a2+b1+c2);
		        }
		    }
		    else{
		         if(c1>=c2){
		            System.out.print(a2+b2+c1);
		        }
		        else{
		            System.out.println(a2+b2+c2);
		        }
		        
		    }
		    
		}
		sc.close();
		

	}
}
