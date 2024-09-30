import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int g=sc.nextInt();
		int s=sc.nextInt();
		int b=sc.nextInt();
		if(g<=5 & s<=5 & b<=5){
		    System.out.println((5-g)+(5-s)+(5-b));
		}

	}
}
