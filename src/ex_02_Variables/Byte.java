package ex_02_Variables;

public class Byte {
    public static void main(String[] args) {

        byte b = 9;
        b = 10+1;

       // byte c = 129; cannot give 129 as the range is between -127 to 128
        byte d = 127;

        int age= 50;
        age= age+5;
        age=65;
        System.out.println(b);
        System.out.println(age);
       // System.out.println(c); cannot give 129 as the range is between -127 to 128
        System.out.println(d);
    }
}
