/*
Iterative Approach
  */
class Test {
   
    static int factorial(int n)
    {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }
    public static void main(String[] args)
    {
        int num = 5;
        System.out.println("Factorial of " + num + " is "
                           + factorial(5));
    }
}
/*Recursive Approach */
class Test {
  static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }
    public static void main(String[] args)
    {
        int num = 5;
        System.out.println("Factorial of " + num + " is "
                           + factorial(5));
    }
}
/*Using the Ternary operator */
class Factorial {
    int factorial(int n)
    {        return (n == 1 || n == 0) ? 1
                                  : n * factorial(n - 1);
    }
    public static void main(String args[])
    {
        Factorial obj = new Factorial();
        int num = 5;
        System.out.println("Factorial of " + num + " is "
                           + obj.factorial(num));
    }
}
/* Using BigInteger Approach */

import java.math.BigInteger;

public class Geeks {
    public static BigInteger factorial(int n) {
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }                

    public static void main(String[] args) {
        int num = 100;
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }
}



