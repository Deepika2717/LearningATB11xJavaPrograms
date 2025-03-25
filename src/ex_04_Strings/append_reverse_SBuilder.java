package ex_04_Strings;

public class append_reverse_SBuilder {
    public static void main(String[] args) {
        StringBuilder stringbuilder = new StringBuilder("Deepika");
        stringbuilder.append('R');

        System.out.println(stringbuilder);

        StringBuilder sb = new StringBuilder("Deepika");
        System.out.println(sb.reverse());
    }
}
