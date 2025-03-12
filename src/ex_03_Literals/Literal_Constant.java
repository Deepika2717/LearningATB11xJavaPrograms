package ex_03_Literals;

public class Literal_Constant {

    public static void main(String[] args) {

        int length= 67;
        length= 69;
// This is Literal and can be changed anywhere in the program
        final float pi= 3.14F;
        // This is constant , cannot be changed as final is added
        System.out.println(length);
        System.out.println(pi);
    }
}
