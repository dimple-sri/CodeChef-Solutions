import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt())
		{
		    int n = sc.nextInt();
		    n = n | (1 << 0);
		    n = n & ~(1 << 1);
		    n = n ^ (1 << 2);
		    System.out.println(n);
		}

	}
}
