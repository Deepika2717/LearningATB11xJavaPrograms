package ex_04_Strings;

public class String_Interview {
    public static void main(String[] args) {
        String A1 = "jay"; // will be created in static class pool
        String A2 = "jay"; // will be created in static class pool
        String A3 = new String("jay"); // will be created in object area

        System.out.println(A1 == A3); //False as A1 & A3 are created through different ways
        System.out.println(A1 == A2); // True as A1 & A2 falls under same area
        System.out.println(A2.equals(A3)); // True, as content is same


    }
}
