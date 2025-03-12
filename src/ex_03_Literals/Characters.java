package ex_03_Literals;

public class Characters {

    public static void main(String[] args) {

        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
        //char c2 = "A"; // this is not a char, it is string
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space


        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

//        System.out.println("SeleniumJava");
        System.out.println("Selenium"+new_line+"Java");
        System.out.println("Selenium"+tab_line+"Java");
        System.out.println("Selenium"+back_space+"Java");
        System.out.println("Selenium"+carriage_return+"Java");
        System.out.println("ABC\nxyz\nDef");

        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65
        System.out.println(c10);

    }
}
