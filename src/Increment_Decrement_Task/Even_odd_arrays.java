package Increment_Decrement_Task;

public class Even_odd_arrays {
    public static void main(String[] args) {
        int[] numbers = {2,3,6,9};

        for(int number : numbers)
        {

            if(number%2==0){
                System.out.println("Even numbers are:" +number);
            }
else {
                System.out.println("odd numbers are :" +number);
            }
        }
    }
}
