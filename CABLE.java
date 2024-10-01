import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int x=sc.nextInt();
		int cbo,cb;
		cbo=a*b*c;
		cb=x*x*x;
		if(cbo>cb){
		    System.out.println("cuboid");
		}
		else if(cbo<cb){
		    System.out.println("Cube");
		}
		else{
		    System.out.println("Equal");
		}
		sc.close();

	}
}
