import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scanner = new Scanner(System.in);
		// your code goes here
        if (scanner.hasNextInt())
        {
            int T = scanner.nextInt();
            while (T--> 0)
            {
                int N = scanner.nextInt();
                int singleNumber = 0;
                for(int i = 0; i < N; i++)
                {
                    int val = scanner.nextInt();
                    singleNumber ^= val;
                    
                }
                System.out.println(singleNumber);
            }
        }
        scanner.close();
	}
}
