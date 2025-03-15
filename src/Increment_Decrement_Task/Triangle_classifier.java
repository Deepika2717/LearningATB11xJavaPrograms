package Increment_Decrement_Task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Triangle_classifier {

    public static void main(String[] args) {

        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.

      //int T1 = Integer.parseInt(args[0]); - USING cli OPTIONS
       //int T2 = Integer.parseInt(args[1]); - USING cli OPTIONS
     // int T3 = Integer.parseInt(args[2]); - USING cli OPTIONS
//String T1 = args[0]; - USING cli OPTIONS
//String T2 = args[1]; - USING cli OPTIONS
//String T3 = args[2];- USING cli OPTIONS

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first side: ");
        int T1  = scanner.nextInt();
        System.out.println("enter the Second side: ");
        int T2  = scanner.nextInt();
        System.out.println("enter the Third side: ");
        int T3  = scanner.nextInt();

        if (T1 == T2 && T2 == T3)
        {

            System.out.println("Equilateral Triangle");
        }
    else if (T1 == T2 && T2 != T3) {

            System.out.println("isosceles Triangle");
    }
else
{
    System.out.println("scalene");
        }
    }
}
