package Increment_Decrement_Task;

public class Ternery_operator {

    //Take a user input 2 numbers from the arguments and
    // calculate the maximum in between with ternary operator.

    public static void main(String[] args) {

        int n1= Integer.parseInt(args[0]);
        int n2= Integer.parseInt(args[1]);


        System.out.println(n1);
        System.out.println(n2);

        String result = (n1>n2)?"n1 is greater":"n2 is greater";
        System.out.println(result);

    }
}
