import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    String line = br.readLine();
		    if(line == null)    return;
		    int t = Integer.parseInt(line.trim());
		    StringBuilder sb = new StringBuilder();
		    while(t-- > 0)
		    {
		        StringTokenizer st = new StringTokenizer(br.readLine());
		        int n = Integer.parseInt(st.nextToken());
		        long[] a = new long[n];
		        st = new StringTokenizer(br.readLine());
		        for(int i=0;i<n;i++)
		        {
		            a[i] = Long.parseLong(st.nextToken());
		            
		        }
		        long maxL = Long.MIN_VALUE;
		        long minR = Long.MAX_VALUE;
		        boolean possible = true;
		        for(int i = 0; i <n; i++)
		        {
		            long v1 = a[i];
		            long v2 = a[n-1-i];
		            long diff = Math.abs(v1 - v2);
		            if(diff == 0)
		            {
		                continue;
		            }
		            else if(diff == 2)
		            {
		                long m = Math.min(v1,v2);
		                maxL = Math.max(maxL, m);
		                minR = Math.min(minR, m + 1);
		                
		            }
		            else
		            {
		                possible = false;
		                break;
		            }
		        }
		        if(possible && maxL <= minR)
		        {
		            sb.append("YES\n");
		            
		        }
		        else
		        {
		            sb.append("NO\n");
		        }
		        
		    }
		    System.out.println(sb.toString());
		    
	}
}
