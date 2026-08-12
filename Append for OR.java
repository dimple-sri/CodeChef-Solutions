import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String line = br.readLine();
		if(line == null) return;
		int t = Integer.parseInt(line.trim());
		StringBuilder sb = new StringBuilder();
	    while(t-- > 0)
	    {
	        String currLine = br.readLine();
	        while(currLine != null && currLine.trim().isEmpty())
	        {
	            currLine = br.readLine();
	            
	        }
	        if(currLine == null) break;
	        st = new StringTokenizer(currLine);
	        int n = Integer.parseInt(st.nextToken());
	        int y = Integer.parseInt(st.nextToken());
	        
	        int currentor = 0;
	        st = new StringTokenizer(br.readLine());
	        for(int i = 0; i < n; i++)
	        {
	        currentor |= Integer.parseInt(st.nextToken());
	        }
	        if ((currentor | y) == y)
	        {
	            int x = y & ~currentor;
	            sb.append(x).append("\n");
	        }
	        else{
	            sb.append(-1).append("\n");
	        }
	    }
	    System.out.println(sb);
	    
	}
}
