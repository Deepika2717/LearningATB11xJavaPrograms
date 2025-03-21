package Increment_Decrement_Task;

import java.util.Scanner;

public class Fibonacci {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fibonacci number:" );
    int n = sc.nextInt();

    int f1 = 1;
    int f2= 2;
        for(int i =0;i<n;i++)
    {
        int fn = f1+f2;
        System.out.println("series is: " +fn);
        f1=f2;
        f2=fn;

    }


}
}
