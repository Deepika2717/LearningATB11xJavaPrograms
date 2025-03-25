package ex_04_Strings;

public class String_Functions {
    public static void main(String[] args) {
        char D = 'j'; // Character stores single value
        String D1 = "Jay"; // String stores sequence of characters

        System.out.println(D1.toUpperCase());
        System.out.println(D1.toLowerCase());
        System.out.println(D1.length());
        System.out.println(D1.concat("Razz"));
        System.out.println(D1.contains("Razz"));
        System.out.println(D1.equals("jay"));
        System.out.println(D1.equalsIgnoreCase("Jay"));
        System.out.println(D1.indexOf('y')); // index starts from 0

        String D2 = "mom";
        System.out.println(D2.indexOf('m')); // always fetches the first letter if letters are repeated in a word.
        System.out.println(D2.lastIndexOf('m')); // last index fetches the letter from the end.
        System.out.println(D2.replace('m','M'));
        System.out.println(D2.compareTo("Jay"));

        String D3 = "program";
        System.out.println(D3.substring(2,6));
        System.out.println(D3.startsWith("g"));
        System.out.println(D3.endsWith("m"));

        String D4 = "Program@java@Strings";
        String[] split = D4.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        String D5 = "  Jaya Deepika";
        System.out.println(D5.trim()); // trim will basically cut the extra spaces before and after

    }
}
