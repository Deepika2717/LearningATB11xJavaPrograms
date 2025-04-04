package Increment_Decrement_Task;

public class Second_Largest {
    public static void main(String[] args) {
        int[] n = {1,10,89,56};
        System.out.print("Even Numbers: ");
        for (int number : n) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }

        System.out.print("\nOdd Numbers: ");
        for (int number : n) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        }
}
