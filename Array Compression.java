import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++)
        {
            A[i] = sc.nextInt();
        }
        int count = 1;
        for(int i= 1; i < N; i++)
        {
            if(A[i] != A[i - 1])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
