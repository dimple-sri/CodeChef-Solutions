import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][2];
		for(int i =0; i <n; i++)
		{
		    for(int j = 0;j < 2; j++)
		    {
		        a[i][j] = sc.nextInt();
		    }
		}
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
		    if((a[i][0] == x && a[i][1] == y) || (a[i][0] == y && a[i][1] == x))
		    {
		        System.out.println("Yes");
		        return;
		    }
		}
        System.out.println("No");
	}
}
