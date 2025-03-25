package ex_04_Strings;

import java.sql.SQLOutput;

public class Stringcreation_Sbuilder_sbuffer {
    public static void main(String[] args) {
        String name = "Jay";
        String name1 = new String("Jay");

        StringBuilder stringbuilder = new StringBuilder("Jay");
        StringBuffer stringbuffer = new StringBuffer("Jay");

        System.out.println(name);
        System.out.println(name1);
        System.out.println(stringbuilder);
        System.out.println(stringbuffer);
    }
}
