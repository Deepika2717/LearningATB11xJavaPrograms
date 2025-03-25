package Increment_Decrement_Task;

public class Vowels_Consonants {
    public static void main(String[] args) {
        //Count vowels(a,e,i,o,u) and consonants in a String. → pramod, → vowels - 2, consonants - 4

        String name = "Deepika R";
        int vowels =0;
        int consonants =0;

        name = name.toLowerCase();
        System.out.println(name);

       //System.out.println(name.length());

for(int i=0; i<name.length(); i++) {
char ch = name.charAt((i));
    if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u')
    {
        vowels++;
    }
else {
    consonants++;
    }
    System.out.println("No.of vowels:" + vowels);
    System.out.println("No.of consonants:" + consonants);
}
    }

    }

