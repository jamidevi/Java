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
		int page;
		page=60/x;
		if(page>=5){
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}
		sc.close();

	}
}
