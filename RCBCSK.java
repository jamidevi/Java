import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int diff;
		if(x>y){
		    diff=x-y;
		    if(diff>=18){
		        System.out.println("RCB");
		    }
		    else{
		        System.out.println("CSK");
		    }
		}
		else{
		    System.out.println("CSK");
		}
		sc.close();

	}
}
