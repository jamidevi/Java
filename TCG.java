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
		if(x>y){
		    System.out.println("Decreased");
		}
		else if(x<y){
		    System.out.println("Increased");
		}
		else{
		    System.out.println("Same");
		}

	}
}
