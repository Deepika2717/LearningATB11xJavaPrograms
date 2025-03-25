package ex_04_Strings;

public class append_reverse_Stringbuffer {
    public static void main(String[] args) {
        StringBuffer stringbuffer = new StringBuffer("Jay");
         stringbuffer.append("Razz");
        System.out.println(stringbuffer);

        StringBuffer stringbuffer1 = new StringBuffer("Razz");
        System.out.println(stringbuffer1.reverse());


    }
}
