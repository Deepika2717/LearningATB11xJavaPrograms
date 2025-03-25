package Increment_Decrement_Task;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        String name = sc.next();
        String newname = reverseString(name);

        if (newname.equalsIgnoreCase(name)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }


    }

    private static String reverseString(String name) {
        String reversed = "";
        for (int i = name.length() -1; i >= 0; i--) {
            reversed = reversed + name.charAt(i);
        }
        return reversed;
    }
}
