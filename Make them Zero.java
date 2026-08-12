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
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- >0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            st = new StringTokenizer(br.readLine());
            int bit = 0;
            for(int i = 0; i < n; i++)
            {
                int num = Integer.parseInt(st.nextToken());
                bit |= num;
                
            }
            System.out.println(Integer.bitCount(bit));
            
        }
	}
}
