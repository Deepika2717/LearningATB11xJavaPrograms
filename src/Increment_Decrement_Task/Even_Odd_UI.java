package Increment_Decrement_Task;

import java.util.Scanner;

public class Even_Odd_UI {
    //Take user input & Check weather the input is even or odd number
    public static void main(String[] args) {

          int n1 = Integer.parseInt(args[0]);
       // String n1 = args[0];
       // Scanner scanner = new Scanner(System.in);
       // System.out.println("Enter a Number : ");
       // int n1 = scanner.nextInt();

        if (n1%2==0) {

            System.out.println("even number");
        }
        else
        {
            System.out.println("odd number");

        }
    }
}
