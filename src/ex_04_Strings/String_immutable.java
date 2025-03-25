package ex_04_Strings;

public class String_immutable {

    public static void main(String[] args) {
        String name = "deepika";
        name.toUpperCase(); // DEEPIKA
        System.out.println(name);
        // OUTPUT DOESN'T CHANGE TO UPPERCASE, because result is not assigned.
    }
}
