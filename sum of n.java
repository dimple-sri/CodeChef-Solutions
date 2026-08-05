 /* Using Loop*/

public class Main
 {
   public static void main (String[]args)
   {

     int n = 10;
     int sum = 0;

     for (int i = 1; i <= n; i++)
         sum += i;
       System.out.println (sum);
   }
 }
 /*Using Formula */
public class Main
 {
   public static void main (String[]args)
   {

     int n = 10;

       System.out.println ( n*(n+1)/2);
   }
 }

/* Using Recursion*/

public class Main
{
  public static void main (String[]args)
  {

    int n = 10;
    int sum = getSum (n);

      System.out.println (sum);
  }

  static int getSum (int n)
  {
    if (n == 0)
      return n;

    return n + getSum (n - 1);
  }
}/*

