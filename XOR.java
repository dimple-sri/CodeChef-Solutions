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
        int n = Integer.parseInt(line.trim());
        int[] counts = new int[10];
        for(int i=0; i < n; i++)
        {
            String s = br.readLine().trim();
            for(int j = 0; j < 10; j++)
            {
                if (s.charAt(j) == '1')
                {
                    counts[j]++;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for(int j = 0; j < 10; j++)
        {
            if(counts[j] % 2 != 0)
            {
                result.append('1');
            }
            else{
                result.append('0');
            }
        }
        System.out.println(Integer.parseInt(result.toString(),2));
	}
}
