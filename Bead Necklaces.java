import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		if(!sc.hasNextInt())   return;
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		boolean[][] isPal = new boolean[n][n];
		for(int len =1; len <= n; len++)
		{
		    for(int i = 0;i <= n - len; i++)
		    {
		        int j = i+len - 1;
		        if(len == 1) isPal[i][j] = true;
		        else if(len == 2) isPal[i][j] = (arr[i] == arr[j]);
		        else isPal[i][j] = (arr[i]== arr[j] && isPal[i+1][j-1]);
		        
		        
		    }
		}
		int [] dp = new int[n];
		for (int i = 0; i < n; i++)
		{
		    if(isPal[0][i])
		    {
		        dp[i] = 1;
		    }
		    else
		    {
		        dp[i] = Integer.MAX_VALUE;
		        for(int j = 0; j < i; j++)
		        {
		            if(isPal[j+1][i]&&dp[j] != Integer.MAX_VALUE)
		            {
		                dp[i] = Math.min(dp[i], dp[j]+1);
		                
		            }
		        }
		        
		    }
		}
		
            System.out.println(dp[n - 1]);
	}
}
