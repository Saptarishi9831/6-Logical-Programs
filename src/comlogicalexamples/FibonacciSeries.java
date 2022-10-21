package comlogicalexamples;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the no of terms:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The following fibonacci series is below:");
         Fibonacci(n);
    }
    public static void Fibonacci(int n)
    {
        int n1=0,n2=1,n3;
        System.out.print(n1+  " "  +n2);
        for(int i=2;i<n;i++)
        {
            n3=n1+n2;
            System.out.print(" " + n3);
            n1=n2;
            n2=n3;


        }
    }
}
