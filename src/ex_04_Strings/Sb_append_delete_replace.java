package ex_04_Strings;

public class Sb_append_delete_replace {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" all!");
        System.out.println(sb);
        sb.delete(5,8);
        System.out.println(sb);
        sb.replace(5,10,"oww KR");
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer("Web");
        sb1.insert(3,"Automation");
        System.out.println(sb1);
        System.out.println(sb1.capacity());

    }
}
