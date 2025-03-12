package ex_02_Variables;

public class Operations_using_printf {

    public static void main(String[] args) {

        byte ab= 6;

        System.out.printf("%d+7=%d%n", ab,(ab+7));
        System.out.printf("%d-3=%d%n",ab,(ab-3));
        System.out.printf("%d*4=%d%n",ab,(ab*4));
       // System.out.printf("%d/0=%d%n",ab,(ab/0)); ArithmeticException case if divided by 0
    }
}
