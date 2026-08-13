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
		if(line == null || line.trim().isEmpty())   return;
		int t = Integer.parseInt(line.trim());
		StringBuilder sb = new StringBuilder();
		while(t-- > 0)
		{
		    String input = br.readLine();
		    while(input != null && input.trim().isEmpty())
		    {
		        input = br.readLine();
		    }
		    if(input == null)   break;
		    
		    long x = Long.parseLong(input.trim());
		    long reversed = 0;
		    for(int i = 0; i < 32; i++)
		    
		    {
		        reversed = (reversed << 1) | (x & 1);
		        x >>=1;
		    }
		    sb.append(reversed).append("\n");
		    
		}
		System.out.println(sb);

	}
}
