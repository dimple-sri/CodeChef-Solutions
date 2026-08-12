import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		while(T-- > 0)
		{
		    if(!st.hasMoreTokens())
		    {
		        st = new StringTokenizer(br.readLine());
		    }
		    int N = Integer.parseInt(st.nextToken());
		    int K = Integer.parseInt(st.nextToken());
		    int[] A = new int[N];
		    
		    st = new StringTokenizer(br.readLine());
		    for(int i = 0; i < N; i++)
		    {
		        A[i] = Integer.parseInt(st.nextToken());
		        
		    }
		    int oddCount = 0;
		    int validSubarrays = 0;
		    
		    for(int i = 0; i < K; i++)
		    {
		        if (A[i] % 2 != 0)
		        {
		            oddCount++;
		        }
		    }
		    
		    if (oddCount > 0)
		    {
		        validSubarrays++;
		        
		    }
		    
		    for (int i = K; i < N; i++)
		    {
		        if(A[i] % 2 != 0)
		        {
		            oddCount++;
		        }
		        if(A[i - K] % 2 != 0)
		        {
		            oddCount--;
		        }
		        if(oddCount > 0)
		        {
		            validSubarrays++;
		            
		        }
		    }
		    sb.append(validSubarrays).append("\n");
		}
		System.out.println(sb);

	}
}
